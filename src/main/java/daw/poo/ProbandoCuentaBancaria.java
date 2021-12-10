/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author lorena
 */
public class ProbandoCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta1;
        CuentaBancaria numCuenta1;
        cuenta1 = new CuentaBancaria("X32109491", "Paula", 900, 1);
        numCuenta1 = new CuentaBancaria();
        System.out.println("NIF de la cuenta: " + cuenta1.getNif() + " Numero de cuenta: "
                + numCuenta1.getNumCuenta());

    }

}
