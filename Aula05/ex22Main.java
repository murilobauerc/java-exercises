package ex22main;


public class Ex22main {

    public static void main(String[] args) {

        Livro produtoA = new Livro("Fogo amigo", 10.50, "Teste1");
        Livro produtoB = new Livro("Meu malvado favorito", 29.22, "Teste2");
        Cd produtoC = new Cd("Four Year Strong", 23.50, 10);
        Cd produtoD = new Cd("ADTR", 25.0, 10);
        Dvd produtoE = new Dvd("Barbie no mundo das princesas", 120.50, 200);

        System.out.println("Produto A" + produtoA.toString());
        System.out.println("\nProduto B" + produtoB.toString());
        System.out.println("\nProduto C"  + produtoC.toString());
        System.out.println("\nProduto D" + produtoD.toString());
        System.out.println("\nProduto E" + produtoE.toString());

    }
