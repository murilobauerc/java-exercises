package alunosdozemain;
import java.util.Scanner;
/**
 *
 * @author mrlo
 */
public class AlunosDozeMain {

    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        // instanciando três alunos
        AlunoDoze alunoCiclano = new AlunoDoze();
        AlunoDoze alunoFulano = new AlunoDoze();
        AlunoDoze alunoBeltrano = new AlunoDoze();
        
        EnderecoDoze enderecoCiclano = new EnderecoDoze();
        EnderecoDoze enderecoFulano = new EnderecoDoze();
        EnderecoDoze enderecoBeltrano = new EnderecoDoze();
         
        // dados do aluno Ciclano (primeiro aluno instanciado)
        // <object>.set<method>(param)
        System.out.print("Informe o nome do primeiro aluno: ");
        String nomeCiclano = teclado.nextLine();
        alunoCiclano.setNome(nomeCiclano);
        
        System.out.print("\nInforme o endereco RESIDENCIAL.\nRua: ");
        String ruaResidencialCiclano = teclado.nextLine();
        enderecoCiclano.setRua(ruaResidencialCiclano);
        
        System.out.print("Numero: ");
        int numeroResidencialCiclano = teclado.nextInt();
        enderecoCiclano.setNumeroRua(numeroResidencialCiclano); 
        
       
        System.out.print("Complemento: ");
        String complementoResidencialCiclano = teclado.next();
        enderecoCiclano.setComplemento(complementoResidencialCiclano); 
        
        System.out.print("Bairro: ");
        String bairroResidencialCiclano = teclado.next();
        enderecoCiclano.setBairro(bairroResidencialCiclano); 
        
        System.out.print("CEP: ");
        int cepResidencialCiclano = teclado.nextInt();
        enderecoCiclano.setCep(cepResidencialCiclano); 
        
        System.out.print("Cidade: ");
        String cidadeResidencialCiclano = teclado.next();
        enderecoCiclano.setCidade(cidadeResidencialCiclano); 
        
        System.out.print("\nInforme o endereco COMERCIAL.\nRua: ");
        String ruaComercialCiclano = teclado.next();
        enderecoCiclano.setRua(ruaComercialCiclano);
        
        System.out.print("Numero:");
        int numeroComercialCiclano = teclado.nextInt();
        enderecoCiclano.setNumeroRua(numeroComercialCiclano); 
        
        System.out.print("Complemento:");
        String complementoComercialCiclano = teclado.next();
        enderecoCiclano.setComplemento(complementoComercialCiclano); 
        
        System.out.print("Bairro:");
        String bairroComercialCiclano = teclado.next();
        enderecoCiclano.setBairro(bairroComercialCiclano); 
        
        System.out.print("CEP:");
        int cepComercialCiclano = teclado.nextInt();
        enderecoCiclano.setCep(cepComercialCiclano); 
        
        System.out.print("Cidade:");
        String cidadeComercialCiclano = teclado.next();
        enderecoCiclano.setCidade(cidadeComercialCiclano);
        
        System.out.print("Por fim, informe o numero de matricula: ");
        int numeroMatriculaCiclano  = teclado.nextInt();
        alunoCiclano.setNumeroMatricula(numeroMatriculaCiclano);
        // fim do instanciamento do objeto alunoCiclano
        
        
        // dados do aluno Fulano (segundo aluno instanciado)
        // <object>.set<method>(param)
        System.out.print("\nInforme o nome do segundo aluno: ");
        String nomeFulano = teclado.next();
        alunoFulano.setNome(nomeFulano);
        
        System.out.print("\nInforme o endereco RESIDENCIAL.\nRua: ");
        String ruaResidencialFulano = teclado.next();
        enderecoFulano.setRua(ruaResidencialFulano);
        
        System.out.print("Numero: ");
        int numeroResidencialFulano = teclado.nextInt();
        enderecoFulano.setNumeroRua(numeroResidencialFulano); 
        
        System.out.print("Complemento: ");
        String complementoResidencialFulano = teclado.next();
        enderecoFulano.setComplemento(complementoResidencialFulano); 
        
        System.out.print("Bairro: ");
        String bairroResidencialFulano = teclado.next();
        enderecoFulano.setBairro(bairroResidencialFulano); 
        
        System.out.print("CEP: ");
        int cepResidencialFulano = teclado.nextInt();
        enderecoFulano.setCep(cepResidencialFulano); 
        
        System.out.print("Cidade: ");
        String cidadeResidencialFulano = teclado.next();
        enderecoFulano.setCidade(cidadeResidencialFulano); 
        
        System.out.print("\nInforme o o endereco COMERCIAL.\nRua: ");
        String ruaComercialFulano = teclado.next();
        enderecoFulano.setRua(ruaComercialFulano);
        
        System.out.print("Numero:");
        int numeroComercialFulano = teclado.nextInt();
        enderecoFulano.setNumeroRua(numeroComercialFulano); 
        
        System.out.print("Complemento:");
        String complementoComercialFulano = teclado.next();
        enderecoFulano.setComplemento(complementoComercialFulano); 
        
        System.out.print("Bairro:");
        String bairroComercialFulano = teclado.next();
        enderecoFulano.setBairro(bairroComercialFulano); 
        
        System.out.print("CEP:");
        int cepComercialFulano = teclado.nextInt();
        enderecoFulano.setCep(cepComercialFulano); 
        
        System.out.print("Cidade:");
        String cidadeComercialFulano = teclado.next();
        enderecoFulano.setCidade(cidadeComercialFulano);
        
        System.out.print("Por fim, informe o numero de matricula: ");
        int numeroMatriculaFulano  = teclado.nextInt();
        alunoFulano.setNumeroMatricula(numeroMatriculaFulano);
        // fim do instanciamento do objeto alunoFulano
        
        
        
        // dados do aluno Beltrano (terceiro aluno instanciado)
        // <object>.set<method>(param) 
        System.out.print("\nInforme o nome do terceiro aluno: ");
        String nomeBeltrano = teclado.next();
        alunoBeltrano.setNome(nomeBeltrano);
        
        System.out.print("\nInforme o endereco RESIDENCIAL.\nRua: ");
        String ruaResidencialBeltrano = teclado.next();
        enderecoBeltrano.setRua(ruaResidencialBeltrano);
        
        System.out.print("Numero: ");
        int numeroResidencialBeltrano = teclado.nextInt();
        enderecoBeltrano.setNumeroRua(numeroResidencialBeltrano); 
        
        System.out.print("Complemento: ");
        String complementoResidencialBeltrano = teclado.next();
        enderecoBeltrano.setComplemento(complementoResidencialBeltrano); 
        
        System.out.print("Bairro: ");
        String bairroResidencialBeltrano = teclado.next();
        enderecoBeltrano.setBairro(bairroResidencialBeltrano); 
        
        System.out.print("CEP: ");
        int cepResidencialBeltrano = teclado.nextInt();
        enderecoBeltrano.setCep(cepResidencialBeltrano); 
        
        System.out.print("Cidade: ");
        String cidadeResidencialBeltrano = teclado.next();
        enderecoBeltrano.setCidade(cidadeResidencialBeltrano); 
        
        System.out.print("\nInforme o o endereco COMERCIAL.\nRua: ");
        String ruaComercialBeltrano = teclado.next();
        enderecoBeltrano.setRua(ruaComercialBeltrano);
        
        System.out.print("Numero:");
        int numeroComercialBeltrano = teclado.nextInt();
        enderecoBeltrano.setNumeroRua(numeroComercialBeltrano); 
        
        System.out.print("Complemento:");
        String complementoComercialBeltrano = teclado.next();
        enderecoBeltrano.setComplemento(complementoComercialBeltrano); 
        
        System.out.print("Bairro:");
        String bairroComercialBeltrano = teclado.next();
        enderecoBeltrano.setBairro(bairroComercialBeltrano); 
        
        System.out.print("CEP:");
        int cepComercialBeltrano = teclado.nextInt();
        enderecoBeltrano.setCep(cepComercialBeltrano); 
        
        System.out.print("Cidade:");
        String cidadeComercialBeltrano = teclado.next();
        enderecoBeltrano.setCidade(cidadeComercialBeltrano);
        
        System.out.print("Por fim, informe o numero de matricula: ");
        int numeroMatriculaBeltrano  = teclado.nextInt();
        alunoBeltrano.setNumeroMatricula(numeroMatriculaBeltrano);
        // fim do instanciamento do objeto alunoBeltrano
        System.out.print("Exibição dos alunos cadastrados.\n");
        
        System.out.print("\nDados dos alunos" + "\n");
        System.out.print("Nome: " + alunoCiclano.getNome(nomeCiclano) + "\n" + "Endereco RESIDENCIAL:" + "\n" + "Rua: " + enderecoCiclano.getRua(ruaResidencialCiclano)+ "\n");
        System.out.print("Numero: " + enderecoCiclano.getNumeroRua(numeroResidencialCiclano)+ "\n" + "Complemento: " + enderecoCiclano.getComplemento(complementoResidencialCiclano) + "\n");
        System.out.print("Bairro: " + enderecoCiclano.getBairro(bairroResidencialCiclano)+ "\n" + "CEP: " + enderecoCiclano.getCep(cepResidencialCiclano)+ "\n" + "Cidade: " + enderecoCiclano.getCidade(cidadeResidencialCiclano)+ "\n");
        System.out.print("Endereco COMERCIAL:" + "\n" + "Rua: " + enderecoCiclano.getRua(ruaComercialCiclano)+ "\n" + "Numero: " + enderecoCiclano.getNumeroRua(numeroComercialCiclano)+ "\n");
        System.out.print("Complemento: " + enderecoCiclano.getComplemento(complementoComercialCiclano)+ "\n" + "Bairro: " + enderecoCiclano.getBairro(bairroComercialCiclano)+ "\n");
        System.out.print("CEP: " + enderecoCiclano.getCep(cepComercialCiclano)+ "\n" + "Cidade: " + enderecoCiclano.getCidade(cidadeComercialCiclano)+ "\n" + "Numero de Matricula: " + alunoCiclano.getNumeroMatricula(numeroMatriculaCiclano) + "\n");
        
        System.out.print("Nome: " + alunoFulano.getNome(nomeFulano) + "\n" + "Endereco RESIDENCIAL:" + "\n" + "Rua: " + enderecoFulano.getRua(ruaResidencialFulano)+ "\n");
        System.out.print("Numero: " + enderecoFulano.getNumeroRua(numeroResidencialFulano)+ "\n" + "Complemento: " + enderecoFulano.getComplemento(complementoResidencialFulano)+ "\n");
        System.out.print("Bairro: " + enderecoFulano.getBairro(bairroResidencialFulano)+ "\n" + "CEP: " + enderecoFulano.getCep(cepResidencialFulano)+ "\n" + "Cidade: " + enderecoFulano.getCidade(cidadeResidencialFulano)+ "\n");
        System.out.print("Endereco COMERCIAL:" + "\n" + "Rua: " + enderecoFulano.getRua(ruaComercialFulano)+ "\n" + "Numero: " + enderecoFulano.getNumeroRua(numeroComercialFulano)+ "\n");
        System.out.print("Complemento: " + enderecoFulano.getComplemento(complementoComercialFulano)+ "\n" + "Bairro: " + enderecoFulano.getBairro(bairroComercialFulano)+ "\n");
        System.out.print("CEP: " + enderecoFulano.getCep(cepComercialFulano)+ "\n" + "Cidade: " + enderecoFulano.getCidade(cidadeComercialFulano)+ "\n" + "Numero de Matricula: " + alunoFulano.getNumeroMatricula(numeroMatriculaFulano));
       
        System.out.print("Nome: " + alunoBeltrano.getNome(nomeBeltrano) + "\n" + "Endereco RESIDENCIAL:" + "\n" + "Rua: " + enderecoBeltrano.getRua(ruaResidencialBeltrano)+ "\n");
        System.out.print("Numero: " + enderecoBeltrano.getNumeroRua(numeroResidencialBeltrano)+ "\n" + "Complemento: " + enderecoBeltrano.getComplemento(complementoResidencialBeltrano)+ "\n");
        System.out.print("Bairro: " + enderecoBeltrano.getBairro(bairroResidencialBeltrano)+ "\n" + "CEP: " + enderecoBeltrano.getCep(cepResidencialBeltrano)+ "\n" + "Cidade: " + enderecoBeltrano.getCidade(cidadeResidencialBeltrano)+ "\n");
        System.out.print("Endereco COMERCIAL:" + "\n" + "Rua: " + enderecoBeltrano.getRua(ruaComercialBeltrano)+ "\n" + "Numero: " + enderecoBeltrano.getNumeroRua(numeroComercialBeltrano)+ "\n");
        System.out.print("Complemento: " + enderecoBeltrano.getComplemento(complementoComercialBeltrano)+ "\n" + "Bairro: " + enderecoBeltrano.getBairro(bairroComercialBeltrano)+ "\n");
        System.out.print("CEP: " + enderecoBeltrano.getCep(cepComercialBeltrano) + "\n" + "Cidade: " + enderecoBeltrano.getCidade(cidadeComercialBeltrano)+ "\n" + "Numero de Matricula: " + alunoBeltrano.getNumeroMatricula(numeroMatriculaBeltrano));   
        
        System.out.print("FIM DA EXIBIÇÃO DOS DADOS.");    
    }                
}