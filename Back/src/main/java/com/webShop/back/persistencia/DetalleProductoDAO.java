package com.webshop.back.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.back.modelo.Entidad.DetalleProducto;

public interface DetalleProductoDAO extends JpaRepository<DetalleProducto, Long> {
    
}
