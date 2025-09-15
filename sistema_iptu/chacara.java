package sistema_iptu;

public class chacara extends Imovel{
    private Boolean possuiPocoArtesiano;

    public chacara(municipio municipio, Double areaM2, Integer vagas, Boolean possuiPocoArtesiano) {
        super(municipio, areaM2, vagas);
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

    public Boolean getPossuiPocoArtesiano() {
        return this.possuiPocoArtesiano;
    }

    public void setPossuiPocoArtesiano(Boolean possuiPocoArtesiano) {
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

}