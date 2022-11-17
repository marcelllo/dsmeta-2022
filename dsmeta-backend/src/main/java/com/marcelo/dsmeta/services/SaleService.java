package com.marcelo.dsmeta.services;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marcelo.dsmeta.entities.Sale;
import com.marcelo.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
        
        LocalDate today = LocalDate.now();

        LocalDate min = minDate.isEmpty() ? today.minusYears(1) : LocalDate.parse(minDate);
        LocalDate max = maxDate.isEmpty() ? today : LocalDate.parse(maxDate);

        return saleRepository.findSales(min, max, pageable);
    }
}
