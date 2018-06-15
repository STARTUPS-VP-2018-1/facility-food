/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facilityfood.util;

/**
 *
 * @author internet
 */
public class Util {
    
    
    public static boolean validaUsuario(String usuario){
        if(usuario.contains("@")){
            return false;
        }       
        return true;
    }
    
}
