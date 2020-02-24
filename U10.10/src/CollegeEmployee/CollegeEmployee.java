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
public class CollegeEmployee extends person{
    
    private int nss;
    private int depa;
    private int salario;
    
    public void setUniversidad(int nss,
                                  int salario,
                                     int depa){
        
        this.nss = nss;
        this.salario = salario;
        this.depa = depa;

    }
    public String toString() {
        return "Null";
    }

    
}