package main.java.collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public Map<String, Integer> getAgendaContatoMap() {
        return agendaContatoMap;
    }

    public void setAgendaContatoMap(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = agendaContatoMap;
    }
    
    public void adicionarContato(String nome, Integer telefone){
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!this.agendaContatoMap.isEmpty() && this.agendaContatoMap.containsKey(nome)){
            this.agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        if(!this.agendaContatoMap.isEmpty() && this.agendaContatoMap.containsKey(nome)){
            return this.agendaContatoMap.get(nome);
        }
        return null;
    }
}
