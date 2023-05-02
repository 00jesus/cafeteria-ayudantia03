import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    @Test
    void agregarRRSS() {
        ArrayList<String> rrss = new ArrayList<>();
        Cafeteria cafeteria1 = new Cafeteria("","", rrss, null);
        cafeteria1.agregarRRSS("facebook");
        String resultado = String.valueOf(cafeteria1.getRRSS());
        String esperado = "[facebook]";
        Assertions.assertEquals(esperado, resultado );
    }

    @Test
    void agregarCafe() {
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        Cafeteria cafeteria = new Cafeteria("","",null, listaCafes);

        cafeteria.agregarCafe("azul", 20, 70, "grande");
        String resul = cafeteria.getListaCafes().get(0).getTipo();
        Assertions.assertEquals("azul", resul);
        int resul2 = cafeteria.getListaCafes().get(0).getGramosCafe();
        Assertions.assertEquals(20, resul2);
        int resul3 = cafeteria.getListaCafes().get(0).getMililitrosAgua();
        Assertions.assertEquals(70, resul3 );
        String resul4 = cafeteria.getListaCafes().get(0).getTamaño();
        Assertions.assertEquals("grande", resul4);



    }

    @Test
    void eliminarCafePorNombre() {
        ArrayList<String> rrss = new ArrayList<>();
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        Cafe cafe1 = new Cafe("Mocachino", 30, 50, "chico");
        listaCafes.add(cafe1);
        Cafeteria cafeteria = new Cafeteria("", "",rrss, listaCafes );
        cafeteria.eliminarCafePorNombre("mocachino");
        String resultado = String.valueOf(cafeteria.getListaCafes());
        String esperado = "[]";
        Assertions.assertEquals(esperado, resultado );

    }

    @Test
    void buscarCafePorNombre() {
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        Cafeteria cafeteria = new Cafeteria("","",null, listaCafes);
        Cafe cafe1 = new Cafe("rojo", 50, 50, "mediano");
        listaCafes.add(cafe1);
        String buscar = cafeteria.buscarCafePorNombre("rojo");
        String esperado = "rojo";
        Assertions.assertEquals(esperado, buscar);

    }
}