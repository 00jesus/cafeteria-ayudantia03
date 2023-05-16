public class Cafe {
    protected String tipo;
    protected int gramosCafe;
    protected int mililitrosAgua;
    protected String tamaño;


    public Cafe(String tipo, int gramosCafe, int mililitrosAgua, String tamaño) {
        this.tipo = tipo;
        this.gramosCafe = gramosCafe;
        this.mililitrosAgua = mililitrosAgua;
        this.tamaño = tamaño;
    }
    public Cafe () {
        this.tipo = "";
        this.gramosCafe = 0;
        this.mililitrosAgua = 0;
        this.tamaño = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getGramosCafe() {
        return gramosCafe;
    }

    public void setGramosCafe(int gramosCafe) {
        this.gramosCafe = gramosCafe;
    }

    public int getMililitrosAgua() {
        return mililitrosAgua;
    }

    public void setMililitrosAgua(int mililitrosAgua) {
        this.mililitrosAgua = mililitrosAgua;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "tipo='" + tipo + '\'' +
                ", gramosCafe=" + gramosCafe +
                ", mililitrosAgua=" + mililitrosAgua +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
}
