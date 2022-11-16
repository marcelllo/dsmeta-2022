package com.marcelo.dsmeta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marcelo.dsmeta.entities.Sale;
import com.marcelo.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> findSales() {
        return saleRepository.findAll();
    }
}
