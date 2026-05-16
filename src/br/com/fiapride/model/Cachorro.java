package br.com.fiapride.model;

public class Cachorro extends Pet{

    public Cachorro(String nome, boolean raca, int idade, String nomeRaca, Dono dono) {
        super(nome, raca, idade, nomeRaca, dono);
    }

    @Override
    public void exibirFichaDoPet() {
        System.out.println("\n🐕 FICHA DO CACHORRO 🐕");
        super.exibirFichaDoPet();
        brincar();
    }

    @Override
    public void exibirFichaGeral() {
        System.out.println("\n🐕 FICHA GERAL DO CACHORRO 🐕");
        super.exibirFichaGeral();
    }

    @Override
    public void EmitirSom() {
        System.out.println("Au au au, Estou feliz que vc me cadastrou");
    }

    @Override
    public void brincar() {
        System.out.println(getNome() + " está buscando o bolinho! 🎾");
    }
}
