
public class Principal {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", TipoCombustible.GASOLINA);
        Lancha lancha = new Lancha("Yamaha", "WaveRunner", TipoCombustible.ELECTRICO);

        coche.acelerar();
        coche.frenar();
        System.out.println("Combustible del coche: " + coche.tipoCombustible());

        lancha.acelerar();
        lancha.frenar();
        System.out.println("Combustible de la lancha: " + lancha.tipoCombustible());
    }
}