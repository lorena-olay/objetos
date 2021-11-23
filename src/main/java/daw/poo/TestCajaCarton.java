/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

import CajaCarton.;

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
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main() {
        // TODO code application logic here
        CajaCarton cajaGrande;
        CajaCarton cajaChica;
        cajaGrande = new CajaCarton();
        cajaChica = new CajaCarton();
        
    }
    
}
