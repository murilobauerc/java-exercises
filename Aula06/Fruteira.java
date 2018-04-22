public class Fruteira {

    private Fruta vetor[];

    public Fruteira(int quantidadesDeFrutas) {
        vetor = new Fruta[quantidadesDeFrutas];
    }

    public void adiciona(Fruta fruta) {
        for (int i = 0; i < vetor.length; i++) {
            if ((fruta != null) && (fruta == vetor[i])) {
                return;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = fruta;
                return;
            }
        }
    }

    public void remove(Fruta fruta) {
        for (int i = 0; i < vetor.length; i++) {
            if (fruta == vetor[i]) {
                vetor[i] = null;
                return;
            }
        }
    }

    public void listaFrutas() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println("Gramas: " + vetor[i].getGramas() + "\tCalorias por grama: " + vetor[i].getCaloriasPorGrama());
            }
        }
    }
}