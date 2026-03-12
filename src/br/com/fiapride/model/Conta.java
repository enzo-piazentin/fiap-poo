package br.com.fiapride.model;

public class Conta {
    private String nome, cpf;
    private double saldo;

    public Conta(String nome, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    public void realizarCompra(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Compra realizada com Sucesso!");
            System.out.println("Saldo Atual: " + this.saldo);
        } else {
            System.out.println("Saldo Insuficiente para realizar a compra!");
        }
    }

    public void pagarDivida(boolean divida){
        if (divida && this.saldo >= 100){
            System.out.println("Divida paga com Sucesso!");
            this.saldo -= 100;
            System.out.println("Saldo Atual: " + this.saldo);
        }else {
            System.out.println("Não há divida para pagar!");
        }
    }
}
