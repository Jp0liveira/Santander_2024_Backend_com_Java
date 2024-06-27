package main.java.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public Set<Contato> getContatoSet() {
        return contatoSet;
    }

    public void setContatoSet(Set<Contato> contatoSet) {
        this.contatoSet = contatoSet;
    }
    
    public void adicionarContato(String nome, String numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos (){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato contato : this.contatoSet) {
            if(contato.getNome().startsWith(nome)){
                contatosEncontrados.add(contato);   
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero){
        Contato contatoParaAtualizar = new Contato();
        for (Contato contato : this.contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contatoParaAtualizar = contato;
                contato.setNumero(novoNumero);
                break;
            }
        }
        return contatoParaAtualizar;
    }

}
