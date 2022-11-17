package com.marcelo.dsmeta.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.dsmeta.entities.Sale;
import com.marcelo.dsmeta.services.SaleService;
import com.marcelo.dsmeta.services.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService saleService;
    private final SmsService smsService;

    public SaleController(SaleService saleService, SmsService smsService) {
        this.saleService = saleService;
        this.smsService = smsService;
    }

    @GetMapping
    public Page<Sale> findSales(
        @RequestParam(value = "minDate", defaultValue = "") String minDate, 
        @RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
        Pageable pageable) {
        return saleService.findSales(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id) throws Exception {
        smsService.sendSms(id);
    }

}