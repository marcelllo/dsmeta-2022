package com.marcelo.dsmeta.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.dsmeta.entities.Sale;
import com.marcelo.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public List<Sale> findSales() {
        return saleService.findSales();
    }

}