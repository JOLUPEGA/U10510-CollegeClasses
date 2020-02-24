/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeEmployee;

/**
 *
 * @author Jose Luis Perez
 */
public class person{
    
    private int cp;
    private int telefono;
    private String nombre;
    private String apellido;
    private String direccion;
    
    public void setAll(String nombre,
                             String apellido,
                                   String direccion,
                                         int cp,
                                            int telefono){
        this.cp = cp;
        this.nombre = nombre;
        this.telefono = telefono;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String toString() {
        return "Null";
    }
    
}
