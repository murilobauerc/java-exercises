package portaquatorzemain;

/**
 *
 * @author mrlo
 */
public class PortaQuatorzeMain {
    public static void main(String[] args) {
        // TODO code application logic here
        Porta portaTeste = new Porta(false, "Verde");
        
        portaTeste.abre();
        portaTeste.estaAberta();
        
        portaTeste.fecha();
        portaTeste.estaAberta();
        
        
        System.out.print("Voce pintou a porta de: " + portaTeste.getCor()+ "\n");
        
        portaTeste.pinta("Amarelo");
        System.out.print("Voce pintou a porta de: " + portaTeste.getCor()+ "\n");
        
        portaTeste.pinta("Azul força aérea");
        System.out.print("Voce pintou a porta de: " + portaTeste.getCor()+ "\n");
        
        
    
    }
    
}
