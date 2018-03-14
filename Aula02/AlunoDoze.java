package alunosdozemain;

/**
 *
 * @author mrlo
 */
public class AlunoDoze {
    private String nome;
    private String enderecoResidencial;
    private String enderecoComercial;
    private int numeroMatricula;
    
    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumeroMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
    
    // GETTERS
    public String getNome(String nome) {
        return nome;
    }
    public int getNumeroMatricula(int numeroMatricula) {
        return numeroMatricula;
    }
}
