
# 📌 Atualizações no Projeto de Gerenciamento de Tarefas

## 📝 Introdução
Este documento detalha as alterações realizadas nas tarefas 2, 3 e 4 do projeto, abordando a adição de um novo status, melhorias na filtragem e ordenação, além da formatação da data na saída.

📌 **Atualizações:** As mudanças foram aplicadas na branch [`demo`](https://github.com/yuricapella/gerenciador-de-tarefas/tree/demo) do projeto *Gerenciador de Tarefas* deste módulo.

---

## 🎯 Tarefa 2 e 4 - Adição de Novo Status e Ordenação por ID

### 🔹 Atualização do Enum `Status`
- Adicionado o novo status **"Bloqueado"** na enum `Status` da classe `Task`.

### 🔹 Validação de Status no `AbstractTaskController`
- O método `createTask` chama funções para validação de status, implementadas na classe filha.
- A classe `TaskControllerImpl` já realiza validações de status, porém, o novo status "Bloqueado" ainda não possui validação implementada. Caso seja necessário, futuras validações podem ser adicionadas nessa estrutura.


### 🔹 Atualização na Classe `FilterTasksByStatusCommand`
- Adicionada nova opção de filtro:
  ```java
  view.showMessage("4 - Por Id");
  ```
- Atualização no `switch`:
  ```java
  case 4 -> "id";
  ```
- Adicionado comparador para ordenação por ID:
  ```java
  public static final Comparator<Task> BY_ID = Comparator.comparing(Task::getId);
  ```
- Ajuste na função `getComparator` para incluir `BY_ID` no `switch`.

### 🔹 Atualizações nas Classes de Filtragem
- **Alterações replicadas em**:
    - `FilterTasksByCustomPredicateCommand`
    - `ListTasksCommand`

### 🔹 Atualização nos Comandos de Criação e Atualização de Tarefas
- **`UpdateTaskCommand`**: Alteração na `String status` para incluir **"Bloqueado"**.
- **`CreateTaskCommand`**: Mesma alteração.
- **`UpdateTaskStatusCommand`**: `String status` atualizado para incluir **"Bloqueado"**.
- **`FilterTasksByStatusCommand`**: No método `execute()`, `String statusInput` atualizado para exibir **"Bloqueado"**.

---

## 🎯 Tarefa 3 - Formatação da Data na `Task`

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
