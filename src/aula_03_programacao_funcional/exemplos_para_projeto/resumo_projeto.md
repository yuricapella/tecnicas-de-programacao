# Resumo do Projeto - Gerenciador de Tarefas Inteligente

## Contexto
Desenvolver uma aplicação em Java que auxilie profissionais a organizar seu dia a dia, oferecendo uma experiência simples e eficiente. A startup contratante deseja uma solução capaz de gerenciar tarefas com foco em usabilidade e eficiência.

## Requisitos do Projeto

### Cadastro de Tarefas
- Cada tarefa deve incluir:
  - **Título**: Descrição curta e clara da tarefa.
  - **Descrição**: Detalhamento das ações que compõem a tarefa.
  - **Data limite (deadline)**: Prazo máximo para a conclusão da tarefa.
  - **Status**: Pode ser "Pendente", "Em andamento", ou "Concluído".
  
- Validações importantes:
  - Impedir o cadastro de tarefas com data limite no passado.
  - Garantir que títulos de tarefas não sejam muito curtos.
  - Assegurar que um status válido seja sempre atribuído à tarefa.

### Gerenciamento e Filtragem
- Exibir todas as tarefas cadastradas.
- Permitir a filtragem das tarefas por **status**.
- Listar as tarefas em ordem crescente de **data limite**.

### Notificações Inteligentes
- Implementar alertas automáticos para notificar os usuários quando uma tarefa estiver se aproximando do prazo de vencimento.

## Tecnologias e Conceitos Esperados

- **Manipulação de Datas**: Utilização da API `java.time` para gerenciar datas e prazos.
- **Programação Funcional**: Aplicação de **Streams**, **Optional** e **Predicate** para processar e validar os dados das tarefas.
- **Execução Assíncrona**: Uso de `CompletableFuture` para implementar notificações automáticas de maneira não bloqueante.
