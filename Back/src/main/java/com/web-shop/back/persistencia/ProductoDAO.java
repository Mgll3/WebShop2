package com.webshop.back.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.back.modelo.Entidad.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long> {
    
}
