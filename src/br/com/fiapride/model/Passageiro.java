package br.com.fiapride.model;

public class Passageiro {
    public String nome, cpf;
    public double saldo;
    public boolean Passaporte;

    public Passageiro(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public void adicionarSaldo (double valor){
        if (valor <= 0){
            System.out.println("Erro: O valor deve ser positivo.");
        }
        this.saldo += valor;
        System.out.println("Saldo adicionado com sucesso. Novo saldo: R$" + this.saldo);
    }

    public void validadePassaporte(int data){
        if (data <= 25){
            System.out.println("Erro: Passaporte vencido. Por favor, renove seu passaporte para continuar usando o serviço.");
            this.Passaporte = false;
            return;
        }
        this.Passaporte = true;
        System.out.println("Passaporte válido. Você pode continuar usando o serviço.");
    }

    public void pagarViagem(double custo){
        if (custo <= 0){
            System.out.println("Erro: O custo da viagem é inválido.");
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para pagar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga com sucesso. Saldo restante: R$" + this.saldo);
    }

    public void passaporteConfiscado(boolean confiscado){
        if (confiscado){
            System.out.println("Passaporte regularizado. Você pode continuar usando o serviço.");
            this.Passaporte = true;
            return;
        }
        System.out.println("Passaporte confiscado. Por favor, regularize sua situação para continuar usando o serviço.");
        this.Passaporte = false;
    }

}
