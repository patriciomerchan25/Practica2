/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Usuario-Pc
 */
public class Sede {
    
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Carrera>carreras;

    public Sede(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        carreras=new ArrayList<>();
    }
    
    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // Este metodo tine la funcion para agregar carrera  desde la clase Carrera.
 public void agregarCarrera(Carrera carrera ){
     carreras.add(carrera);
 }  

    @Override
    public String toString() {
        return "Sede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", carreras=" + carreras + '}';
    }
    
    
    
}
