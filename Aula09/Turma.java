package com.company;

import java.util.ArrayList;

public class Turma {
    private String nomeDisciplina;
    private int numero;
    private ArrayList<Aluno> alunos = new ArrayList<>();;

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public int getNumero() {
        return numero;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public boolean adicionaAluno(Aluno aluno) {
        return alunos.add(aluno);
    }
    public void listaAlunos() {
        System.out.print(getNomeDisciplina() + " - " + getNumero() + "\n");
        for(Aluno aluno: alunos) {
            System.out.print(aluno.getNome() + " - " + aluno.getNumero() + "\n");
        }
    }
}

