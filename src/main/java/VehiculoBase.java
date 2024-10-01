
public abstract class VehiculoBase extends Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadActual;

    public VehiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public void acelerar() {
        velocidadActual += 10;
        System.out.println("Velocidad actual de " + marca + " " + modelo + ": " + velocidadActual + " km/h");
    }

    public void frenar() {
        velocidadActual = Math.max(velocidadActual - 10, 0);
        System.out.println("Velocidad actual de " + marca + " " + modelo + ": " + velocidadActual + " km/h");
    }
}
