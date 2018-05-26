package formasGeometricasMrl;

public class Retangulo extends Quadrilatero implements FiguraGeometrica {
    private double height, base;
    public Retangulo(double height, double base) {
        super(height, base, height, base);
        this.height = height;
        this.base = base;
    }
    @Override
    public double calculaArea() { return base * height; }
    @Override
    public String toString() { return "\nRETANGULO - Base: " + this.base + " - height: " + this.height + " - Perimetro: " + calculaPerimetro() + " - Area: " + calculaArea(); }
}
