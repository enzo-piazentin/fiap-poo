package br.com.fiapride.main;

import br.com.fiapride.model.Conta;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Conta conta1 = new Conta("", "123.456.789-00", "(11)99462 0236");

        conta1.setSaldo(500);
        System.out.println("Saldo Atual: " + conta1.getSaldo());
        conta1.realizarCompra(150);
        conta1.pagarDivida(true);

        conta1.alterarTelefone(null);
        conta1.alterarTelefone(" ");
        conta1.alterarTelefone("");
        conta1.alterarTelefone("(11)987654321");

        conta1.infoUsuario();
    }
}
