package br.com.fiapride.model;

public abstract class Pet {
    private String nome, nomeRaca;
    private int idade;
    private Dono dono;
    private boolean raca;

    public Pet(String nome, boolean raca, int idade, String nomeRaca,Dono dono){
        if (nome != null && !nome.trim().isBlank() && idade >= 0 || idade <= 18 && dono.equals(dono.getNome()) && dono.getNome() == null){
            this.raca = raca;
            this.nome = nome;
            this.idade = idade;
            this.dono = dono;
            this.nomeRaca = nomeRaca;
        } else {
            System.out.println("Erro: Informações erradas ou registro faltando");
        }

        if (raca) {
            System.out.println("Novo pet registrado: " + this.nome + "| Raça: " + this.raca);
            EmitirSom();
        } else {
            System.out.println("Novo pet registrado: " + this.nome);
            EmitirSom();
        }
    }

    public void exibirFichaDoPet(){
        if (isRaca()){
            System.out.printf("""
                
                ----------------------Ficha do Pet----------------------
                Nome: %s | Idade: %d |Raça: %s
                -------------------------------------------------------
                """, getNome(), getIdade(),getNomeRaca());
        } else {
            System.out.printf("""
                
                ----------------------Ficha do Pet----------------------
                Nome: %s | Idade: %d
                -------------------------------------------------------
                """, getNome(), getIdade());
        }
    }

    public void exibirFichaGeral() {
        if (dono.getNome() != null && dono.getCpf() != null && dono.getNumero() != null && dono.getEmail() != null) {
            if (isRaca()) {
                System.out.println("""
                        
                        ----------------------Ficha Geral----------------------
                        Dono: %s | CPF: %s | Contato: %s - %s
                        Nome: %s | Idade: %d | Raça: %s
                        -------------------------------------------------------
                        """.formatted(dono.getNome(), dono.getCpf(), dono.getNumero(), dono.getEmail(), getNome(), getIdade(), getNomeRaca()));
            } else {
                System.out.println("""
                        
                        ----------------------Ficha Geral----------------------
                        Dono: %s | CPF: %s | Contato: %s - %s
                        Nome: %s | Idade: %d
                        -------------------------------------------------------
                        """.formatted(dono.getNome(), dono.getCpf(), dono.getNumero(), dono.getEmail(), getNome(), getIdade()));
            }
        } else {
            System.out.println("\nErro: Erro em pegar informações do dono! Cadastro incompleto!\n");
        }
    }

    public abstract void EmitirSom();

    public String getNome() {
        return nome;
    }


    public boolean isRaca() {
        return raca;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public int getIdade() {
        return idade;
    }
}
