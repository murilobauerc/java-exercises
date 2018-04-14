package ex22main;
public class Dvd extends Produto {
    private int duracao;

    public Dvd(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuracao: " + this.duracao;
    }
}
