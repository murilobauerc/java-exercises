package exer23main;

public class FabricaLampadas {
    public Lampada criarLampada(char type){
        if(type!='F' && type!='L'){
            System.out.println("Opção invalida de tipo de lampada!");
            return null;
        }
        if(type== 'L'){
            LED lampLed = new LED();
            return lampLed;
        }
        if(type == 'F'){
            Fluorescente fluor = new Fluorescente();
            return fluor;
        }
        return null;
    }
}
