public class Principal {
    public static void main(String[] args) {
        // Creación de un coche
        Coche coche = new Coche("Toyota", "Corolla", TipoCombustible.GASOLINA);
        coche.acelerar();
        coche.frenar();
        System.out.println("El coche usa combustible: " + coche.tipoCombustible());
 
        // Creación de una lancha
        Lancha lancha = new Lancha("Yamaha", "WaveRunner", TipoCombustible.ELECTRICO);
        lancha.acelerar();
        lancha.frenar();
        System.out.println("La lancha usa combustible: " + lancha.tipoCombustible());
    }
}
 
