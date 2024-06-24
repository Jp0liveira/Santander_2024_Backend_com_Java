package main.java.set.operacoesBasicas;

public class Convidado {

    private String nome;

    private Integer codigo;
    

    public Convidado() { }

    public Convidado(String nome, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Convidado nome(String nome) {
        setNome(nome);
        return this;
    }

    public Convidado codigo(Integer codigo) {
        setCodigo(codigo);
        return this;
    }

    
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigo='" + getCodigo() + "'" +
            "}";
    }
    
}