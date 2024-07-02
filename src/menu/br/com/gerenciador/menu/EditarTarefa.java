package menu.br.com.gerenciador.menu;

import java.util.Scanner;

public class EditarTarefa extends GerenciadorBase {
    public void editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título da tarefa que deseja editar:");
        String findTitulo = scanner.nextLine();

        Tarefas tarefa = buscarTarefaPorTitulo(findTitulo);
        if (tarefa == null) {
            System.out.println("Tarefa não encontrada!");
            return;
        }

        System.out.println("DIGITE A OPÇÃO QUE DESEJA EDITAR");
        System.out.println("1- TITULO");
        System.out.println("2- DESCRIÇÃO");
        System.out.println("3- CLASSIFICAÇÃO");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo título:");
                String novoTitulo = scanner.nextLine();
                tarefa.setTitulo(novoTitulo);
                break;
            case 2:
                System.out.println("Digite a nova descrição:");
                String novaDescricao = scanner.nextLine();
                tarefa.setDescricao(novaDescricao);
                break;
            case 3:
                System.out.println("Digite a nova classificação (1-5):");
                String novaClassificacao = scanner.nextLine();
                tarefa.setClassificacao(novaClassificacao);
                ordenarTarefas();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Tarefa atualizada com sucesso!");
        exibirOrdemTarefas();
    }
}
