/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.business.interfaces;

import br.com.facilityfood.dominio.Fornecedor;
import br.com.facilityfood.dominio.Usuario;
import java.util.List;

/**
 *
 * @author internet
 */
public interface FornecedorInterface {
    
    public Fornecedor salvarFornecedor(Fornecedor fornecedor);
    
    public Fornecedor buscarFornecedorPorId(Integer id);
    
    public List<Fornecedor> buscarFornecedorPorNome(String nome);
    
    public List<Fornecedor> buscarTodosFornecedores();
    
    public Fornecedor buscarFornecedorPorUsuario(Usuario usuario);
}
