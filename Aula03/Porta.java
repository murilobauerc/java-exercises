package portaquatorzemain;

/**
 *
 * @author mrlo
 */
public class Porta {
    private boolean aberta;
    private String cor;
    
    public Porta() {
        
    }
    public Porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;
    }
    public void abre(){
        if (this.aberta == false) { // verificar se a porta está fechada, para caso de não abrir uma porta já aberta
            this.aberta = true; // então abre
        }
    }
    public void fecha(){
        if (this.aberta) { // verificar se a porta está aberta, para caso de não fechar uma porta já fechada
            this.aberta = false; // então fecha
        }
    }
    
    public boolean estaAberta() {
        if (this.aberta) {
            System.out.print("A porta está aberta.\n");
        }else{
            System.out.print("A porta está fechada.\n");
        }
        return this.aberta;
    }
    public void pinta(String cor) {
        this.cor = cor; 
    }
    public String getCor() {
        return cor;
    }
}
