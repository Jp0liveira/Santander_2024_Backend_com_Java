package main.java.collections.coparableXcomparato.pesquisa;

public class Livro {
    private String livro;
    private String autor;
    private Integer anoPublicacao;

    
    public Livro(String livro, String autor, Integer anoPublicacao) {
        this.livro = livro;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro [livro=" + livro + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
    }
    
}
