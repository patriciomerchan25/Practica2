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
public class Grupo {
    
    private int codigo;
    private String nombre;
    private int cupo;

    public Grupo(int codigo, String nombre, int cupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupo = cupo;
    }
    
    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String combre) {
        this.nombre = combre;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCupo() {
        return cupo;
    }

    @Override
    public String toString() {
        return "Grupo{" + "codigo=" + codigo + ", nombre=" + nombre + ", cupo=" + cupo + '}';
    }
    
    
    
    
}
