import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        inicializar();

    }
    public static void inicializar() {
        ArrayList <Cafe> cafes = new ArrayList<>();
        ArrayList <String> RRSS =  new ArrayList<>();
        ArrayList <Alfajor> alfajores = new ArrayList<>();
        Cafeteria cafeteria1 = new Cafeteria("CafesiN", "Las ballenas, 1313",RRSS , cafes, alfajores);
        cafeteria1.agregarRRSS("instaaaaa");
        cafeteria1.agregarRRSS("facebook");
        System.out.println(cafeteria1);   // se imprime la cafeteria, sin los cafes, solo sus datos y Redes sociales

        cafeteria1.buscarCafePorNombre("Arabigo");      // se busca un cafe, pero como no hay cafes, nos avisa
        cafeteria1.agregarCafe("Arabigo", 20, 50, "Chico"); // se agrega cafe
        System.out.println(cafeteria1);
        cafeteria1.agregarCafe("Irlandes", 10, 70, "Grande");  //se agrega cafe
        System.out.println(cafeteria1);

        cafeteria1.buscarCafePorNombre("Arabigo");   // se busca en los cafes existentes
        cafeteria1.buscarCafePorNombre("irlandes");   // se puede buscar sin necesidad de un mayuscula al principio
        cafeteria1.buscarCafePorNombre("cafecafe");   //nos arroja que no esta ese cafe

        cafeteria1.eliminarCafePorNombre("irlandes");
        cafeteria1.eliminarCafePorNombre("arabiccccco");   // se intenta borrar pero no esta ese cafe
        cafeteria1.eliminarCafePorNombre("arabiGO");     // a pesar de mayusculas desordenadas, lo borra
        System.out.println(cafeteria1);
        //------------------------------------------------------------------------
        System.out.println("--");
        //lista cafe esta vacia desde aqui
        System.out.println(cafeteria1);
        cafeteria1.agregarAlfajor("manjar", "Chico", "Alemania");
        System.out.println(cafeteria1);
        cafeteria1.buscarAlfajorPorSabor("Manjar");
        cafeteria1.buscarAlfajorPorSabor("aaaaa");
        cafeteria1.eliminarAlfajorPorSabor("manjar");
        System.out.println(cafeteria1);
    }

}
