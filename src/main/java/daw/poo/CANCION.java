/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;
/*
* 10.  Desarrolla una clase *Cancion* con los siguientes atributos:

- *titulo*: una variable String que guarda el título de la canción.
- *autor*: una variable String que guarda el autor de la canción.

y los constructores por defecto (inicializando a cadenas vacías) y parametrizado,
* así como métodos get, set y toString. En una clase de prueba, con el método main(),
* crea un par de objetos y prueba los métodos get, set y toString.
* */
/**
 *
 * @author lorena
 */
public class CANCION {
    private String titulo;
    private String autor;

    public CANCION() {
    }

    public CANCION(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "CANCION{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
