package menu.br.com.gerenciador.menu;

import java.util.Scanner;

public class Opcoes {
    private GerenciadorBase gerenciador;

    public Opcoes(GerenciadorBase gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibirOpcoes() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("DIGITE O NÚMERO DE ALGUMA DAS OPÇÕES ABAIXO");
            System.out.println("1 - ADICIONAR TAREFA");
            System.out.println("2 - EDITAR TAREFA");
            System.out.println("3 - REMOVER TAREFA");
            System.out.println("4 - SAIR");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    AdicionarTarefa adicionarTarefa = new AdicionarTarefa();
                    adicionarTarefa.adicionar(gerenciador);
                    break;
                case "2":
                    EditarTarefa editarTarefa = new EditarTarefa();
                    editarTarefa.listaTarefas = gerenciador.getListaTarefas();
                    editarTarefa.editar();
                    break;
                case "3":
                    RemoverTarefa removerTarefa = new RemoverTarefa();
                    removerTarefa.listaTarefas = gerenciador.getListaTarefas();
                    removerTarefa.remover();
                    break;
                case "4":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
