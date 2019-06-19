/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Servicios Especiales
 */
@RestController
@RequestMapping("/api")
public class ControladorProfesor {
    
    //METODO PARA GUARDAR 
    @Autowired 
     RepoProfesor repoProfe; //atributo
    @PostMapping("/profesor")
    public Estatus guardar(@RequestBody String json)throws Exception{
        
        //Primero vamos a recibir el JSON del cliente 
        //a un objeto java con la clase OBJECT MAPPER
   
        ObjectMapper maper=new ObjectMapper();
        
        //ahora si lo leemos
        
       Profesor profe= maper.readValue(json,Profesor.class);
       
       repoProfe.save(profe);
        // Generamos el status
       Estatus e=new Estatus();
       e.setMensaje("Profe guardado con exito");
               e.setSuccess(true);
               
               
       return e;
    

    }
    
    //BUSCAR TODO
 
    @GetMapping("/profesor")
    public List<Profesor>buscarTodos(){
        
        return repoProfe.findAll();
    }
    
    //BORRAR
    
    @DeleteMapping("/Profesor/{id}")
    public Estatus borrar(@PathVariable Integer id){
    
    repoProfe.deleteById(id);
    Estatus e=new Estatus();
    e.setSuccess(true);
    e.SetMensaje("Profesor Borrado con Exito");
    
    return e;
    }
    //ACTUALIZAR 
    
    @PutMapping("/profesor")
    public Estatus actualizar(@RequestBody String json)throws Exception{
    
    //Primero vamos a recibir el JSON del cliente 
         //a un objeto java con la clase OBJECT MAPPER
   
        ObjectMapper maper=new ObjectMapper();
        
        //ahora si lo leemos
        
       Profesor profe= maper.readValue(json,Profesor.class);
       
       repoProfe.save(profe);
        // Generamos el status
       Estatus e=new Estatus();
       e.setMensaje("Profe guardado con exito");
       e.setSuccess(true);
               
               
       return e;
   
    }
    



    //BUSCAR POR ID
    
    @GetMapping("/Profesor/{id}")
    
    public Profesor buscarPorId(@PathVariable Integer id){


    return repoProfe.findById(id).get();
        

        }

    }    

