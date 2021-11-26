/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

/**
 *
 * @author lorena
 */
/*
18.Declara y define una clase pública, llamada TestCajaCarton, sin atributos y 
con un solo método, el método main(). Esta clase pertenece también al paquete “daw.poo”.
Dentro del método main() de la clase TestCajaCarton declara dos objetos de tipo 
CajaCarton. Estos objetos se pueden llamar cajaGrande y cajaChica.
Instancia los objetos anteriores con los siguientes valores, usando el constructor y el operador new:
cajaGrande: ancho 250mm, alto 400mm, largo 500mm. Peso 200gr.
cajaChica: ancho 25mm, alto 30mm, largo 15mm. Peso 17gr.
Muestra los datos de las cajas creadas usando métodos get.

 */
/*
¿Qué características tiene un objeto?
¿Cómo se accede a los elementos (atributos/métodos) de un objeto?
¿Cómo se debe acceder a los atributos de un objeto: usando los atributos directamente o a través de sus métodos?
¿Qué pasa si objeto se declara pero no se instancia?
    */
public class NewMain{

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
