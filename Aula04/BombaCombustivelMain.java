package bombacombustivelmain;
/**
 *
 * @author mrlo
 */
public class BombaCombustivelMain {
    public static void main(String[] args) {
        // TODO code application logic here
        
        BombaCombustivel bombaCombustivel = new BombaCombustivel("Gasolina", 4.23, 100);
        System.out.print(bombaCombustivel.exibeDados());
        System.out.print("\nInformado o valor a ser abastecido.\n--- PROCESSANDO ---\nQuantidade de litros que foi colocado no veículo: " + bombaCombustivel.abastecerPorValor(100) + "\n");
        System.out.print("Quantidade disponivel na bomba após o abastecimento: " + bombaCombustivel.getQuantidadeDeCombustivel() + "\n");        
        
        System.out.print("\n-----------------------------------------------------------------------------\n");
        
        BombaCombustivel bombaCombustivel2 = new BombaCombustivel("Diesel", 3.02, 200);
        System.out.print(bombaCombustivel2.exibeDados());
        System.out.print("\nInformado a quantidade em litros de combustivel para abastecer.\n--- PROCESSANDO ---\nValor a ser pago pelo cliente: " + bombaCombustivel2.abastecerPorLitro(-30) + "\n");
        System.out.print("Quantidade disponivel na bomba após o abastecimento: " + bombaCombustivel2.getQuantidadeDeCombustivel() + "\n");
        
        
        System.out.print("\n-----------------------------------------------------------------------------\n");
        
        BombaCombustivel bombaCombustivel3 = new BombaCombustivel("Diesel", 3.41, 350);
        System.out.print(bombaCombustivel3.exibeDados());
        System.out.print("\nInformado a quantidade em litros de combustivel para abastecer.\n--- PROCESSANDO ---\nValor a ser pago pelo cliente: " + bombaCombustivel3.abastecerPorLitro(50) + "\n");
        System.out.print("Quantidade disponivel na bomba após o abastecimento: " + bombaCombustivel3.getQuantidadeDeCombustivel() + "\n");
        
        
    }
    
}
