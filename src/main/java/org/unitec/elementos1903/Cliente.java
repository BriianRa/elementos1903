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
   Integer id;
    
  String nombre;
 String email;

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", Nombre=" + nombre + ", email=" + email + '}';
    }

public Cliente(Integer id,String nombre,String email){
  this.id = id;
  this.nombre = nombre;
  this.email = email;
}
public Cliente(){
    
}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getEmail() {
        return email;
    }     

    public void setEmail(String email) {
        this.email = email;
    }


}
