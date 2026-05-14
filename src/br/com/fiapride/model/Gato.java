package br.com.fiapride.model;

public class Gato extends Pet{


    public Gato(String nome, boolean raca, int idade, String nomeRaca, Dono dono) {
        super(nome, raca, idade, nomeRaca, dono);
    }

    @Override
    public void exibirFichaDoPet() {
        System.out.println("\n🐱 FICHA DO GATO 🐱");
        super.exibirFichaDoPet();
    }

    @Override
    public void exibirFichaGeral() {
        System.out.println("\n🐱 FICHA GERAL DO GATO 🐱");
        super.exibirFichaGeral();
    }

}
