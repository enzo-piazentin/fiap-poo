package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.Gato;
import br.com.fiapride.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- FIAPRIDE: Inicializando Sistema ---");

        List<Dono> donos = new ArrayList<>();
        List<Pet> animais = new ArrayList<>();

        Dono enzo = new Dono("Enzo", "39386777766", "11994620236", "enzo@gmail.com");
        donos.add(enzo);
        animais.add(new Cachorro("Rex", true, 5, "Pastor Alemão", enzo));

        enzo.atualizarEmail("enzop@gmail.com");

        Dono mari = new Dono("Maria Oliveira", "55566677788", "11998765432", "mari@gmail.com");
        donos.add(mari);
        animais.add(new Gato("Gata", false, 3, null, mari));

        for (Pet pet : animais ){
            pet.exibirFichaDoPet();
            pet.exibirFichaGeral();
        }
    }
}
