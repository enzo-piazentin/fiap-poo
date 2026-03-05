package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("Ana Silva", "123.456.789-00");
        System.out.println("Recarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);
        passageiro1.validadePassaporte(28);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "987.654.321-00");
        System.out.println("Recarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);
        passageiro2.validadePassaporte(24);

        System.out.println("""
                
                --------Sistema FiapRide--------
                """);
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo +"| CPF: " + passageiro1.cpf + " | Passaporte: " + (passageiro1.Passaporte ? "Válido" : "Vencido"));


        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        passageiro1.passaporteConfiscado(passageiro1.Passaporte);

        System.out.println(" ");

        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo +"| CPF: " + passageiro2.cpf + " | Passaporte: " + (passageiro2.Passaporte ? "Válido" : "Vencido"));
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.passaporteConfiscado(passageiro2.Passaporte);
        passageiro2.pagarViagem(20);
    };

}
