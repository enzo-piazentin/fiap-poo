package br.com.fiapride.model;

public class Conta {
    private String nome, cpf, telefone;
    private double saldo;

    public Conta(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.setTelefone(telefone);
        this.saldo = 0;
    }

    public String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
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

    public void alterarTelefone(String novoTelefone){
        if (novoTelefone != null && !novoTelefone.isBlank()){
            this.setTelefone(novoTelefone);
            System.out.println("Telefone atualizado com Sucesso!");
            System.out.println("Telefone atual: " + getTelefone());
        }else {
            System.out.println("Erro: Número de telefone inválido!");
        }
    }

    public void infoUsuario(){
        System.out.println("Nome: " + getNome() + " | CPF: " + getCpf() + " | Telefone: " + getTelefone() + " | Saldo: " + getSaldo());
    }
}
