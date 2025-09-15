package sistema_uptu;

public class chacara {
private municipio municipio;
    private double areaM2;
    private Integer vagas;
    private boolean possuiPocoArtesiano;

public Double calcularIPTU(){
    return this.areaM2 * this.municipio.getPrecoM2();    
}

    public chacara(municipio municipio, double areaM2, Integer vagas, boolean possuiPocoArtesiano) {
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

}