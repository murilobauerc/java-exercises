package com.company;

public class Superman extends Voador {
    private boolean clarkKent;

    public void disfarcar(){
        this.clarkKent = true;
    }

    public void serHeroi(){
        this.clarkKent = false;
    }

    @Override
    public void voar(int metrosVoados){
        this.metrosVoados = this.metrosVoados + (metrosVoados*5);
    }

    public boolean estahDisfarcado(){
        return this.clarkKent;
    }

}