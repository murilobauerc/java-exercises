package exerc05mrl;

public class Exerc05mrl {
    public static void main(String[] args) {
        // TODO code application logic here
        NomeThread nome = new NomeThread();
        
        Thread primeira = new Thread(nome);
        primeira.setName("Primeira");
        Thread segunda = new Thread(nome);
        segunda.setName("Segunda");
        Thread terceira = new Thread(nome);
        terceira.setName("Terceira");
        Thread quarta = new Thread(nome);
        quarta.setName("Quarta");
        Thread quinta = new Thread(nome);
        quinta.setName("Quinta");
        Thread sexta = new Thread(nome);
        sexta.setName("Sexta");
        Thread setima = new Thread(nome);
        setima.setName("Sétima");
        Thread oitava = new Thread(nome);
        oitava.setName("Oitava");
        Thread nona = new Thread(nome);
        nona.setName("Nona");
        Thread decima = new Thread(nome);
        decima.setName("Decima");
        
        primeira.start();
        segunda.start();
        terceira.start();
        quarta.start();
        quinta.start();
        sexta.start();
        setima.start();
        oitava.start();
        nona.start();
        decima.start();
    }
}
