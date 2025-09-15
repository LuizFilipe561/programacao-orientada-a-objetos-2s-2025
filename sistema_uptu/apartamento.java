package sistema_uptu;

public class apartamento {
    private municipio municipio;
    private double areaM2;
    private Integer vagas;

    public Double calcularIPTU(){
    return this.areaM2 * this.municipio.getPrecoM2();
}
}
