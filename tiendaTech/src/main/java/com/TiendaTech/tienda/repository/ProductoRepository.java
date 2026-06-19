package com.TiendaTech.tienda.repository;

import com.TiendaTech.tienda.domain.Producto;
import java.util.List;
import org. springframework.data. jpa. repository. JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    public List<Producto> findByActivoTrue ();

}