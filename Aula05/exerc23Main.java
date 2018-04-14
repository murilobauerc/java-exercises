package exerc23main;


public class Exer23main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char type;
        System.out.println("Qual tipo de lampada você quer? Digite 'L' para LED e 'F' para florescente:");
        type= userInput.next().charAt(0);
        FabricaLampadas fabrica= new FabricaLampadas();
        Lampada lampada = new Lampada();
        Lampada lampada1 = new Lampada();
        System.out.println("estado da lampada:" + lampada.mostraEstado());
        lampada.on();
        System.out.println("estado da lampada:" + lampada.mostraEstado());
        lampada.off();
        System.out.println("estado da lampada:" + lampada.mostraEstado());
        lampada.on();
        System.out.println("estado da lampada:" + lampada.mostraEstado());
        System.out.println("-----------------OUTRA LAMPADA --------------------");
        System.out.println("estado da lampada:"+lampada1.mostraEstado());
        lampada1.on();
        System.out.println("Estado da lampada:"+lampada1.mostraEstado());
    }
}
