package GCQuestao01;

public class Cobra extends Reptil {
    private boolean venenosa;

    public Cobra(String nome, int idade, String genero, double peso, double temperaturaCorporal, boolean venenosa) {
        super(nome, idade, genero, peso, temperaturaCorporal);
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("psssssss");
    }

    @Override
    public void mover() {
        super.mover();
        System.out.println("o animal ta rastejando...");
    }
}
