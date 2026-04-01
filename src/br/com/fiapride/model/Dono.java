package br.com.fiapride.model;

public class Dono {
    private String nome, cpf, numero, email;

    public Dono(String nome, String cpf, String numero, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
        this.email = email;
        System.out.println("Cadastro realizado com sucesso para " + this.nome);
    }

    public void atualizarNumero(String novoNumero){
        if (novoNumero == null || novoNumero.isBlank()){
            this.setEmail(novoNumero);
            System.out.println("Número atualizado com sucesso para " + getNumero());
        } else{
            System.out.println("Erro: O número fornecido é inválido.");
        }
    }

    public void atualizarEmail(String novoEmail){
        if (novoEmail == null || novoEmail.isBlank()){
            this.setEmail(novoEmail);
            System.out.println("Email atualizado com sucesso para " + getEmail());
        } else{
            System.out.println("Erro: O email fornecido é inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }
}
