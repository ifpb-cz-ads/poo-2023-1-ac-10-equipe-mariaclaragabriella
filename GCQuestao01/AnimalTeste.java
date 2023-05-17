package GCQuestao01;

public class AnimalTeste {
    public static void main(String[] args) {
        Animal gato = new Gato("dandara", 7, "femea", 4, "carnivoro");
        gato.comer();
        gato.dormir();
        gato.fazerBarulho();
        gato.mover();
        System.out.println("peso: " + gato.getPeso());
    }
}
