/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Usuario-Pc
 */
public class Persona {
    
    public Persona(){
        
    }

    public Persona(int codigo) {
        this.codigo = codigo;
    }

    public Persona(int codigo, String nombre, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    

    public Persona(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        
    }

    

    

private  int codigo;
private String nombre;
private String cedula;
private String telefono;
private String direccion;
private String correo;


//set

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

   
    
    


    
}
