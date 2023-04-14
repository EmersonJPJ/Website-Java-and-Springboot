package com.tienda.dao;

/**
 *
 * @author emers
 */

import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario,Long> {
 
    Usuario findByUsername(String username);
}
