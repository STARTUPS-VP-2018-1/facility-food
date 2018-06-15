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
public class Cliente extends Usuario{
    
    //Construtor default
    public Cliente(){
        
    }
    
    public Cliente(String nome, String senha){
       super.setNomeUsuario(nome);
       super.setSenha(senha);
    }
    
    private int id;
    private String nome;
    private String sobrenome;    
    private String cpf; 
   // private String usuario; 
   // private String senha; 

  //  public String getSenha() {
   //     return senha;
   // }

   // public void setSenha(String senha) {
   //     this.senha = senha;
  //  }

   // public String getUsuario() {
    //    return usuario;
    //}

    //public void setUsuario(String usuario) {
    //    this.usuario = usuario;
  //  }
    private List<String> emails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.sobrenome);
       // hash = 19 * hash + Objects.hashCode(this.senha);
       // hash = 19 * hash + Objects.hashCode(this.usuario);
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
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sobrenome, other.sobrenome)) {
            return false;
       }
      //  if (!Objects.equals(this.senha, other.senha)) {
      //      return false;
      //  }
      //  if (!Objects.equals(this.usuario, other.usuario)) {
     //       return false;
     //   }
        return true;
    }

    
}
       