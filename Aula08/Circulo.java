package formasGeometricasMrl;

public class Circulo implements FiguraGeometrica {
    private double radius;
    private static final double pi = 3.14;
    public Circulo(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculaPerimetro() {
        double diametro = 2 * radius;
        return (pi * (2 * radius));
    }
    @Override
    public double calculaArea() { return (pi * (radius * radius));  }
    @Override
    public String toString() { return "\nCIRCULO - radius: " + this.radius + " - Perimetro: " + calculaPerimetro() + " - Area: " + calculaArea(); }
}
