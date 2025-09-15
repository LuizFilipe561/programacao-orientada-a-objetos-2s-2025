package sistema_iptu;

public class Imovel {
    private municipio municipio;
    private double areaM2;
    private Integer vagas;

    public Double calcularIPTU(){
    return this.areaM2 * this.municipio.getPrecoM2();
}

    public Imovel(municipio municipio, double areaM2, Integer vagas) {
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
    }

    public municipio getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(municipio municipio) {
        this.municipio = municipio;
    }

    public double getAreaM2() {
        return this.areaM2;
    }

    public void setAreaM2(double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

}
