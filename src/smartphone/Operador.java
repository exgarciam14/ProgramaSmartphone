/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

/**
 *
 * @author Usuario
 */
public class Operador {
    public String nombre;
    public String pais;
    
    public Operador(String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais=pais;
    }
}
