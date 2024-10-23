abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String combustible;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void mostrarInformacion();

    public void abastecerCombustible() {
        System.out.println("Abasteciendo combustible: " + combustible);
    }
}
