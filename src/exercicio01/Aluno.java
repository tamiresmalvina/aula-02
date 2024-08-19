package exercicio01;

public class Aluno extends Pessoa {

    public Aluno(String nome, String email){
        setNome(nome);
        setEmail(email);
    }

    @Override
    public void logar(){
        System.out.println("Aluno logado.");
    }
}
