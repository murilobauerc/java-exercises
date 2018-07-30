package com.company;
import java.util.ArrayList;

public class Turma {
    private String nomeDisciplina;
    private int numero;
    private ArrayList<Aluno> lista = new ArrayList<>();

    public String getNome() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nome) {
        this.nomeDisciplina = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void adicionaAluno(Aluno aluno){
        lista.add(aluno);
    }

    public void listaAlunos(){
        System.out.println(this.nomeDisciplina+" - "+this.numero);
        for(Aluno aluno : lista){
            System.out.println(aluno.toString());
        }
    }
}
