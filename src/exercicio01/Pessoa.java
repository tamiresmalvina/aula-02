package exercicio01;

public class Pessoa {
    private String nome;
    private String email;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void logar(){
        System.out.println("Usuário logado.");
    }
}
