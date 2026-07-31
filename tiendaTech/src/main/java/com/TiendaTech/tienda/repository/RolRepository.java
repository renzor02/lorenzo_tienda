package com.TiendaTech.tienda.repository;

import com.TiendaTech.tienda.domain.Rol;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    
    public Optional<Rol> findByRol(String rol);
    
}