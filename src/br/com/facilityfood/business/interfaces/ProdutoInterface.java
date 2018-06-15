/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.business.interfaces;
import br.com.facilityfood.dominio.Produto;
import java.util.List;

public interface ProdutoInterface {
    
    public Produto salvarProduto(Produto produto);
    
    public Produto buscarProdutoPorId(Integer id);
    
    public List<Produto> buscarProdutoPorNome(String nome);
    
    public List<Produto> buscarTodosProdutos();
}
