package com.webshop.back.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.back.modelo.Entidad.Categoria;


public interface CategoriaDAO extends JpaRepository<Categoria, Long>{
    
}
