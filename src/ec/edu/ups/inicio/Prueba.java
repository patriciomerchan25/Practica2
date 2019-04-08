/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.inicio;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author Usuario-Pc
 */
public class Prueba {

    
    
    public static void main(String[] args) {
        
        //Instanciamos la clase Grupo y creamos  2 grupos
        
        Grupo grupo=new Grupo(1,"Grupo 1", 30);
        Grupo grupo2=new Grupo(1, "Grupo 2", 31);
        
        
        //Instanciamos materia y creamos 6 materias
        Materia programacion=new Materia(1, "programacion", 2, 5, 2);
        Materia sitemasOperativos=new Materia(2, "sitemasOperativos", 23, 6, 6);
        Materia matematica=new Materia(3, "matematica", 2, 5, 5);
        Materia ingles=new Materia(4, "ingles", 5, 7, 1);
        Materia estructura=new Materia(5, "estructura de datos", 2, 5, 3);
        Materia logica=new Materia(6, "programacion", 2, 5, 2);
        
        //Agregamos grupo a la materia
        ingles.setGrupo(grupo);
        matematica.setGrupo(grupo2);
        
        
         //Istaciamos las carrerra y creamos 3 carreras
        Carrera mecatronica=new Carrera(1, "mecatronica", 2, 40, "ing mecatronica");
        Carrera computacion=new Carrera(2, "Computacion", 4, 30, "ing ciencias computacion");
        Carrera telecomunicacion=new Carrera(3, "Telecomunicacion", 5, 32, "ing Telecomunicacion");
        
        //Agregamos materia a carrera
        computacion.agregarMaterias(matematica);
        computacion.agregarMaterias(ingles);
        
        //Istaciamos la clase Sede y creamos 1 sede
        Sede sedeCuenca=new Sede(1, "sede CUENCA", "cuenca", "32423423");
         sedeCuenca.agregarCarrera(computacion);
        System.out.println(sedeCuenca);
       
        
        
     
      
     //Instanciamos la clase Profesor y creamos 2 profesores
     
        Profesor pro1=new Profesor("ing sistemas", 300.5, "director", 1, "Marco Reus", "0107233455", "354223", "cuenca", "marcoR1@mail.com");
        Profesor pro2=new Profesor("ing ambiental", 300, "profesor", 2, "luis Valencia", "0107233455", "354223", "cuenca", "Luis12@mail.com");
        
        
        //Instanciamos la clase Estudinate y creamos 4 estudiantes 
        Estudiante est=new Estudiante(mecatronica, 1, "Fernando Gutirres", "0107234577", "234552343", "el Valle", "fernandogutierres@hotmail.com");
        Estudiante est2=new Estudiante(computacion, 2, "luis  Gonzales", "0100453546", "3453442", "Paute", "luis@gmail.com");
        Estudiante est3=new Estudiante(telecomunicacion, 3, "alberto morocho", "0205774509", "8545546745", "Ricaute", "");
        Estudiante est4=new Estudiante(mecatronica,4, "Juan Ferbandez", "0724326601", "12345742134", "Quito", "juan@gmail.com");
       
        
       
        
        
        
        
       
    }
}
