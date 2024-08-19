package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void inserirLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
        } else {
            for (Livro livro : livros) {
                livro.exibirDetalhes();
                System.out.println("━━━━━━━━ \uD83D\uDCDA ━━━━━━━━");
            }
        }
    }

    public void listarDisponiveis() {
        boolean encontrouDisponivel = false;
        for (Livro livro : livros) {
            if (livro.isDisponibilidade()) {
                livro.exibirDetalhes();
                System.out.println("━━━━━━━━ \uD83D\uDCDA ━━━━━━━━");
                encontrouDisponivel = true;
            }
        }
        if (!encontrouDisponivel) {
            System.out.println("Nenhum livro disponível para empréstimo.");
        }
    }
}

