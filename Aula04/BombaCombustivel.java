package bombacombustivelmain;

/**
 *
 * @author mrlo
 */
public class BombaCombustivel {
    private String tipoDeCombustivel;
    private double valorPorLitro;
    private double quantidadeDeCombustivel;
    
    public BombaCombustivel() {
        
    }
    public BombaCombustivel(String tipoDeCombustivel, double valorPorLitro, double quantidadeDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }
    public double abastecerPorValor(double valor){
        if(valor < 0 || this.quantidadeDeCombustivel - valor < 0){
            System.out.print("Não é possível abastecer. Você informou um valor inválido.\n");
            return 0.0;
        }
        this.quantidadeDeCombustivel -= valor / this.valorPorLitro; // retorna a quantidade atualizada de combustivel na bomba
        return valor / this.valorPorLitro;  // retorna a quantidade de litros que foi colocada no veículo
        
    }
    public double abastecerPorLitro(double valor){
        if(valor < 0 || this.quantidadeDeCombustivel - (valor / this.valorPorLitro) <= 0){
            System.out.print("Não é possível abastecer. Você informou um valor inválido.\n");
            return 0.0;
        }
       this.quantidadeDeCombustivel -= valor; // retorna a quantidade atualizada de combustivel na bomba
       return valor * this.valorPorLitro;
    }
    public String exibeDados(){
	return "\nDADOS DO ABASTECIMENTO: " +
        "\nTipo de combustivel: " + this.tipoDeCombustivel +
        "\nValor por litro: " + this.valorPorLitro + 
        "\nQuantidade de combustivel disponivel na bomba: " + this.getQuantidadeDeCombustivel() + "\n";
    }
    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }
    public double getValorPorLitro() {
        return valorPorLitro;
    }
    public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }
    public double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }
    public void setTipoDeCombustivel(String tipoDeCombustivel) {
       this.tipoDeCombustivel = tipoDeCombustivel;
    }
    public String getTipoDeCombustivel() {
       return tipoDeCombustivel;
    }

}
