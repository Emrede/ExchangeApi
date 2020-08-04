package com.example.exchangeApi.Conversion;

import com.example.exchangeApi.ExchangeRate.ExchangeRate;
import com.example.exchangeApi.ExchangeRate.ExchangeRateController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConversionController {

    @Autowired
    ConvService convService;

    @PostMapping("/convert")
    private double convert(@RequestParam(value = "from") String fr,
                           @RequestParam(value = "to") String to,
                           @RequestParam(value = "amount") Double amount) {

        double rate = ExchangeRateController.getExchange(fr, to);
        Conversion conversion = new Conversion(fr, to, amount);
        double result = rate * amount;
        conversion.setResult(result);

        convService.saveOrUpdate(conversion);
        return conversion.getResult();
    }

    @GetMapping("/conversion-list")
    private List<Conversion> getAllConversions() {
        return convService.getAllConversions();
    }

    @GetMapping("/conversion/{id}")
    private Conversion getConversion(@PathVariable("id") int id) {
        return convService.getConversionById(id);
    }
}
