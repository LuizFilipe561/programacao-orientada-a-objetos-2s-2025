package atividade1;

public class Main {
    public static void main(String[] args){
        Computador meuPc = new Computador(8, 256, 4, 2.5f);

        SistemaOperacional windows = new SistemaOperacional(meuPc);

        Programa chrome = new Programa(2, 10 , 2, 10000);

        Programa jogoPesado = new Programa(4, 300, 2, 50000);

        Programa editorVideo = new Programa(16, 20, 2, 20000);

        System.out.println("Teste 1: Programa que roda com sucesso");
        windows.executarPrograma(chrome);

        System.out.println("Teste 2: Erro na Istalacao (SSD Insuficiente)");
        windows.executarPrograma(jogoPesado);

        System.out.println("Teste 3: Erro na execucao (Ram Insuficiente)");
        windows.executarPrograma(editorVideo);
    }
    
}
