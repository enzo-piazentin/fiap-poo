package br.com.fiapride.model;

public class Pet {
    private String nome, especie, raca;
    private Dono dono;

    public Pet(String nome, String especie, String raca, Dono dono){
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dono = dono;

        System.out.println("Novo pet registrado: " + this.nome + " (" + this.especie + " - " + this.raca + ")");
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public void exibirFichaDoPet(){
        System.out.println("Ficha do Pet:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Raça: " + this.raca);
    }

    public void exibirFichaGeral(){
        System.out.println("Ficha Geral:");
        System.out.println("Dono: " + this.dono.getNome());
        System.out.println("CPF: " + this.dono.getCpf());
        System.out.println("Contato: " + this.dono.getNumero() + " | " + this.dono.getEmail());
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Raça: " + this.raca);
    }
}
