package GCQuestao01;

public class Gato extends Mamifero {

    public Gato(String nome, int idade, String genero, double peso, String alimentacao) {
        super(nome, idade, genero, peso, alimentacao);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("miau miau!");
    }
    
}
