/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.test;

import br.com.facilityfood.business.ClienteBusiness;
import br.com.facilityfood.business.interfaces.ClienteInterface;
import br.com.facilityfood.dominio.Cliente;
import java.util.ArrayList;

/**
 *
 * @author internet
 */
public class ClienteBusinessMock {
    
    public static void main(String[] args){
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("silvana");
        novoCliente.setSobrenome("5930");
        
        
        ClienteInterface clienteBusiness = new ClienteBusiness(); 
        
        Cliente segundoNovoCliente = null;
        try{
            clienteBusiness.salvarCliente(novoCliente);
            clienteBusiness.salvarCliente(segundoNovoCliente);
        }catch(UnsupportedOperationException exc){
            System.out.println(exc.getMessage());
        }        
                
    }    
}
