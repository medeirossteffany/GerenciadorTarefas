package menu.br.com.gerenciador.menu;

import java.util.Scanner;

public class RemoverTarefa extends GerenciadorBase {
    public void remover() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título da tarefa que deseja remover:");
        String findTitulo = scanner.nextLine();

        Tarefas tarefa = buscarTarefaPorTitulo(findTitulo);
        if (tarefa == null) {
            System.out.println("Tarefa não encontrada!");
            return;
        }

        listaTarefas.remove(tarefa);
        System.out.println("Tarefa removida com sucesso!");

        exibirOrdemTarefas();
    }
}




