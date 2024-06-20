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
public class Smartphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operador operador1 = new Operador("Eduardo Xavier", "Honduras");
        Chip chip1 = new Chip(operador1, 123456789);

        Operador operador2 = new Operador("Pablo Zuniga", "Estados Unidos");
        Chip chip2 = new Chip(operador2, 987654321);

        Fabricante fabricante = new Fabricante("Marca X", "País X");
        SmartphoneI smartphonei = new SmartphoneI(fabricante, "Pro X", 256, 8, 4000, chip1, chip2);

        smartphonei.mostrarInformacion();
    }
    
}
