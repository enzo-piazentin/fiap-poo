package br.com.fiapride.main;

import br.com.fiapride.model.Conta;

public class SistemaPrincipalTeste {
    public static void main(String[] args) {
        Conta conta = new Conta("Maria", "123.456.789-00");
        conta.saldo = 500;
        conta.nome = "Enzo";
    }
}
