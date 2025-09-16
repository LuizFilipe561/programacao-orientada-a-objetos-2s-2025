package atividade1;

public class Programa {
    private int MemoriaRamAlocada;
    private int SSDOcupado;
    private int Nucleos;
    private Double QuantidadeOperacoes;

    public Programa(int MemoriaRamAlocada, int SSDOcupado, int Nucleos, Double QuantidadeOperacoes) {
        this.MemoriaRamAlocada = MemoriaRamAlocada;
        this.SSDOcupado = SSDOcupado;
        this.Nucleos = Nucleos;
        this.QuantidadeOperacoes = QuantidadeOperacoes;
    }

    public int getMemoriaRamAlocada() {
        return this.MemoriaRamAlocada;
    }

    public void setMemoriaRamAlocada(int MemoriaRamAlocada) {
        this.MemoriaRamAlocada = MemoriaRamAlocada;
    }

    public int getSSDOcupado() {
        return this.SSDOcupado;
    }

    public void setSSDOcupado(int SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public int getNucleos() {
        return this.Nucleos;
    }

    public void setNucleos(int Nucleos) {
        this.Nucleos = Nucleos;
    }

    public Double getQuantidadeOperacoes() {
        return this.QuantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Double QuantidadeOperacoes) {
        this.QuantidadeOperacoes = QuantidadeOperacoes;
    }

}
