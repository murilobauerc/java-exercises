package com.company;

public class Aluno {
    private String nome;
    private int numero;

    public Aluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}
