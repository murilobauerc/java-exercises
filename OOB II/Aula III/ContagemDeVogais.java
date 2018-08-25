import java.io.*;
import java.util.Scanner;

public class ContagemDeVogais {
    public static void main(String[] args) {
        // TODO code application logic here
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        Scanner teclado = new Scanner(System.in);
        String nomeArquivo = teclado.nextLine();
        
        File arq = new File(nomeArquivo);
        try {
            if(arq.exists()){
                Scanner leArq = new Scanner(arq);
                System.out.println("Arquivo existe.");   
                while(leArq.hasNextLine()){
                    String linha =  leArq.nextLine();
                    for (int i=0; i < linha.length(); i++) {
                        if((linha.charAt(i) == 'A')  || (linha.charAt(i) == 'a')){
                            countA++;
                        }
                        if((linha.charAt(i) == 'E')  || (linha.charAt(i) == 'e')){
                            countE++;
                        }
                        if((linha.charAt(i) == 'O')  || (linha.charAt(i) == 'o')){
                            countO++;
                        }
                        if((linha.charAt(i) == 'I')  || (linha.charAt(i) == 'i')){
                            countI++;
                        }
                        if((linha.charAt(i) == 'U')  || (linha.charAt(i) == 'u')){
                            countU++;
                        }
                        
                    }
                }
            }else{
                try {
                    arq.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       System.out.println("Total de A: " + countA);
       System.out.println("Total de E: " + countE);
       System.out.println("Total de I: " + countI);
       System.out.println("Total de O: " + countO);
       System.out.println("Total de U: " + countU);
    }
}
