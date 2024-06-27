package main.java.collections.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public Map<LocalDate, Evento> getEventosMap() {
        return eventosMap;
    }

    public void setEventosMap(Map<LocalDate, Evento> eventosMap) {
        this.eventosMap = eventosMap;
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println(entry.getKey() + " - " + entry.getValue());
                break;
            }
        }
    }
}
