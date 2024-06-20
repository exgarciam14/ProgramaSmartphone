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
public class Chip {
    private Operador operador;
    public int numero;
    public Chip(Operador operador, int numero){
        this.numero=numero;
        this.operador=operador;
    }
    public Operador getOperador(){
        return operador;
    }
    public void setOperador(Operador operador){
        this.operador=operador;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
}
