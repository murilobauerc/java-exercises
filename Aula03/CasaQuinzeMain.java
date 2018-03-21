package casaquinzemain;

/**
 *
 * @author mrlo
 */
public class CasaQuinzeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Casa casa = new Casa();
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        
        porta1.abre();
        casa.setPorta1(porta1);
        porta1.pinta("Verde Piscina");
        
        casa.setPorta2(porta2);
        casa.getPorta2().abre();
        casa.getPorta2().pinta("Grená");
        
        
        casa.getPorta1().fecha();
        
        
        
        
        System.out.print("O número de porta(s) aberta(s) é (são): " + casa.quantasPortasEstaoAbertas() + "\n");
        System.out.print("O número total de portas:" + casa.totalDePortasInstaladas() + "\n");
        
    }
    
}
