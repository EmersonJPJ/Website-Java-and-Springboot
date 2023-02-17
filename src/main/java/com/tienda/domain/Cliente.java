package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


/**
 *
 * @author emers
 */
@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {   
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    
}