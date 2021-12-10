/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package N3_diseño_clases_relacionC;

/**
 *
 * @author lorena
 */
public class probarPuntoGeometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntoGeometrico cosa1;
        PuntoGeometrico cosa2;
        cosa1 = new PuntoGeometrico(2, 5);
        cosa2 = new PuntoGeometrico();
        cosa2.setX(5);
        System.out.println(cosa2.getX());
        System.out.println(cosa1.getX());
    }

}
