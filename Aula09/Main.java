package com.company;

public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario("John Doe", "john.doe@gmail.com", "9876-5432");
        Gasto primeiroGasto = new Gasto("Janeiro", 30, "Água");
        Gasto segundoGasto = new Gasto("Janeiro", 70, "telefone");

        Gasto terceiroGasto = new Gasto("Fevereiro", 10, "Água");
        Gasto quartoGasto = new Gasto("Fevereiro", 40, "telefone");

        Gasto quintoGasto = new Gasto("Março", 30, "Água");
        Gasto sextoGasto = new Gasto("Março", 70, "telefone");
        Gasto setimoGasto = new Gasto("Março", 100, "luz");
        Gasto oitavoGasto = new Gasto("Março", 700, "celular novo");

        Gasto nonoGasto = new Gasto("Abril", 30, "Água");
        Gasto decimoGasto = new Gasto("Abril", 70, "telefone");
        Gasto decimoPrimeiroGasto = new Gasto("Abril", 100, "luz");
        Gasto decimoSegundoGasto = new Gasto("Abril", 100, "refeicao");

        Gasto decimoTerceiroGasto = new Gasto("Maio", 30, "Água");
        Gasto decimoQuartoGasto = new Gasto("Maio", 70, "telefone");

        Gasto decimoQuintoGasto = new Gasto("Junho", 30, "Água");
        Gasto decimoSextoGasto = new Gasto("Junho", 70, "telefone");
        Gasto decimoSetimoGasto = new Gasto("Junho", 5900, "presente para o professor");

        user.incluirGasto(primeiroGasto);
        user.incluirGasto(segundoGasto);
        user.incluirGasto(terceiroGasto);
        user.incluirGasto(quartoGasto);
        user.incluirGasto(quintoGasto);
        user.incluirGasto(sextoGasto);
        user.incluirGasto(setimoGasto);
        user.incluirGasto(oitavoGasto);
        user.incluirGasto(nonoGasto);
        user.incluirGasto(decimoGasto);
        user.incluirGasto(decimoPrimeiroGasto);
        user.incluirGasto(decimoSegundoGasto);
        user.incluirGasto(decimoTerceiroGasto);
        user.incluirGasto(decimoQuartoGasto);
        user.incluirGasto(decimoQuintoGasto);
        user.incluirGasto(decimoSextoGasto);
        user.incluirGasto(decimoSetimoGasto);
        user.exibeRelatorio();
    }
}
