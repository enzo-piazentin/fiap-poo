package br.com.fiapride.model;

public class Dono {
    private String nome, cpf, numero, email;


    public Dono(String nome, String cpf, String numero, String email){
        if (
                nome != null && !nome.trim().isBlank()
                        && !cpf.trim().isBlank() && cpf.length() <= 11
                        && !numero.trim().isBlank() && numero.length() <= 11
                        && !email.trim().isBlank() && email.contains("@")
        ){
            this.nome = nome;
            this.cpf = cpf;
            this.numero = numero;
            this.email = email;
            System.out.println("Cadastro realizado com sucesso para " + this.nome);
        } else{
            System.out.println("Erro: Dados inválidos");
        }


    }

    public void atualizarNumero(String novoNumero){
        if (!novoNumero.trim().isBlank() && novoNumero.length() == 11 && !novoNumero.equals(getNumero())){
            System.out.println("Erro: O número fornecido é inválido.");
        } else{
            this.setNumero(novoNumero);
            System.out.println("Número atualizado com sucesso para " + getNumero());
        }
    }

    public void atualizarEmail(String novoEmail){
        if (!novoEmail.equalsIgnoreCase(getEmail()) && novoEmail.contains("@") && !novoEmail.trim().isBlank()){
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

    private void setNome(String nome) {
        this.nome = nome;
    }
}
