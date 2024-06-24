package main.java.coparableXcomparato.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String livro, String autor, Integer anoPublicacao) {
        Livro novoLivro = new Livro(livro, autor, anoPublicacao);
        this.livroList.add(novoLivro);
    }

    public void verificarLivros() {
        if(livroList.isEmpty()) {
            throw new RuntimeException("Nenhum livro cadastrado");
        }
    }

    public List<Livro> pesquisarPorAutoLivros(String autor) {
        this.verificarLivros();
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : this.livroList) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(Integer anoInicial, Integer anoFinal){
        this.verificarLivros();
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro livro : this.livroList) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(livro);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }
}
