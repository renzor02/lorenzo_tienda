package com.TiendaTech.tienda.repository;


import com.TiendaTech.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    public List<Categoria> findByActivoTrue();
 
}
 