public class Carro_Electrico extends Vehiculo implements Vehiculo_electrico {

    private int nivelBateria;

    // Constructor con parámetros
    public Carro_Electrico(String marca, String modelo, String combustible, int nivelBateria) {
        super(marca, modelo, combustible);
        this.nivelBateria = nivelBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }


    @Override
        public void encender() {
            System.out.println("El carro eléctrico está encendido.");
        }

        @Override
        public void apagar() {
            System.out.println("El carro eléctrico está apagado.");
        }

        @Override
        public void mostrarInformacion() {
            System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Combustible: " + getCombustible() + ", Batería: " + nivelBateria + "%");
        }

        @Override
        public void cargarBateria() {
            System.out.println("Cargando batería del carro eléctrico...");
            nivelBateria = 100;
            System.out.println("La batería está completamente cargada.");
        }

        @Override
        public void nivelBateria() {
            System.out.println("Nivel actual de batería: " + nivelBateria + "%");
        }
}

