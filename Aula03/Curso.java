/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package profcursotrezemain;

/**
 *
 * @author 122138610
 */
public class Curso {
    private int numeroCurso;
    private String nomeCurso;
    private Professor nomeProfessor;
    
    public Curso(){
  
        
    }
    public Curso(int numeroCurso, String nomeCurso) {
        this.numeroCurso = numeroCurso;
        this.nomeCurso = nomeCurso;
    }
    public void exibeDados(){
	System.out.print("Numero do curso: " + this.getNumeroCurso() + "\n");
	System.out.print("Nome do curso: " + this.getNomeCurso() + "\n");
        if (nomeProfessor == null){
            System.out.print("Não há professor para este curso." + "\n");
        }else{
            System.out.print("Nome do professor: " + this.getNomeProfessor().getNome()+ "\n\n");
        }
    }
    
    public void setNumeroCurso(int numeroCurso) {
        this.numeroCurso = numeroCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public int getNumeroCurso() {
        return numeroCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeProfessor(Professor nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    public Professor getNomeProfessor() {
        return nomeProfessor;
    }



}



