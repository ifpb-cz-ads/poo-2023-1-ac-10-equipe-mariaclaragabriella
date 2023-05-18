package GCQuestao01;

public abstract class Mamifero extends Animal{
    private String alimentacao;
    
    public Mamifero(String nome, int idade, String genero, double peso, String alimentacao) {
        super(nome, idade, genero, peso);
        setAlimentacao(alimentacao);
    }
    
    public String getAlimentacao() {
        return alimentacao;
    }
    
    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public void comer(){
        double qtdd = 0;
        if (alimentacao.equals("herbivoro")) {
            procurarPlanta();
            qtdd += 3;
        } 
        else if (alimentacao.equals("carnivoro")) {
            cacar();
            qtdd += 5.7;
        } else{
            cacar();
            procurarPlanta();
            qtdd += 8.7;
        }
        System.out.println("o animal ta se alimentando");
        setPeso(getPeso()+qtdd);
    }

    public void cacar(){
        System.out.println("o animal ta caçando sua presa");
    }

    public void procurarPlanta(){
        System.out.println("o animal ta procurando plantas");
    }

}