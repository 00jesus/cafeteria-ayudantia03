public class Alfajor {
    private String sabor;
    private String tamaño;
    private String origen;


    public Alfajor (String sabor, String tamaño, String origen) {
        this.sabor = sabor;
        this.tamaño = tamaño;
        this.origen = origen;
    }
    public Alfajor() {
        this.sabor = "";
        this.tamaño = "";
        this.origen = "";
    }


    public String getSabor() {
        return sabor;
    }

    public String getTamano() {
        return tamaño;
    }

    public void setTamano(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "Alfajor{" +
                "sabor='" + sabor + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }
}
