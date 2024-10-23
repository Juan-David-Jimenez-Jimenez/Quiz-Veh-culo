public class Camion extends Vehiculo {

    public Camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void encender() {
        System.out.println("El camión está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El camión está apagado.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Combustible: " + getCombustible());
    }
}
