/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
Crea un nuevo proyecto llamado “intropoo”, dentro del proyecto crea un paquete 
llamado “daw.poo” y dentro del paquete implementa la clase “CajaCarton”: 
Añade los siguientes atributos private: ancho, alto, largo y peso. Las dimensiones 
se expresan en milímetros y el peso en gramos.
Completa la definición de la clase anterior, incluyendo los métodos getters y setters.
Añade, dentro de la definición de la clase anterior, un método constructor con parámetros s
imilar al de la clase Vehiculo de los apuntes.
Incluye dos métodos públicos que no devuelven valor y no tienen parámetros, 
llamados abrir() y cerrar(). Estos métodos no hacen nada, su cuerpo estará vacío.

 */
package daw.poo;

class CajaCarton {

    // VARIABLES DE CLASE
    private int ancho;
    private int alto;
    private int largo;
    private int peso;

    // CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
    public CajaCarton(int ancho, int alto, int largo, int peso) {
        //mm
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        //gr
        this.peso = peso;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPeso() {
        return largo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void abrir() {

    }
    
    public void cerrar() {

    }
    
}

/**
 *
 * @author lorena
 */

