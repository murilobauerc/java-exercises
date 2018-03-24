package pontoretangulomain;

public class Retangulo {
    private double altura;
    private double largura;
    private Ponto vertice;
    
    public Retangulo() {
        
    }
    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }
    public void getCentro(){
        if (this.altura < 0 || this.largura < 0 || this.altura == this.largura) {
            System.out.print("Os valores passados não satisfazem a condição de retângulo. (Valor passado: " + this.largura + "," + this.altura + ")\n");
        }else{
            System.out.print("O ponto central do retângulo é: " + "(" + this.getLargura() / 2 + "," + this.getAltura() / 2 + ")\n");
        }
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getLargura() {
        return largura;
    }
    public void setVertice(Ponto vertice){
        this.vertice = vertice;
    }
    public double getVerticeSupEsqRet(){
        return this.vertice.getY();
    }
}