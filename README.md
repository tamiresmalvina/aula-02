TDE da disciplina Estrutura de Dados, realizada na 2ª aula.

↓ Detalhes:

1) Implemente em Java um sistema de gerenciamento acadêmico que contemple as seguintes classes: Pessoa, Professor, Aluno e Turma. O sistema deve seguir as orientações abaixo:

Classe Pessoa:
Atributos:
nome: String que representa o nome da pessoa.
email: String que representa o email da pessoa.
Método:
logar: Imprimir mensagem "Usuário logado". Este método deverá ser sobrescrito nas subclasses Professor e Aluno.
Classe Professor:
Deve herdar de Pessoa.
Sobrescrita do Método:
logar: Imprimir mensagem "Professor logado".
Classe Aluno:
Deve herdar de Pessoa.
Sobrescrita do Método:
logar: Imprimir mensagem "Aluno logado".
Classe Turma:
Atributos:
id: Número que identifica o livro.
nome: String que representa o nome da turma.
professor: Um objeto do tipo Professor que será o responsável pela turma.
alunosMatriculados: Uma lista de objetos do tipo Aluno, representando os alunos matriculados na turma.
Métodos:
inserirAluno(Aluno aluno): Método que permite inserir um novo aluno na lista de alunos matriculados na turma.
listarAlunos(): Método que imprime ou retorna a lista de alunos matriculados na turma.

✎﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏

2) Desenvolver um sistema de gerenciamento para uma livraria, utilizando conceitos de POO em Java.

Classe Livro:
Atributos:
titulo (String): O título do livro.
autor (String): O nome do autor.
numeroPaginas (int): O número de páginas do livro.
disponibilidade (boolean): Indica se o livro está disponível para empréstimo (true) ou não (false).
Métodos:
exibirDetalhes(): Exibe todas as informações do livro (título, autor, número de páginas, disponibilidade).
reservar(): Se o livro estiver disponível, marca-o como não disponível e exibe uma mensagem confirmando a reserva. Caso contrário, exibe uma mensagem informando que o livro já está reservado.
devolver(): Marca o livro como disponível novamente e exibe uma mensagem confirmando a devolução.
Classe Livraria:
livros (Livro[] livros): Uma lista que armazena os livros disponíveis na livraria.
inserirLivro(Livro livro): Adiciona um novo livro à lista de livros da livraria.
listarLivros(): Exibe a lista completa de livros disponíveis na livraria, mostrando todos os detalhes de cada livro.
listarDisponiveis(): Exibe apenas os livros que estão disponíveis para empréstimo.
 
 
