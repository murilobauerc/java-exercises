package com.company;

public class Gasto {
    private String mes;
    private double valor;
    private String contaMes;

    public Gasto(double valor,String contaMes) {
        this.valor = valor;
        this.contaMes = contaMes;
    }

    public Gasto(String mes, double valor, String contaMes){
        this.mes = mes;
        this.valor = valor;
        this.contaMes = contaMes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setContaMes(String contaMes) {
        this.contaMes = contaMes;
    }

    public double getValor() {
        return valor;
    }

    public String getContaMes() {
        return contaMes;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString(){
        return this.mes + "\n --- " + this.contaMes +" - R$ " + this.valor;
    }
}
