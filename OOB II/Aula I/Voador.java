package com.company;

public class Voador {
    public int metrosVoados;
    private boolean voando;

    public int getMetrosVoados() {
        return metrosVoados;
    }
    public void setMetrosVoados(int metrosVoados) {
        this.metrosVoados = metrosVoados;
    }
    public boolean isVoando() {
        return voando;
    }
    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    public void decolar(){
        this.voando = true;
    }

    public void pousar(){
        this.voando = false;
    }

    public void voar(int metrosVoados){
        this.metrosVoados = this.metrosVoados + metrosVoados;
    }
}
