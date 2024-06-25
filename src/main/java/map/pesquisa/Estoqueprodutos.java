package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class Estoqueprodutos {
    
    private Map<Long, Produto> estoqueprodutosMap;
    
    public Estoqueprodutos() {
        this.estoqueprodutosMap = new HashMap<>();
    }

    public Map<Long, Produto> getEstoqueprodutosMap() {
        return this.estoqueprodutosMap;
    }

    public void setEstoqueprodutosMap(Map<Long, Produto> estoqueprodutosMap) {
        this.estoqueprodutosMap = estoqueprodutosMap;
    }

    public void adicionarProdutos(Long codigo, String nome, Integer quantidade, Double preco){
        this.estoqueprodutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(this.estoqueprodutosMap);
    }

    public Double calcularValorTotalEstoque(){
        Double valorTotalEstoque = 0d;
        if(!this.estoqueprodutosMap.isEmpty()){
            for(Produto p: this.estoqueprodutosMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();

            }
        }
        return valorTotalEstoque;
    }

    public Produto obteProdutoMaisCaro(){
        Produto produtoMaisCaro = new Produto();
        Double maiorPreco = Double.MIN_VALUE;
        if(!this.estoqueprodutosMap.isEmpty()){
            for(Produto produto: this.estoqueprodutosMap.values()){
                if(produto.getPreco() > maiorPreco){
                    maiorPreco = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }

        return produtoMaisCaro;
    }

}
