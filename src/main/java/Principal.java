import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        inicializar();

    }
    public static void inicializar() {
        ArrayList <Cafe> cafes = new ArrayList<>();
        ArrayList <String> RRSS =  new ArrayList<>();
        Cafeteria cafeteria1 = new Cafeteria("CafesiN", "Las ballenas, 1313", RRSS, cafes);
        System.out.println(cafeteria1);
        cafeteria1.agregarCafe("Arabigo", 20, 50, "Chico");
        System.out.println(cafeteria1);
        cafeteria1.agregarCafe("Irlandes", 10, 70, "Grande");
        System.out.println(cafeteria1);
    }
    public static String validarTexto () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese solo texto");
        String texto = "";
        while (true){

        }
    }
}
