package exer23main;

public class LED extends Lampada{
    @Override
    public String mostraEstado() {
        return "Lampada Led" + super.mostraEstado();
    }

}
