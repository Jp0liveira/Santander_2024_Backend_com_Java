package main.java.collections.coparableXcomparato.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenada = new ArrayList<>(pessoaList);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenada = new ArrayList<>(pessoaList);
        Collections.sort(listaOrdenada, new ComparatorPorAltura());
        return listaOrdenada;
    }
    
}
