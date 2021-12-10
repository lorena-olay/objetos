/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author lorena
 */
public class CuentaBancaria {

    private String numCuenta;
    private String nif;
    private String nomCLiente;
    private int saldoActual;
    private int interésAnual;//entre 0.1% y 3% 

    public CuentaBancaria() {
        this.numCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
    }

    public CuentaBancaria(String nif, String nomCLiente, int saldoActual, int interésAnual) {
        this.nif = nif;
        this.nomCLiente = nomCLiente;
        this.saldoActual = saldoActual;
        this.interésAnual = interésAnual;
    }

    /*
    Constructor parametrizado con NIF, nombre, saldo e interés. Genera el número de
    cuenta de igual forma que en el constructor por defecto. En este ejercicio, a la 
    hora de generar números de cuenta en ambos constructores, no se tendrá en cuenta que 
    se puedan generar números de cuenta repetidos, algo que evidentemente en la vida real no debería suceder.
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNomCLiente() {
        return nomCLiente;
    }

    public void setNomCLiente(String nomCLiente) {
        this.nomCLiente = nomCLiente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInterésAnual() {
        return interésAnual;
    }

    public void setInterésAnual(int interésAnual) {
        this.interésAnual = interésAnual;
    }

    /*
    Métodos get y set. Para el número de cuenta no hay método set, suponemos que un número de cuenta no 
    se puede cambiar una vez la cuenta está creada.
     */
    public void ingresarInteres() {
        this.saldoActual = saldoActual + (this.interésAnual * this.saldoActual);
    }

    /*
    ingresarIntereses(): aumenta el saldo de la cuenta, aplicando el interés anual [saldo = saldo + 
    (interés * saldo)].
     */
    public void ingresarDinero(double cantidad) {
        this.saldoActual = (int) (saldoActual + cantidad);
    }

    /*
    ingresarDinero(double cantidad): permite ingresar una cantidad en la cuenta.
     */
    public void retirarEfectivo(double cantidad) {
        if (this.saldoActual > 0) {
            this.saldoActual = (int) (saldoActual - cantidad);
        }
    }

    /*
    retirarEfectivo(double cantidad): permite sacar una cantidad de la cuenta (si hay saldo). Si no hay 
    saldo suficiente no se realiza la operación.
     */

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", nif=" + nif + ", nomCLiente="
                + nomCLiente + ", saldoActual=" + saldoActual + ", inter\u00e9sAnual=" + interésAnual + '}';
    }

    /*
    toString()

    Añade una clase de prueba, con el método main(), para probar la clase CuentaBancaria.

     */
    private String RandomStringUtils(String numCuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
