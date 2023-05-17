package CBBAtividadePratica01;

public class RegistraAluno{
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;
    private static int contadorEstudante;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getNotaMatematica() {
        return notaMatematica;
    }
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    public double getNotaPortugues() {
        return notaPortugues;
    }
    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }
    public double getNotaGeografia() {
        return notaGeografia;
    }
    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public double getMedia(){
        double resultado = 0;
        resultado = (notaGeografia+notaMatematica+notaPortugues)/3;
        return resultado;
    }

    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
    }

    public void imprimir(double mNota, double pNota, double gNota){
        System.out.println("Nome: " + nome);
        System.out.println("Nota de matemática: " + mNota);
        System.out.println("Nota de português: " + pNota);
        System.out.println("Nota de geografia: " + gNota);
    }
}