package atividade1;

import java.lang.classfile.constantpool.FloatEntry;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador){
        this.computador = computador;
    }

    public Computador geComputador(){
        return computador;
    }

    public void setComputador(Computador computador){
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p){
        if(p.getSSDOcupado() > computador.getSSD()){
            System.out.println("Erro na istalacao: SSD Insuficiente!");
            return false;
        }
        if(p.getMemoriaRamAlocada() > computador.getMemoriaRam()){
            System.out.println("Erro na execucao: Memoria Ram Insuficiente!");
            return false;
        }
        float tempoExecucao = (float) p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleo());
        
        System.out.println("Programa executado com Sucesso!");
        System.out.println("Tempo de execucao: " + tempoExecucao + "segundos.");

        return true;
    }
}

