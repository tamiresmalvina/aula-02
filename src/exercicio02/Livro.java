package exercicio02;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = disponibilidade;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Disponível: " + (disponibilidade ? "Sim" : "Não"));
    }

    public void reservar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro reservado com sucesso.");
        } else {
            System.out.println("Livro já está reservado.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }
}

