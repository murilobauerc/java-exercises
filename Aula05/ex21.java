package animalmain;


// herança é quando ele herda caracteristicas,metodos, atributos de outra classe. (EX: Aluno herda da classe-pai Pessoa (String nome, int idade, int numeroMatricula)
public class Animal {
   private String nome;
   private double comprimento;
   private int numeroDePatas;
   private String cor;
   private double velocidade;

 public Animal(String nome, double comprimento,int numeroDePatas, String cor, String ambiente, double velocidade) {
    this.nome = nome;
    this.comprimento = comprimento;
    this.numeroDePatas = numeroDePatas;
    this.cor = cor;
    this.ambiente = ambiente;
    this.velocidade = velocidade;
 }

 public void setNome(String nome){
   this.nome = nome;
 }

 public void setComprimento(double comprimento) {
     this.comprimento = comprimento;
 }

 public void setCor(String cor) {
     this.cor = cor;
 }

 public void setVelocidade(double velocidade) {
     this.velocidade = velocidade;
 }

 public String getNome(){
   return nome;
 }
 public double comprimento(){
     return comprimento;
 }

 public String getCor(){
     return cor;
 }

 public double getVelocidade(){
     return velocidade;
 }
 public void listaDados(){
   System.out.print("Nome: "+ getNome());
   System.out.print("Comprimento: "+ getComprimento());
   System.out.print("Numero de patas: "+ getNumeroDePatas());
   System.out.print("Cor: " + getCor());
   System.out.print("Velocidade: " + getVelocidade());
 }
