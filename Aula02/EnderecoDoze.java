package alunosdozemain;

/**
 *
 * @author mrlo
 */
public class EnderecoDoze {
    private String rua;
    private int numeroRua;
    private String complemento;
    private String bairro;
    private int cep;
    private String cidade;
    
    // SETTERS
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    // GETTERS
    public String getRua(String rua) {
        return rua;
    }
    public int getNumeroRua(int numeroRua ) {
        return numeroRua;
    }
    public String getComplemento(String complemento) {
        return complemento;
    }
    public String getBairro(String bairro) {
        return bairro;
    }
    public int getCep(int cep) {
        return cep;
    }
    public String getCidade(String cidade) {
        return cidade;
    }
}
