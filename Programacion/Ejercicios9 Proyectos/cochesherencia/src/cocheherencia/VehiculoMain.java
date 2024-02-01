package cocheherencia;


public class VehiculoMain {
    public static void main(String[] args) {
        Coche coche =new Coche("Coche","Seat","Gris", "5 Cilindros" );
        Coche coche1 =new Coche("Coche","Ferrari","Rojo", "Gran Cilindraje");
        Moto moto = new Moto("Moto","Harley Davidson", "Negro","4 Tiempos");
        Tanque tanque = new Tanque("Tanque","Leopardo", "Verde Militar", "Galeon Marino");
        Bicicleta bicicleta = new Bicicleta("Bicicleta","Sky", "Azul", "MountainBike");
        Patinete patinete =new Patinete("Patinete", "2", "verde", 10000);

        coche.MostrarDatos();
        coche.Gracias();

        coche1.MostrarDatos();
        coche1.Gracias();

        moto.MostrarDatos();
        moto.Gracias();

        tanque.MostrarDatos();
        tanque.Gracias();

        bicicleta.MostrarDatos();
        bicicleta.Gracias();


        patinete.MostrarDatos();
        patinete.Gracias();


    }
    
}