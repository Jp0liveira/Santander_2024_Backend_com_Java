package main.java.coparableXcomparato.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: this.tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        this.tarefaList.removeAll(tarefasParaRemover);
    }

    public Integer obterNumeroTotalTarefas(){
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(this.tarefaList);
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }
    
    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa(
            "lista tarefa 1"
        );
        listaTarefa.adicionarTarefa(
            "lista tarefa 2"
        );
        
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}
