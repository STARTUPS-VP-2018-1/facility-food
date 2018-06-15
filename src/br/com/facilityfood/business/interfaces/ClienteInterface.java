/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.business.interfaces;

import br.com.facilityfood.dominio.Cliente;
import br.com.facilityfood.dominio.Produto;
import br.com.facilityfood.dominio.Usuario;
import java.util.List;

/**
 *
 * @author internet
 */
public interface ClienteInterface {
       
    public Cliente salvarCliente(Cliente cliente);
    
    public Cliente buscarClientePorId(Integer id);
    
    public List<Cliente> buscarClientePorNome(String nome);
    
    public List<Cliente> buscarTodosClienteS();
    
    public Cliente buscarClientePorUsuario(Usuario usuario);
}
