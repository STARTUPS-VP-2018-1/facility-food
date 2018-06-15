/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.repositorio;

import br.com.facilityfood.dominio.Cliente;
import br.com.facilityfood.dominio.Fornecedor;
import br.com.facilityfood.dominio.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {
    

    public static List<Produto> usuarioDBFake = new ArrayList<Produto>();
    public static List<Produto> produtoDBFake = new ArrayList<Produto>();
    public static List<Cliente> clienteDBFake = new ArrayList<Cliente>();
    public static List<Fornecedor> fornecedorDBFake = new ArrayList<Fornecedor>();
    
    static{
        Cliente novoCliente = new Cliente();
        novoCliente.setNomeUsuario("silvana");
        novoCliente.setSenha("5930");       
        
        Cliente novoCliente2 = new Cliente();
        novoCliente2.setNomeUsuario("carlos");
        novoCliente2.setSenha("4523");  
        
        Cliente novoCliente3 = new Cliente();
        novoCliente3.setNomeUsuario("guilherme");
        novoCliente3.setSenha("8602");  
        
        Cliente novoCliente4 = new Cliente();
        novoCliente3.setNomeUsuario("silvia");
        novoCliente3.setSenha("log05");
        
        Cliente novoCliente5 = new Cliente("maria","maria123");
        
        
        Fornecedor novoFornecedor = new Fornecedor();
        novoFornecedor.setNomeUsuario("sinoel");
        novoFornecedor.setSenha("batista");
        
        
        clienteDBFake.add(novoCliente);
        clienteDBFake.add(novoCliente2);
        clienteDBFake.add(novoCliente3);
        clienteDBFake.add(novoCliente4);
        clienteDBFake.add(novoCliente5);
        fornecedorDBFake.add(novoFornecedor);
    }
    
}
