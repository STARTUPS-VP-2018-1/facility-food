/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.dominio;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author internet
 */
public class Fornecedor extends Usuario{
 
    private int id;
    private String nomeBarraca;
    private String nome;
    private String cnpj;
    private String usuario;
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeBarraca() {
        return nomeBarraca;
    }

    public void setNomeBarraca(String nomeBarraca) {
        this.nome = nomeBarraca;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public String getCnpj() {
        return cnpj;
    }

   public void setCnpj(String cnpj) {
        this.nome = cnpj;
    }

     public String getUsuario() {
        return usuario;
    }

   public void setUsuario(String usuario) {
        this.nome = usuario;
    }

     public String getSenha() {
        return senha;
    }

   public void setSenha(String senha) {
        this.nome = senha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.cnpj);
        hash = 29 * hash + Objects.hashCode(this.usuario);
        hash = 29 * hash + Objects.hashCode(this.senha);
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
}
