package daw.poo;

public class PRBOBARCANCION {
    public static void main(String[] args) {
    CANCION fall;
    CANCION hatersgonnahate;
    fall = new CANCION("Falling","HARRY STYLE");
    hatersgonnahate = new CANCION("22","TAYLOR QUEEN");
        System.out.println("NOMINADOS: " + fall.getAutor() + ", " + hatersgonnahate.getAutor());
        System.out.println(fall.toString());
    }
}
