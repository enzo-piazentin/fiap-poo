package br.com.fiapride.model;

public class Gato extends Pet{


    public Gato(String nome, boolean raca, int idade, String nomeRaca, Dono dono) {
        super(nome, raca, idade, nomeRaca, dono);
    }

    @Override
    public void exibirFichaDoPet() {
        System.out.println("\n🐱 FICHA DO GATO 🐱");
        super.exibirFichaDoPet();
        brincar();
    }

    @Override
    public void exibirFichaGeral() {
        System.out.println("\n🐱 FICHA GERAL DO GATO 🐱");
        super.exibirFichaGeral();
    }

    @Override
    public void EmitirSom() {
        System.out.println("Miua Miua, Estou feliz que vc me cadastrou");
    }

    @Override
    public void brincar() {
        System.out.println(getNome() + " está caçando uma bolinha de lã! 🧶");
    }
}
