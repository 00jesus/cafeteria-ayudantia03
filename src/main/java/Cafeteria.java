import java.util.ArrayList;
import java.util.Locale;

public class Cafeteria {
    protected String nombre;
    protected String direccion;
    protected ArrayList <String> RRSS;
    protected ArrayList <Cafe> listaCafes;
    protected ArrayList <Alfajor> listaAlfajores;

    public Cafeteria(String nombre, String direccion, ArrayList<String> RRSS, ArrayList<Cafe> cafes, ArrayList<Alfajor> alfajores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.RRSS = RRSS;
        this.listaCafes = cafes;
        this.listaAlfajores = alfajores;
    }
    public Cafeteria () {
        this.nombre = "";
        this.direccion = "";
        this.RRSS = null;
        this.listaCafes = null;
        this.listaAlfajores = null;
    }
    public void agregarRRSS (String redsocial){
        RRSS.add(redsocial);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getRRSS() {
        return RRSS;
    }

    public void setRRSS(ArrayList<String> RRSS) {
        this.RRSS = RRSS;
    }

    public ArrayList<Cafe> getListaCafes() {
        return listaCafes;
    }

    public void setListaCafes(ArrayList<Cafe> listaCafes) {
        this.listaCafes = listaCafes;
    }

    public ArrayList<Alfajor> getListaAlfajores() {
        return listaAlfajores;
    }

    public void setListaAlfajores(ArrayList<Alfajor> listaAlfajores) {
        this.listaAlfajores = listaAlfajores;
    }

    public void agregarCafe (String nombre, int gramos, int mililitros, String tamaño) {
        Cafe nuevoCafe = new Cafe(nombre, gramos, mililitros, tamaño);
        listaCafes.add(nuevoCafe);
    }
    public void agregarAlfajor(String sabor, String tamaño, String origen) {
        Alfajor nuevoAlfajor = new Alfajor(sabor, tamaño, origen);
        listaAlfajores.add(nuevoAlfajor);
    }
    public void eliminarCafePorNombre (String nombre) throws IndexOutOfBoundsException {
        boolean existe = false;
        if (listaCafes.size() == 0) {
            System.out.println("nohaycafes");
        } else {
            for (int i = 0; i < listaCafes.size(); i++) {
                String posible = listaCafes.get(i).getTipo().toLowerCase(Locale.ROOT);
                if (nombre.toLowerCase(Locale.ROOT).equals(posible))  {
                    System.out.println("Se elimino: "+ listaCafes.get(i));
                    listaCafes.remove(i);
                    existe = true;
                }
            }
        }
        if (!existe) System.out.println("No existe: "+ nombre);
    }

    public void eliminarAlfajorPorSabor(String sabor) throws IndexOutOfBoundsException{
        boolean existe = false;
        if (listaAlfajores.size() == 0) {
            System.out.println("no hay alfajor");
        } else {
            for (int i = 0; i < listaAlfajores.size(); i++) {
                String posible = listaAlfajores.get(i).getSabor().toLowerCase(Locale.ROOT);
                if (sabor.toLowerCase(Locale.ROOT).equals(posible))  {
                    System.out.println("Se elimino: "+ listaAlfajores.get(i));
                    listaAlfajores.remove(i);
                    existe = true;
                }
            }
        }
        if (!existe) System.out.println("No existe: "+ nombre);
    }

    public String buscarCafePorNombre (String buscar) {
        boolean existe = false;
        if (listaCafes.size() == 0) {
            System.out.println("nohaycafes");
        } else {
            for (int i = 0; i < listaCafes.size(); i++) {
                String posible = listaCafes.get(i).getTipo().toLowerCase(Locale.ROOT);
                if (buscar.toLowerCase(Locale.ROOT).equals(posible)) {
                    existe = true;
                    buscar = posible;
                }
            }
            if (existe) System.out.println("Si esta el cafe: "+ buscar);
            else if (!existe) System.out.println("No esta na: "+ buscar);
            }
        return buscar;
    }

    public String buscarAlfajorPorSabor(String buscar) {
        boolean existe = false;
        if (listaAlfajores.size() == 0) {
            System.out.println("no hay alfajores");
        } else {
            for (int i = 0; i < listaAlfajores.size(); i++) {
                String posible = listaAlfajores.get(i).getSabor().toLowerCase(Locale.ROOT);
                if (buscar.toLowerCase(Locale.ROOT).equals(posible)) {
                    existe = true;
                    buscar = posible;
                }
            }
            if (existe) System.out.println("Si esta el cafe: "+ buscar);
            else if (!existe) System.out.println("No esta na: "+ buscar);
        }
        return buscar;
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", RRSS=" + RRSS +
                ", listaCafes=" + listaCafes +
                ", listaAlfajores=" + listaAlfajores +
                '}';
    }
}
