
public class Coche extends VehiculoBase {
    private TipoCombustible combustible;

    public Coche(String marca, String modelo, TipoCombustible combustible) {
        super(marca, modelo);
        this.combustible = combustible;
    }

    public TipoCombustible tipoCombustible() {
        return combustible;
    }
}