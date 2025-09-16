package atividade1;

public class Computador {
    private int MemoriaRam;
    private int SSD;
    private int Nucleo;
    private float OperacoesPorSegundo;


    public Computador(int MemoriaRam, int SSD, int Nucleo, float OperacoesPorSegundo) {
        this.MemoriaRam = MemoriaRam;
        this.SSD = SSD;
        this.Nucleo = Nucleo;
        this.OperacoesPorSegundo = OperacoesPorSegundo;
    }

    public int getMemoriaRam() {
        return this.MemoriaRam;
    }

    public void setMemoriaRam(int MemoriaRam) {
        this.MemoriaRam = MemoriaRam;
    }

    public int getSSD() {
        return this.SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public int getNucleo() {
        return this.Nucleo;
    }

    public void setNucleo(int Nucleo) {
        this.Nucleo = Nucleo;
    }

    public float getOperacoesPorSegundo() {
        return this.OperacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(float OperacoesPorSegundo) {
        this.OperacoesPorSegundo = OperacoesPorSegundo;
    }

}
