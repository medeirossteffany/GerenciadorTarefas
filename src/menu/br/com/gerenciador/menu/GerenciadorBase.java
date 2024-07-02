package menu.br.com.gerenciador.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GerenciadorBase {
    protected List<Tarefas> listaTarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefas tarefa) {
        listaTarefas.add(tarefa);
        ordenarTarefas();
        exibirOrdemTarefas();
    }

    public Tarefas buscarTarefaPorTitulo(String titulo) {
        for (Tarefas tarefa : listaTarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                return tarefa;
            }
        }
        return null;
    }

    public void ordenarTarefas() {
        Collections.sort(listaTarefas, new Comparator<Tarefas>() {
            @Override
            public int compare(Tarefas t1, Tarefas t2) {
                return Integer.compare(Integer.parseInt(t1.getClassificacao()), Integer.parseInt(t2.getClassificacao()));
            }
        });
    }

    public List<Tarefas> getListaTarefas() {
        return listaTarefas;
    }

    public void exibirOrdemTarefas() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Tarefas:");
            for (Tarefas tarefa : listaTarefas) {
                System.out.println("Título: " + tarefa.getTitulo() + " - Descrição: " + tarefa.getDescricao() + " - Importância: " + tarefa.getClassificacao());
            }
        }
    }

    public void removerTarefa(Tarefas tarefa) {
        listaTarefas.remove(tarefa);
        exibirOrdemTarefas();
    }
}


