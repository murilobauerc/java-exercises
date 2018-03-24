package pontoretangulomain;

/**
 *
 * @author mrlo
 */
public class Ponto {
    private double x;
    private double y;
    
    public Ponto(){
        
    }
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void exibePonto(){
        if (this.x < 0 || this.y < 0 || this.x == this.y) {
            System.out.print("Os valores passados não satisfazem a condição de retângulo.(Valor passado: " + this.x + "," + this.y + ")\n");
        }else{
            System.out.print("O valor do ponto x,y é: " + "(" + this.x + "," + this.y + ")\n");
        }
    }
    
    public void setX (double x){
            this.x = x;
    }
    public void setY (double y){
            this.y = y;
    }
    
    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
}
