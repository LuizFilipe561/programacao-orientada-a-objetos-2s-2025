package sistema_uptu;
import java.util.Objects;

public class casa extends Imovel {
    private municipio municipio;
    private double areaM2;
    private Integer vagas;

    public Double calcularIPTU(){
    return this.areaM2 * this.municipio.getPrecoM2();
}

    public casa(municipio municipio, double areaM2, Integer vagas) {
        super(municipio, areaM2, vagas);
    }
}