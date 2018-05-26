package formasGeometricasMrl;

public class Quadrado extends Quadrilatero implements FiguraGeometrica {

    private double ladoDoQuadrado;

    public Quadrado(double ladoDoQuadrado) {
        super(ladoDoQuadrado, ladoDoQuadrado, ladoDoQuadrado, ladoDoQuadrado);
        this.ladoDoQuadrado = ladoDoQuadrado;
    }
    @Override
    public double calculaArea() {
        return Math.pow(ladoDoQuadrado);
    }

    @Override
    public String toString() {
        return "\nlado do quadrado: " + this.ladoDoQuadrado
         + " - perimetro: " + calculaPerimetro() + " - Area: " + calculaArea();
    }
}
