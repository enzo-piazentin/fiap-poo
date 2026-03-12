package br.com.fiapride.main;

import br.com.fiapride.model.Conta;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Maria", "123.456.789-00");

        conta1.setSaldo(500);
        System.out.println("Saldo Atual: " + conta1.getSaldo());
        conta1.realizarCompra(150);
        conta1.pagarDivida(true);

        System.out.println("-----------------------------");

        Conta conta2 = new Conta("João", "987.654.321-00");
        conta2.setSaldo(300);
        System.out.println("Saldo Atual: " + conta2.getSaldo());
        conta2.realizarCompra(350);
        conta2.pagarDivida(false);

    }
}
