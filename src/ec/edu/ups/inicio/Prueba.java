/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.inicio;

import ec.edu.ups.clases.Estudiante;

/**
 *
 * @author Usuario-Pc
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Estudiante est=new Estudiante();
        est.setCodigo(1);
        est.setNombre("juan");
        est.setCedula("0107233209");
        est.setTelefono("2323423");
        est.setDireccion("cuenca");
        est.setCorreo("luan@gmail.com");
        
        System.out.println(est);
       
    }
}
