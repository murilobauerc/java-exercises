
public class FruteiraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruteira fruta = new Fruteira(10);
        
        Fruta fruta1 = new Fruta(3,2);
        Fruta fruta2 = new Fruta(5,2);
        Fruta fruta3 = new Fruta(1,1);
        Fruta fruta4 = new Fruta(4,2);
        Fruta fruta5 = new Fruta(2,4);
        Fruta fruta7 = new Fruta(9,4);
        
        
        fruta.adiciona(fruta5);
        fruta.adiciona(fruta2);
        fruta.adiciona(fruta3);
        fruta.remove(fruta5);
        fruta.listaFrutas();
        fruta.adiciona(fruta7);
        fruta.adiciona(fruta4);
        fruta.adiciona(fruta1);
        fruta.listaFrutas();
        
        fruta.remove(fruta1);
        fruta.remove(fruta7);
        fruta.adiciona(fruta1);
        fruta.listaFrutas();
    }	
}


