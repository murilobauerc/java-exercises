package datadezmain;

public class DataDezMain {
    public static void main(String[] args) {
        DataDez dataUm = new DataDez();
        DataDez dataDois = new DataDez();
        DataDez dataTres = new DataDez();
        dataUm.setBuscaDia(30); // data do meu nascimento (Murilo)
        dataUm.setBuscaMes(01);
        dataUm.setBuscaAno(1998);
        
        dataDois.setBuscaDia(15); // data de nascimento de Andrés D'alessandro (maior história como jogador de futebol do Rio Grande do Sul)
        dataDois.setBuscaMes(04);
        dataDois.setBuscaAno(1981);
        
        dataTres.setBuscaDia(12); // data de nascimento de Arthur (Grêmio) (melhor jogador de futebol do Rio Grande do Sul)
        dataTres.setBuscaMes(8);
        dataTres.setBuscaAno(1996);
        
        System.out.print("Primeira Data:" + dataUm.getMostraData() + "\n");
        System.out.print("Segunda Data:" + dataDois.getMostraData() + "\n");
        System.out.print("Terceira Data:" + dataTres.getMostraData() + "\n");
    }
    
}
