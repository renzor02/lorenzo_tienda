package com.TiendaTech.tienda.repository;

import com.TiendaTech.tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer>{
    
}