package exercicio105mrl;
import java.util.*;

/**
 *
 * @author 122138610
 */
public class Time {
    private String nome;
    private Tecnico tecnico;
    List<Jogador> jogadores = new ArrayList<Jogador>();
    HashSet<Titulo> titulos = new HashSet<>();

    public Time(String nome, Tecnico tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tecnico getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }


    public void adicionaJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void adicionaTitulo(Titulo titulo) {
        this.titulos.add(titulo);
    }

    public void exibeRelatorioCadastral() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Jogadores: ");

        ListIterator<Jogador> iterator = jogadores.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.print("Técnico: ");
        System.out.print(tecnico);
        System.out.println("\nTítulos: ");
        Iterator<Titulo> iteratorTitulos = titulos.iterator();
        while(iteratorTitulos.hasNext()){
            Titulo descricao = iteratorTitulos.next();
            System.out.println(descricao);
        }
    }
}
