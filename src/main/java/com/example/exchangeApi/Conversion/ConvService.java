package com.example.exchangeApi.Conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConvService {

    @Autowired
    ConversionRepository conversionRepository;

    public List<Conversion> getAllConversions() {
        List<Conversion> conversions = new ArrayList<Conversion>();
        conversionRepository.findAll().forEach(conversion -> conversions.add(conversion));
        return conversions;
    }

    public Conversion getConversionById(int id) {
        return conversionRepository.findById(id).get();
    }

    public void saveOrUpdate(Conversion conversion) {
        conversionRepository.save(conversion);
    }

    public void delete(int id) {
        conversionRepository.deleteById(id);
    }
}
