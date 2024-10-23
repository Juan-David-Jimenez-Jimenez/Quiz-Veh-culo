public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Yaris", "Gasolina");
        carro.encender();
        carro.mostrarInformacion();
        carro.abastecerCombustible();
        carro.apagar();
        System.out.println();


        Camion camion = new Camion("Volvo", "FMX", "Diesel");
        camion.encender();
        camion.mostrarInformacion();
        camion.abastecerCombustible();
        camion.apagar();
        System.out.println();

        Moto moto = new Moto("Apache", "RTR", "Gasolina");
        moto.encender();
        moto.mostrarInformacion();
        moto.abastecerCombustible();
        moto.apagar();
        System.out.println();


        Carro_Electrico carroElectrico = new Carro_Electrico("Tesla", "Model S", "Eléctrico", 75);
        carroElectrico.encender();
        carroElectrico.mostrarInformacion();
        carroElectrico.nivelBateria();
        carroElectrico.cargarBateria();
        carroElectrico.apagar();
    }
}
