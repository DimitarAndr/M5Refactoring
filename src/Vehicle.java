public class Vehicle {

    private String marka;
    private String model;
    private String categoria;

    public static final String BASIC = "BASIC";
    public static final String LUXE = "LUXE";
    public static final String GENERAL = "GENERAL";

    public Vehicle() {

    }

    public Vehicle(String marka, String model, String categoria) {
        this.model = model;
        this.marka = marka;
        this.categoria = categoria;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarca() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCategoria() {
        return categoria;
    }

}