/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.test;

import br.com.facilityfood.business.ClienteBusiness;
import br.com.facilityfood.business.FornecedorBusiness;
import br.com.facilityfood.business.LoginBusiness;
import br.com.facilityfood.business.interfaces.ClienteInterface;
import br.com.facilityfood.business.interfaces.FornecedorInterface;
import br.com.facilityfood.business.interfaces.LoginInterface;
import br.com.facilityfood.dominio.Usuario;
import br.com.facilityfood.util.Util;
import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class LoginMock {
    
    public static void main(String agrs[]){
        
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNomeUsuario("silvana");
        novoUsuario.setSenha("5930");
        novoUsuario.setFornecedor(true);
      
        
        if(!Util.validaUsuario(novoUsuario.getNomeUsuario())){
            JOptionPane.showMessageDialog(null, "Usuario Inválido");
        }
               
        LoginInterface loginBusiness = new LoginBusiness();
        ClienteInterface clienteBusiness = new ClienteBusiness();
        FornecedorInterface fornecedorBusiness = new FornecedorBusiness();
        
        
        if(loginBusiness.validaUsuario(novoUsuario)){
            if(clienteBusiness.buscarClientePorUsuario(novoUsuario)!=null){
                JOptionPane.showMessageDialog(null, "Usuario é um Cliente!");
            }
            if(fornecedorBusiness.buscarFornecedorPorUsuario(novoUsuario)!=null){
                JOptionPane.showMessageDialog(null, "Usuario é um Fornecedor!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
        }
    }
}




