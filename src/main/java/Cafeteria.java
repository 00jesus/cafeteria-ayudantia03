import java.util.ArrayList;

public class Cafeteria {
    protected String nombre;
    protected String direccion;
    protected ArrayList <String> RRSS;
    protected ArrayList <Cafe> listaCafes;

    public Cafeteria(String nombre, String direccion, ArrayList <String> RRSS, ArrayList<Cafe> cafes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.RRSS = RRSS;
        this.listaCafes = cafes;
    }
    public Cafeteria () {
        this.nombre = "";
        this.direccion = "";
        this.RRSS = null;
        this.listaCafes = null;
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

    public void setRRSS(ArrayList <String> RRSS) {
        this.RRSS = RRSS;
    }

    public ArrayList<Cafe> getListaCafes() {
        return listaCafes;
    }

    public void setListaCafes(ArrayList<Cafe> listaCafes) {
        this.listaCafes = listaCafes;
    }

    public void agregarCafe (String nombre, int gramos, int mililitros, String tamaño) {
        Cafe nuevoCafe = new Cafe(nombre, gramos, mililitros, tamaño);
        listaCafes.add(nuevoCafe);
    }



    @Override
    public String toString() {
        return "Cafeteria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", RRSS='" + RRSS + '\'' +
                ", listaCafes=" + listaCafes +
                '}';
    }
}
