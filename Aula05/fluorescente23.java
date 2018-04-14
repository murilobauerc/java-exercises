package exer23main;

public class Fluorescente extends Lampada {
    @Override
    public String mostraEstado(){
        return "Lampada Fluorescente" + super.mostraEstado();
    }
}
