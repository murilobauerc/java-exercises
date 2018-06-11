package com.company;
import java.util.*;

public class Usuario implements IExibido, ICalcula{
    private String nome;
    private String email;
    private String celular;
    private double primeiroSemestre = 0.0;
    int pos = 1;

    HashMap<Integer, Gasto> gastos = new HashMap<Integer, Gasto>();

    public Usuario(String nome, String email, String celular){
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public void incluirGasto(Gasto gasto) {
        gastos.put(pos, gasto);
        this.primeiroSemestre += gasto.getValor();
        pos++;
    }

    public void exibeRelatorio() {
        System.out.print("Nome: " + this.nome+" ("+this.email+" / "+this.celular+" )" + "\n");
        System.out.print("Gastos do primeiro semestre: R$ = " + this.primeiroSemestre + "\n");
        System.out.print("\nGastos: ");
        for (int key : gastos.keySet()) {
            Gasto dados = gastos.get(key);
            System.out.println("- " + dados);
        }
    }
}
