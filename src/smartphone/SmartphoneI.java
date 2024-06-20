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
public class SmartphoneI {
    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private int tamanioBateria;
    private Chip chip1;
    private Chip chip2;
    public SmartphoneI(Fabricante marca,String modelo,int almacenamiento,
    int ram,int tamanioBateria,Chip chip1,Chip chip2){
        this.marca=marca;
        this.modelo=modelo;
        this.almacenamiento=almacenamiento;
        this.ram=ram;
        this.tamanioBateria=tamanioBateria;
        this.chip1=chip1;
        this.chip2=chip2;
    }
    public Fabricante getMarca(){
        return marca;
    }
    public void setMarca(Fabricante marca){
        this.marca=marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public int getAlmacenamiento(){
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento=almacenamiento;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public int getTamanioBateria(){
        return tamanioBateria;
    }
    public void setTamanioBateria(int tamanioBateria){
        this.tamanioBateria=tamanioBateria;
    }
    public Chip getChip1(){
        return chip1;
    }
    public void setChip1(Chip chip1){
        this.chip1=chip1;
    }
    public Chip getChip2(){
        return chip2;
    }
    public void setChip2(Chip chip2){
        this.chip2=chip2;
    }
    public void mostrarInformacion(){
        System.out.println("Marca: " + marca.getNombre());
        System.out.println("País del fabricante: " + marca.getPais());
        System.out.println("Modelo: " + modelo);
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Tamaño de Batería: " + tamanioBateria + " mAh");
        System.out.println("Chip 1 - Operador: " + chip1.getOperador().getNombre());
        System.out.println("Chip 1 - Número: " + chip1.getNumero());
        System.out.println("Chip 2 - Operador: " + chip2.getOperador().getNombre());
        System.out.println("Chip 2 - Número: " + chip2.getNumero());
    }
}
