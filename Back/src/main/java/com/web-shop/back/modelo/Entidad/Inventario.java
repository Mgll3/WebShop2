package com.webshop.back.modelo.Entidad;

import com.webshop.back.modelo.DTO.InventarioDTO;

import jakarta.persistence.*;
import lombok.Getter;


@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter 
    private Long id;
    @Getter 
    private int cantidad;

    public Inventario(InventarioDTO inventarioDTO) {
        this.id = inventarioDTO.getId();
        this.cantidad = inventarioDTO.getCantidad();
    }

    public Inventario(Long id,  int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Inventario() {
    }

    public InventarioDTO crearDto(){
        return new InventarioDTO(this.id,  this.cantidad);
    }
}
