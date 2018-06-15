/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.business;

import br.com.facilityfood.business.interfaces.FornecedorInterface;
import br.com.facilityfood.dominio.Fornecedor;
import br.com.facilityfood.dominio.Usuario;
import br.com.facilityfood.repositorio.Repositorio;
import java.util.List;

public class FornecedorBusiness implements FornecedorInterface{

    @Override
    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        Repositorio.fornecedorDBFake.add(fornecedor);                
        return fornecedor;
    }

    @Override
    public Fornecedor buscarFornecedorPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> buscarFornecedorPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> buscarTodosFornecedores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fornecedor buscarFornecedorPorUsuario(Usuario usuario) {
        for(Fornecedor fornecedor: Repositorio.fornecedorDBFake){
            if(fornecedor.getNomeUsuario().equals(usuario.getNomeUsuario())){
               return fornecedor; 
            }                      
        }
        return null;
    }
    
}
