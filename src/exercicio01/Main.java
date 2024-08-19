package exercicio01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Nicolas Tesla");
        pessoa1.setEmail("tesla@gmail.com");
        System.out.println("\nNome: " + pessoa1.getNome());
        System.out.println("E-mail: " + pessoa1.getEmail());
        pessoa1.logar();

        Professor prof1 = new Professor("Albert", "albert@gmail.com");
        System.out.println("\nNome: " + prof1.getNome());
        System.out.println("E-mail: " + prof1.getEmail());
        prof1.logar();

        Aluno aluno1 = new Aluno("Melissa", "melissa@gmail.com");
        System.out.println("\nNome: " + aluno1.getNome());
        System.out.println("E-mail: " + aluno1.getEmail());
        aluno1.logar();
        Aluno aluno2 = new Aluno("Carolina", "carolina@gmail.com");
        System.out.println("\nNome: " + aluno2.getNome());
        System.out.println("E-mail: " + aluno2.getEmail());
        aluno2.logar();

        Turma estruturaDados = new Turma("Estrutura de Dados", prof1, 30);
        estruturaDados.inserirAluno(aluno1);
        estruturaDados.inserirAluno(aluno2);
        System.out.println("\nTurma: " + estruturaDados.getNome());
        estruturaDados.listarAlunos();
    }
}