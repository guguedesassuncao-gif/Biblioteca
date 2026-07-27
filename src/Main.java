void main() {

    Biblioteca biblioteca = new Biblioteca();
    Scanner scanner = new Scanner(System.in);

    int opcao;

    do {

        IO.println("===== MENU BIBLIOTECA =====");
        IO.println("1 - Cadastrar livro");
        IO.println("2 - Listar livros");
        IO.println("3 - Buscar Livros");
        IO.println("4 - Excluir Livros");
        IO.println("5 - Atualizar Livro");
        IO.println("0 - Sair");

        opcao = scanner.nextInt();

        switch (opcao) {

            case 1:

                IO.println("Digite o id:");
                int id =scanner.nextInt();
                scanner.nextLine();

                IO.println("digite o titulo:");
                String titulo = scanner.nextLine();

                IO.println("Digite o autor:");
                String autor = scanner.nextLine();

                Livro livro = new Livro(id, titulo, autor);
                biblioteca.cadastrarLivro(livro);

                IO.println("Livro cadastrado");

                break;

            case 2:

                IO.println(biblioteca.listarLivros());

                break;

            case 3:

                IO.println("Digite o Id do livro:");

                int idBusca = scanner.nextInt();
                Livro encontrado = biblioteca.buscarLivro(idBusca);

                if (encontrado != null) {
                    IO.println(encontrado);
                } else {
                    IO.println("Livro nao encontrado");
                }

                break;

            case 4:

                IO.println("Digite o Id do Livro para excluir");

                int idExcluir = scanner.nextInt();
                biblioteca.excluirLivro(idExcluir);

                IO.println("Livro removido!");

                break;

            case 5:

                IO.println("Digite o Id do Livro para atualizar");

                int idAtualizar = scanner.nextInt();
                scanner.nextLine();

                IO.println("Digite o novo titulo:");
                String novoTitulo = scanner.nextLine();

                IO.println("Digite o novo autor:");
                String novoAutor = scanner.nextLine();

                biblioteca.atualizarLivro(idAtualizar, novoTitulo, novoAutor);

                IO.println("Livro Atualizado");

                break;

            case 0:

                IO.println("Saindo...");

                break;

            default:
                IO.println("opcao invalida!");
        }

    } while (opcao != 0);
}