package com.tienda.services;

import com.tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author emers
 */
public interface ClienteService {
    
    //Obtiene la lista de registros de la tabla cliente
    //y lo coloca en una lista de objetos cliente
    public List<Cliente> getClientes();
    
    //Obtiene el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cliente.
    public Cliente getCliente(Cliente cliente);
    
    //Elimina el registro de la tabla cliente
    //que tiene el idCliente pasado por el objeto cliente
    public void deleteCliente(Cliente cliente);  
    
    //Si el idCliente pasado no existe o es nulo se crea un registro
    //nuevo en la tabla cliente, si el idCliente existe, se actualiza
    //la informacion
    public void saveCliente(Cliente cliente);
}
