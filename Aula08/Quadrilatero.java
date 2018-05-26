package formasGeometricasMrl;

public abstract class Quad {
    private double primeiroLado, segundoLado, terceiroLado, quartoLado;
    public Quad(double primeiroLado, double segundoLado, double terceiroLado, double quartoLado) {
        this.primeiroLado = primeiroLado;
        this.segundoLado = segundoLado;
        this.terceiroLado = terceiroLado;
        this.quartoLado = quartoLado;
    }
    public double calculaPerimetro() { return primeiroLado + segundoLado + terceiroLado + quartoLado;}
}
