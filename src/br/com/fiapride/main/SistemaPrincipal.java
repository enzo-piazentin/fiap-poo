package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = "Fiat Argo";
        carro1.tipoDeCambio = "Manual";
        carro1.tiopoDeCombustivel = "Gasolina";
        carro1.ligarPiscaAlerta = "Ligando pisca alerta";
        carro1.ligarLimpadorDeParabrisa = "Ligando limpador de parabrisa";

        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Tipo de câmbio: " + carro1.tipoDeCambio);
        System.out.println("Tipo de combustível: " + carro1.tiopoDeCombustivel);
        System.out.println(carro1.ligarPiscaAlerta);
        System.out.println(carro1.ligarLimpadorDeParabrisa);

        Carro carro2 = new Carro();
        carro2.modelo = "Chevrolet Onix";
        carro2.tipoDeCambio = "Automático";
        carro2.tiopoDeCombustivel = "Flex";
        carro2.ligarPiscaAlerta = "Ligando pisca alerta";
        carro2.ligarLimpadorDeParabrisa = "Ligando limpador de parabrisa";

        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println(" ");

        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Tipo de câmbio: " + carro2.tipoDeCambio);
        System.out.println("Tipo de combustível: " + carro2.tiopoDeCombustivel);
        System.out.println(carro2.ligarPiscaAlerta);
        System.out.println(carro2.ligarLimpadorDeParabrisa);
    };

}
