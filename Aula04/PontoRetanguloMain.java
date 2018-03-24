package pontoretangulomain;

/**
 *
 * @author mrlo
 */
public class PontoRetanguloMain {
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto ponto = new Ponto();
 
        ponto.setX(5);
        ponto.setY(5);
        ponto.exibePonto(); // deve dar valor inválido, pois retangulo tem altura != largura
        
        Ponto ponto1 = new Ponto(10,4);
        ponto1.exibePonto();
        Retangulo retangulo = new Retangulo(10,4);
        retangulo.getCentro();
        
        Ponto ponto2 = new Ponto(2,6);
        ponto2.exibePonto();
        Retangulo retangulo1 = new Retangulo(2,6);
        retangulo1.getCentro(); // deve dar (1,3) pois é o ponto medio do segmento
     
        
        Retangulo retangulo2 = new Retangulo(2,-4);
        retangulo2.getCentro(); // deve dar valor inválido (5,5), pois retangulo tem altura != largura
        
        Retangulo retangulo3 = new Retangulo(2,8);
        retangulo3.getCentro();
        Retangulo retangulo4 = new Retangulo(4,6);
        retangulo4.getCentro();
        Retangulo retangulo5 = new Retangulo(2,4);
        retangulo5.getCentro();
    }
    
}
