package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner {

    @Autowired
    RepoCliente repoCliente;
    
	public static void main(String[] args) {
		SpringApplication.run(Elementos1903Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
       // repoCliente.save(new Cliente(1,"El gato","brianramirez484@gmail.com"));
       
      // repoCliente.save(new Cliente(2,"Elias","yo@gmail.com"));
       
       //BUSCAR TODOS !!!(for mejorado)
       
      // for(Cliente c: repoCliente.findAll()){
        //   System.out.println(c);
       // }
        
       
       //BUSCAR POR ID
       
       // System.out.println(repoCliente.findById(1));
        
        
        //Borramos y LUEGO VOLVEMOS A INSERTAR
        
      //  repoCliente.deleteById(2);
       
    }

}
