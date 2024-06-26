package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author emers
 */
public interface CategoriaService {
    
    //Obtiene la lista de registros de la tabla categoria
    //y lo coloca en una lista de objetos categoria
    public List<Categoria> getCategorias(boolean activos);
    
    //Obtiene el registro de la tabla categoria
    //que tiene el idCategoria pasado por el objeto categoria.
    public Categoria getCategoria(Categoria categoria);
    
    //Elimina el registro de la tabla categoria
    //que tiene el idCategoria pasado por el objeto categoria
    public void deleteCategoria(Categoria categoria);  
    
    //Si el idCategoria pasado no existe o es nulo se crea un registro
    //nuevo en la tabla categoria, si el idCategoria existe, se actualiza
    //la informacion
    public void saveCategoria(Categoria categoria);
}
