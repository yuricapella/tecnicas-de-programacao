
# 📌 Atualizações no Projeto de Gerenciamento de Tarefas

## 📝 Introdução
Este documento detalha as alterações realizadas nas tarefas 2, 3, 4 e 5 do arquivo, abordando a adição de um novo status, melhorias na filtragem e ordenação, além da formatação da data na saída. Essas modificações foram realizadas conforme os objetivos definidos na [atividade de atualização do projeto de tarefas inteligentes](https://github.com/yuricapella/tecnicas-de-programacao/blob/main/src/aula_08_desafio_alterar_projeto/atividade.md).


📌 **Atualizações:** As mudanças foram aplicadas na branch [`demo`](https://github.com/yuricapella/gerenciador-de-tarefas/tree/demo) do projeto *Gerenciador de Tarefas* deste módulo.

---

## 🎯 Tarefa 2, 3 e 5 - Implementação do Status "Bloqueado", Exibição nos Filtros, Criações, Atualizações e Ordenação por ID

### 🔹 Atualização do Enum `Status`
- Adicionado o novo status **"Bloqueado"** na enum `Status` da classe `Task`.

### 🔹 Ordenação por ID em Filtragem
- **Classes Alteradas para Ordenação por ID:**
  - **`FilterTasksByStatusCommand`**
  - **`ListTasksCommand`**
  - **`FilterTasksByCustomPredicateCommand`**

- **Opção de Filtro Adicionada:**  
  No método `getSortingMethod()` foi incluída a opção:
  ```java
  view.showMessage("4 - Por Id");
  ```
- **Atualização do Critério de Ordenação:**  
  No `switch` dentro do método que define o critério, foi adicionado:
  ```java
  case 4 -> "id";
  ```
  - Note que o retorno do método `getSortingMethod()` é:
    ```java
    Optional.of(TaskComparators.getComparator(criteria, reversed));
    ```
    Foi através desse retorno que identifiquei a necessidade de seguir o padrão existente em `TaskComparators`.
- **Implementação do Comparador:**  
  Em `TaskComparators`, foi adicionado o comparador para ordenação por ID:
  ```java
  public static final Comparator<Task> BY_ID = Comparator.comparing(Task::getId);
  ```
- **Ajuste Final:**  
  A função `getComparator` foi ajustada para incluir `BY_ID` no `switch`.

### 🔹 Atualização nos Comandos de Criação e Atualização de Tarefas
Foram realizadas alterações para garantir que o status **"Bloqueado"** seja exibido corretamente nos métodos `execute()` dos seguintes comandos:
- **`FilterTasksByStatusCommand`**:  
  - Variável `String statusInput`
- **`UpdateTaskStatusCommand`**:  
  - Variável `String status`
- **`UpdateTaskCommand`**:  
  - Variável `String status`
- **`CreateTaskCommand`**:  
  - Variável `String statusStr`
---

## 🎯 Tarefa 4 - Formatação da Data na `Task`

### 🔹 Atualização no Método `toString()`
- Formatação de data para o padrão **"dd/MM/yyyy"**:
  ```java
  public String toString() {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String deadLineFormated = deadline.format(formatter);
      return String.format(
          "📌 Tarefa #%d%nTítulo: %s%nDescrição: %s%n📅 Prazo: %s%n🔄 Status: %s%n",
          id, title, description, deadLineFormated, status.getDescricao()
      );
  }
  ```
