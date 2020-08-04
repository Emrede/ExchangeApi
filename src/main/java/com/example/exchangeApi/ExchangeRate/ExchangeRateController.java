package com.example.exchangeApi.ExchangeRate;

import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;
@RestController
public class ExchangeRateController {
    private static final String template = "%s";

    @GetMapping("/exchange")
    public Object exchangeAPI(@RequestParam(value = "from") String fr,
                              @RequestParam(value = "to") String to){

        return getExchange(fr,to);
    }

    public static double getExchange(String fr, String to){
        ExchangeRate exchange = new ExchangeRate(fr, to);

        RestTemplate restTemplate = new RestTemplate();
        String result =
                restTemplate.getForObject(
                        "https://api.ratesapi.io/api/latest?base=" + fr + "&symbols=" + to,
                        String.class
                );
        JSONObject json = null;
        String rt = new String();
        Double rate = null;
        try {
            json = new JSONObject(result);
            rt = json.getJSONObject("rates").getString(to);
            rate = Double.parseDouble(rt); //Convert to Double
        } catch (JSONException e) {
            rt = "Failed.";
            e.printStackTrace();
        }
        return rate;
    }
}
