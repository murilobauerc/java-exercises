package exercicio105mrl;
/**
 *
 * @author 122138610
 */
public class Exercicio105mrl {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico(123456789, "Renato Portaluppi", 15000.0D, 5 );
        Time timeBrasileiro = new Time("Grêmio Foot-Baal Portoalegrense", tecnico);
        Jogador primeiroJogador = new Jogador(0001, "Marcelo Grohe", 10000, "Goleiro", 5000, 2500, 1.80, 90);
        Jogador segundoJogador = new Jogador(0002, "Luan", 15000, "Atacante", 7000, 5000, 1.70, 85);

        timeBrasileiro.adicionaJogador(primeiroJogador);
        timeBrasileiro.adicionaJogador(segundoJogador);

        timeBrasileiro.titulos.add(new Titulo(2001, "Copa do Brasil"));
        timeBrasileiro.titulos.add(new Titulo(2005, "Campeonato Brasileiro - Série B"));
        timeBrasileiro.titulos.add(new Titulo(2006, "Campeonato Gaúcho"));
        timeBrasileiro.titulos.add(new Titulo(2007, "Campeonato Gaúcho"));
        timeBrasileiro.titulos.add(new Titulo(2010, "Campeonato Gaúcho"));
        timeBrasileiro.titulos.add(new Titulo(2016, "Copa do Brasil"));
        timeBrasileiro.titulos.add(new Titulo(2017, "Copa Libertadores da América"));
        timeBrasileiro.titulos.add(new Titulo(2018, "Campeonato Gaúcho"));
        timeBrasileiro.titulos.add(new Titulo(2018, "Recopa"));

        timeBrasileiro.exibeRelatorioCadastral();
    }
}
