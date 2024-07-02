# Projeto de Gerenciamento de Tarefas

Este é um sistema simples de gerenciamento de tarefas desenvolvido em Java. O sistema permite aos usuários adicionar, editar, remover e visualizar suas tarefas de forma organizada, com base no nível de importância.

## Funcionalidades

- **Adicionar Tarefas**: Permite que os usuários adicionem tarefas com título, descrição e nível de importância (1-5).
- **Editar Tarefas**: Os usuários podem editar o título, descrição ou nível de importância das tarefas existentes.
- **Remover Tarefas**: Facilita a remoção de tarefas que não são mais necessárias.
- **Visualizar Tarefas**: Sempre exibe a lista atualizada de tarefas após qualquer operação, mostrando o título, descrição e nível de importância. Se não houver tarefas, uma mensagem "Lista vazia" será exibida.

## Estrutura do Projeto

O projeto está organizado em várias classes, cada uma responsável por uma funcionalidade específica:

- `GerenciadorBase`: Classe base que gerencia a lista de tarefas, incluindo métodos para adicionar, buscar, ordenar, exibir e remover tarefas.
- `AdicionarTarefa`: Classe que lida com a adição de novas tarefas.
- `EditarTarefa`: Classe que lida com a edição de tarefas existentes.
- `RemoverTarefa`: Classe que lida com a remoção de tarefas.
- `Opcoes`: Classe que apresenta o menu de opções ao usuário e executa a operação correspondente.
- `Main`: Classe principal que inicia o sistema.

## Como Executar

1. Clone o repositório para a sua máquina local.
2. Abra o projeto em sua IDE Java preferida (IntelliJ IDEA ou Eclipse).
3. Compile e execute a classe `Main`.
