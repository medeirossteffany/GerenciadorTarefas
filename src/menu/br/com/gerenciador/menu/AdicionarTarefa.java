package menu.br.com.gerenciador.menu;

import java.util.Scanner;

public class AdicionarTarefa {
    public void adicionar(GerenciadorBase gerenciador) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O TITULO DA TAREFA");
        String titulo = scanner.nextLine();
        System.out.println("DIGITE A DESCRICAO DA TAREFA");
        String descricao = scanner.nextLine();
        System.out.println("DIGITE A CLASSIFICAÇÃO DA TAREFA (1-5)");
        String classificacao = scanner.nextLine();

        Tarefas tarefa = new Tarefas();
        tarefa.setTitulo(titulo);
        tarefa.setDescricao(descricao);
        tarefa.setClassificacao(classificacao);

        gerenciador.adicionarTarefa(tarefa);
    }
}





