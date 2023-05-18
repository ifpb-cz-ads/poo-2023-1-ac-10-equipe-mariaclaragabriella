package GCQuestao01;

public class Cachorro extends Mamifero{
    private String raca;
    private String tamanho;
    
    public Cachorro(String nome, int idade, String genero, double peso, String alimentacao, String raca,
            String tamanho) {
        super(nome, idade, genero, peso, alimentacao);
        this.raca = raca;
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void fazerBarulho() {
        if (tamanho.equals("pequeno")) {
            System.out.println("au au");
        } else if (tamanho.equals("medio")) {
            System.out.println("woof woof");
        } else if (tamanho.equals("grande")) {
            System.out.println("ruff ruff");
        } else {
            System.out.println("woof");
        }
    }
    
}
