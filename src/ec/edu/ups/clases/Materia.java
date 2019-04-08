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
public class Materia {
    
    private int codigo;
    private String nombreM;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private Grupo grupo;
    

    public Materia(int codigo, String nombreM, int numeroCreditos, int numeroHoras, int nivel) {
        this.codigo = codigo;
        this.nombreM = nombreM;
        this.numeroCreditos = numeroCreditos;
        this.numeroHoras = numeroHoras;
        this.nivel = nivel;
       
      
    }
    
    public Materia(int codigoG,String nombreG,int cupo){
        grupo=new Grupo(codigoG, nombreG, cupo);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreM() {
        return nombreM;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public int getNivel() {
        return nivel;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombreM=" + nombreM + "\n numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras + "\n nivel=" + nivel + ", grupo=" + grupo + '}';
    }
      
   

    
    
}
