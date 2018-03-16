package profcursotrezemain;

/**
 *
 * @author 122138610
 */
public class Professor {
    private int numero;
    private String nome;
    
    public Professor() {
    
    }
    
    public Professor(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void setNumero(int numero) {
	this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return numero;
    }

}
    
