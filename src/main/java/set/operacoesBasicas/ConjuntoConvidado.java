package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    
    private Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodConvite(int codigoConvite){
        Convidado convidadoParaRemover = new Convidado();
        for (Convidado convidado : this.convidados) {
            if(convidado.getCodigo() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidado(){ return this.convidados.size(); }

    public void exibirConvidados (){
        System.out.println(convidados);
    }

}
