public class Pessoa {
    String nome;
    char sexo;
    String dataNascimento;
    String estadoCivil;

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("-------------------------");
    }
}