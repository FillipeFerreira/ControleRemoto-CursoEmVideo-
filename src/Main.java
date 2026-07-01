public class Main {
    public static void main(String[] args) {

        ControleRemoto controle = new ControleRemoto();


        System.out.println("--- Teste com Controle Desligado ---");
        controle.abrirMenu();


        System.out.println("\n--- Ligando o controle e mexendo nas funções ---");
        controle.ligar();
        controle.play();
        controle.abrirMenu();
        controle.maisVolume();
        controle.maisVolume();

    }


}