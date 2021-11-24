/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.poo;

/**
 *
 * @author LOREN
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CajaCarton cajaGrande;
        CajaCarton cajaChica;
        cajaGrande = new CajaCarton(250, 400, 500, 200);
        cajaChica = new CajaCarton(25, 30, 15, 70);
        System.out.print("Datos :" + cajaGrande.getAlto() + cajaChica.getAncho());

    }

}
