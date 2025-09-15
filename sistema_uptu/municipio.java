package sistema_uptu;

public class municipio {
    private String nome;
    private String estado;
    private Double precoM2;

    public municipio(String nome, String estado, Double precoM2){
        this.nome = nome;
        this.estado = estado;
        this.precoM2 = precoM2;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public Double getPrecoM2(){
        return this.precoM2;
    }
    
    public void setPrecoM2(double precoM2){

    }
}
