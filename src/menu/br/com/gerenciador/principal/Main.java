package menu.br.com.gerenciador.menu;

public class Main {
    public static void main(String[] args) {
        GerenciadorBase gerenciador = new GerenciadorBase();

        Opcoes opcoes = new Opcoes(gerenciador);
        opcoes.exibirOpcoes();
    }
}

