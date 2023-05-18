package GCQuestao01;

public abstract class Reptil extends Animal {
    private double temperaturaCorporal;

    public Reptil(String nome, int idade, String genero, double peso, double temperaturaCorporal) {
        super(nome, idade, genero, peso);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public void comer() {
        System.out.println("o animal ta caçando sua presa");
        double qtdd = 5.7;
        System.out.println("o animal ta se alimentando");
        setPeso(getPeso()+qtdd);
    }
}
