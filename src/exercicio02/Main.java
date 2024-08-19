package exercicio02;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Até o verão terminar", "Colleen Hoover", 336, true);
        Livro livro2 = new Livro("Um milhão de finais felizes", "Vitor Martins", 352, true);
        Livro livro3 = new Livro("O príncipe cruel", "Holly Black", 322, false);

        Livraria livraria = new Livraria();
        livraria.inserirLivro(livro1);
        livraria.inserirLivro(livro2);
        livraria.inserirLivro(livro3);

        System.out.println("\nLista de todos os livros:");
        livraria.listarLivros();

        System.out.println("\nLista de livros disponíveis:");
        livraria.listarDisponiveis();

        System.out.println("\nTentando reservar 'Um milhão de finais felizes':");
        livro2.reservar();
        System.out.println("\nTentando reservar 'O príncipe cruel':");
        livro3.reservar();

        System.out.println("\nDevolvendo 'O príncipe cruel':");
        livro3.devolver();

        System.out.println("\nLista de livros disponíveis após devolução:");
        livraria.listarDisponiveis();
    }
}
