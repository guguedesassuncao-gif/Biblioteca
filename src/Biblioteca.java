import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public void  cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public Livro buscarLivro(int id) {

        for (Livro livro : livros) {

            if (livro.getId() == id) {
                return livro;
            }
        }

        return null;
    }

    public Livro buscarPorTitulo(String titulo) {

        for (Livro livro : livros) {

            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }

        return null;
    }

    public void  excluirLivro(int id) {

        livros.removeIf(livro -> livro.getId() == id);
    }

    public void atualizarLivro(int id, String novoTitulo, String novoAutor) {

        boolean encontrado = false;

        for (Livro livro : livros) {

            if (livro.getId() == id) {
                 livro.setTitulo(novoTitulo);
                 livro.setAutor(novoAutor);

                 encontrado = true;
            }
        }

        if (!encontrado) {
            IO.println("Livro nao encontrado");
        }
    }

}
