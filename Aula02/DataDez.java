package datadezmain;

public class DataDez {
    private int dia;
    private int mes;
    private int ano;

    public void setBuscaDia(int dia) {
        this.dia = dia; 
    }
    public void setBuscaMes(int mes) {
        this.mes = mes;
    }
    public void setBuscaAno(int ano) {
        this.ano = ano;
    }
    public int getBuscaDia(int dia) {
        return dia;
    }
    public int getBuscaMes(int mes){
        return mes;
    }
    public int getBuscaAno(int ano) {
        return ano;
    }
    public String getMostraData(){
        return (dia + "/" + mes + "/" + ano);
    }
}
