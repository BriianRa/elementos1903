/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Servicios Especiales
 */
public class Cliente {
    
    @Id
    private Integer id;
    
    private String Nombre;
    private String email;


public Cliente(Integer id,String nombre,String email){
  this.id = id;
  this.Nombre = nombre;
  this.email = email;
}
public Cliente(){
    
}
      public void Id(){
      
      }
    
      public void Nombre(){
      
      }
      public void email(){
      
      }
}
