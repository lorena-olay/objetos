/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package N3_diseño_clases_relacionC;

/**
 *
 * @author lorena
 */
public class Linea {

    PuntoGeometrico puntoA;
    PuntoGeometrico puntoB;

    public Linea() {
        puntoA = new PuntoGeometrico();
        puntoB = new PuntoGeometrico();
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    
    public void mueveDerecha(double x){
        double z = this.puntoA.getX() + x;
        this.puntoA.setX(z);
        
    }
    
    public void mueveIzquierda(double x){
        x = puntoA.getX() - x;
    }
    
    
    /*

    mueveDerecha(double x)
    Desplaza la línea a la derecha a la distancia que se indique.

    mueveIzquierda(double x)
    Desplaza la línea a la izquierda a la distancia que se indique.

    mueveArriba(double y)
    Desplaza la línea hacia arriba a la distancia que se indique.

    mueveAbajo(double y)
    Desplaza la línea hacia abajo a la distancia que se indique.

    Métodos get y set.

    MostrarLinea()
    Permite mostrar información de la línea de la siguiente forma:
    [(puntoA),(puntoB)]. Por ejemplo: [(1.2),(1.5) , (2.2),(2.5)].

     */
}
