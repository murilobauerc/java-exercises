package exer23main;
class Lampada {
    private boolean status;
    public String mostraEstado(){
        if(this.status){
            return "Ligado";
        }else{
        return "Desligado";
        }
    }
    public void on(){
        this.status=true;
    }
    public void off(){
        this.status=false;
    }
}
