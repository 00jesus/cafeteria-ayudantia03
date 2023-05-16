import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CafeteriaTest {

    @Test
    void agregarRRSS() {
        ArrayList<String> rrss = new ArrayList<>();
        rrss.add("facebook");
        Cafeteria cafeteria1 = new Cafeteria("","", rrss, null,null);
        cafeteria1.setRRSS(rrss);
        String resultado = String.valueOf(cafeteria1.getRRSS());
        String esperado = "[facebook]";
        Assertions.assertEquals(esperado, resultado );
    }

    @Test
    void testAgregarCafe() {
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        Cafeteria cafeteria = new Cafeteria("","",null, listaCafes, null);

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
    void testAgregarAlfajor () {
        ArrayList <Alfajor> listaAlfajores = new ArrayList<>();
        Cafeteria cafeteria = new Cafeteria("","", null, null, listaAlfajores);
        cafeteria.agregarAlfajor("chocolate blanco", "grande", "holanda" );
        String resp = cafeteria.getListaAlfajores().get(0).getSabor();
        String resp2 = cafeteria.getListaAlfajores().get(0).getTamano();
        String resp3 = cafeteria.getListaAlfajores().get(0).getOrigen();
        Assertions.assertEquals("chocolate blanco", resp);
        Assertions.assertEquals("grande", resp2);
        Assertions.assertEquals("holanda", resp3);
    }

    @Test
    void testEliminarCafePorNombre() {
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        Cafe cafe1 = new Cafe("Mocachino", 30, 50, "chico");
        listaCafes.add(cafe1);
        Cafeteria cafeteria = new Cafeteria("", "",null, listaCafes, null );
        cafeteria.eliminarCafePorNombre("mocachino");
        String resultado = String.valueOf(cafeteria.getListaCafes());
        String esperado = "[]";
        Assertions.assertEquals(esperado, resultado );
    }
    @Test
    void testEliminarAlfajorPorNombre() {
        ArrayList<Alfajor> listaAlfajores = new ArrayList<>();
        Alfajor alfajor1 = new Alfajor("chocolate", "chico", "chile");
        listaAlfajores.add(alfajor1);
        Cafeteria cafeteria = new Cafeteria("", "",null, null, listaAlfajores );
        cafeteria.eliminarAlfajorPorSabor("chocolate");
        String resultado = String.valueOf(cafeteria.getListaAlfajores());
        String esperado = "[]";
        Assertions.assertEquals(esperado, resultado );
    }

    @Test
    void testBuscarCafePorNombre() {
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        Cafeteria cafeteria = new Cafeteria("","",null, listaCafes, null);
        Cafe cafe1 = new Cafe("rojo", 50, 50, "mediano");
        listaCafes.add(cafe1);
        String buscar = cafeteria.buscarCafePorNombre("rojo");
        String esperado = "rojo";
        Assertions.assertEquals(esperado, buscar);
    }
    @Test
    void testBuscarAlfajorPorNombre() {
        ArrayList<Alfajor> listaAlfajores = new ArrayList<>();
        Cafeteria cafeteria = new Cafeteria("","",null, null, listaAlfajores);
        Alfajor alfajor1 = new Alfajor("manjar", "mediano", "alemania");
        listaAlfajores.add(alfajor1);
        String buscar = cafeteria.buscarAlfajorPorSabor("manjar");
        String esperado = "manjar";
        Assertions.assertEquals(esperado, buscar);

    }
}