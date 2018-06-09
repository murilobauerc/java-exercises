package exercicio105mrl;

public class Titulo {
    private int ano;
    private String descricao;

    public Titulo(int ano, String descricao) {
        this.ano = ano;
        this.descricao = descricao;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.ano+" : "+this.descricao+"\n";
    }
}
