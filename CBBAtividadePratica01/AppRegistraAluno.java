package CBBAtividadePratica01;

public class AppRegistraAluno {
    public static void main(String[] args) {
        RegistraAluno aluno = new RegistraAluno();
        aluno.setNome("Karol");
        aluno.setIdade(19);
        aluno.setEndereco("Rua Pereira Estéfano");

        aluno.setNotaGeografia(9.3);
        aluno.setNotaMatematica(9);
        aluno.setNotaPortugues(9.6);

        aluno.imprimir();
    }
}
