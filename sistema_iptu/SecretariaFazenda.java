package sistema_iptu;

public class SecretariaFazenda {
    public static void main(String[] args) {
        municipio municipio = new municipio("Brasília", "DF", 31.5);
        apartamento apt = new apartamento(municipio, 63.0, 0, true);

        System.out.println("IPTU R$: " + apt.calcularIPTU());
    }
}