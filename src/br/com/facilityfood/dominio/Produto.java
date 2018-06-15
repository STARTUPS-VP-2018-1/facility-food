/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.dominio;

import java.util.Objects;
import javax.swing.JLabel;

/**
 *
 * @author internet
 */
public class Produto {
    
    private int id;
    private String quantidadeProduto;
    private String refrigerante;
    private String lanche;
    private String pizza;

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }
    
    
    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getFabricante() {
        return refrigerante;
    }

    public void setFabricante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
    
  

  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.quantidadeProduto);
        hash = 17 * hash + Objects.hashCode(this.refrigerante);
        hash = 17 * hash + Objects.hashCode(this.lanche);
        hash = 17 * hash + Objects.hashCode(this.pizza);  
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.quantidadeProduto, other.quantidadeProduto)) {
            return false;
        }
        if (!Objects.equals(this.refrigerante, other.refrigerante)) {
            return false;
        }
        return true;
    }

    public void getRefrigerante(JLabel jLabel5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
        
}
