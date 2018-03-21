package casaquinzemain;

/**
 *
 * @author mrlo
 */
public class Casa {
    private String cor;
    private Porta porta1, porta2, porta3;
    
    public Casa() {
        
    }
    public Casa(String cor) {
        this.cor = cor;
    }
    
    public void pinta(String cor) {
        if (this.cor.equals(cor)) {
            System.out.print("Não é possível pintar a casa com a mesma cor");
        }else{
            this.cor = cor; 
        } 
    }
 
    public String getCor() {
        return cor;
    }
    public int quantasPortasEstaoAbertas(){
        int count = 0;
        if (this.porta1 != null && this.getPorta1().estaAberta()) count++;
        if (this.porta2 != null && this.getPorta2().estaAberta()) count++;
        if (this.porta3 != null && this.getPorta3().estaAberta()) count++;
        return count;
    }
    public int totalDePortasInstaladas() {
        int portaInstalada = 0;
        if (this.porta1 != null) portaInstalada++;
        if (this.porta2 != null) portaInstalada++;
        if (this.porta3 != null) portaInstalada++;
        return portaInstalada;
     }
    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }
    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }
    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    public Porta getPorta1(){
        return porta1;
    }
    public Porta getPorta2() {
        return porta2;
    }
    public Porta getPorta3() {
        return porta3;
    }

}
