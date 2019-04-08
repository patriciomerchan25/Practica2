/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario-Pc
 */
public class Carrera {
   
    private int codigo;
    private String nombre;
    private int numeroSemestre;
    private int  numeroEstudiante;
    private String titulo;
    private List<Materia>materias;
    

    public Carrera(int codigo, String nombre, int numeroSemestre, int numeroEstudiante, String titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroSemestre = numeroSemestre;
        this.numeroEstudiante = numeroEstudiante;
        this.titulo = titulo;
        materias=new ArrayList<>();
        
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

   

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public String getTitulo() {
        return titulo;
    }
    
    //Creamos el metodo para agregar materias desde la clase Materia.
    public void agregarMaterias(Materia materia){
        materias.add(materia);
        
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + "\n numeroSemestre=" + numeroSemestre + ", numeroEstudiante=" + numeroEstudiante + "\n titulo=" + titulo + ", materias=" + materias + '}';
    }
    
    
    
}
