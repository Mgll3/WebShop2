package com.webshop.back.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.back.modelo.Entidad.Inventario;

public interface InventarioDAO extends JpaRepository<Inventario, Long>{
    
}
