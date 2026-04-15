package br.com.fiapride.main;

import br.com.fiapride.model.Dono;
import br.com.fiapride.model.Pet;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- FIAPRIDE: Inicializando Sistema ---");

        Dono enzo = new Dono("Enzo Ribeiro", "987.654.321-00", "(11) 91234-5678", "enzo@gmail.com");
        Pet petDoEnzo = new Pet("Rex", "Cachorro", "Labrador", enzo);

        enzo.atualizarEmail("enzo@gmail.com");

        petDoEnzo.exibirFichaDoPet();
        System.out.println("\n-----------------------------------\n");
        petDoEnzo.exibirFichaGeral();

        System.out.println("\n-----------------------------------\n");

        Dono mari = new Dono("Maria Oliveira", "555.666.777-88", "(11) 99876-5432", "mari@gmail.com");
        Pet petDaMari = new Pet("Mia", "Gato", "Siamês", mari);


        System.out.println("\n-----------------------------------\n");
        petDaMari.exibirFichaDoPet();
        System.out.println("\n-----------------------------------\n");
        petDaMari.exibirFichaGeral();
    }
}
