package arraysmain33;

/* Crie uma classe denominada OperaComArray, que tenha como atributo um array de inteiros que deve ser iniciado no construtor da classe – 
    o tamanho do array deve ser recebido como parâmetro e os valores do array devem ser gerados aleatoriamente dentro do construtor. 

Crie métodos para: 
    - retornar a soma dos elementos do array - OK
    - retornar a média dos valores do array - OK
    - retornar o último elemento do array - OK
    - retornar o maior elemento do array - OK
    - verificar se um número “x” passado como parâmetro existe no array. O método deve retornar true ou false. 
 */
public class OperaComArray {
    private int vetorDeInteiros[];
    
   public OperaComArray(int tamanho){
       vetorDeInteiros = new int[tamanho];
       for (int i = 0; i < tamanho; i++) {
           vetorDeInteiros[i] = (int) (Math.random() * 25);
            System.out.print("N: " + vetorDeInteiros[i] + "\n");
           // imprimindo o vetor apenas para verificar se está calculando corretamente
       }
   }
   
   public int somaElementosArray(){
       int sum = 0;
       for(int i=0; i < vetorDeInteiros.length; i++){
           sum += vetorDeInteiros[i];
       }
       return sum;
   }
   
   public double mediaElementosArray(){
       int sum = 0, i;
       for(i = 0; i < vetorDeInteiros.length; i++){
           sum += vetorDeInteiros[i];
       }
       return (double) sum / i;
   }
   
   public int ultimoElementoArray(){
       return vetorDeInteiros[vetorDeInteiros.length - 1];
   }
   
   public int maiorElementoArray(){
       int maior = 0;
       for (int i = 0; i < vetorDeInteiros.length; i++) {
           if(vetorDeInteiros[i] > maior){
               maior = vetorDeInteiros[i];
           }
       }
       return maior;
   }

   public boolean existeElementoArray(int x){
       for (int i = 0; i < vetorDeInteiros.length; i++){
           if(vetorDeInteiros[i] == x){
              return true;
           }
       }
       return false;
   }
}

