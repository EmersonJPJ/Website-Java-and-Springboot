package com.tienda.dao;

import com.tienda.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface ArticuloDao extends JpaRepository<Articulo,Long>{
    
    
}
