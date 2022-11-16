package com.marcelo.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelo.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
