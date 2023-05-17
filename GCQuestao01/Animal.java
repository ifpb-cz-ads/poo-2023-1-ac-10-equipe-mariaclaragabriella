package GCQuestao01;

public abstract class Animal {
    private String nome;
    private int idade;
    private String genero;
    private double peso;

    public Animal(String nome, int idade, String genero, double peso){
        setNome(nome);
        setIdade(idade);
        setGenero(genero);
        setPeso(peso);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public abstract void comer();

    public abstract void fazerBarulho();

    public void mover(){
        System.out.println("o animal ta se locomovendo...");
    }

    public void dormir(){
        System.out.println("o animal ta dormindo...");
        System.out.println("zzzzzzz");
    }
}
