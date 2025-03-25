# 📌 Manutenção no Projeto de Tarefas Inteligentes

## 📝 Introdução
Esta atividade envolve a atualização e aprimoramento do sistema de tarefas inteligentes, incluindo a adição de um novo status, correções de formato de data e melhorias na ordenação de tarefas.

## 🎯 Objetivo
1️⃣ Atualizar o projeto baixando a versão mais recente.  
2️⃣ Implementar o novo **STATUS: Bloqueado**, que será um intermediário entre **"Em andamento"** e **"Concluído"**.  
3️⃣ Exibir corretamente o **status "Bloqueado"** na criação e nos filtros de tarefas.  
4️⃣ Corrigir o **formato da data** exibida no console para o usuário.  
5️⃣ (Extra) Permitir **ordenação por ID** de forma crescente e decrescente ao listar tarefas.

## 🔧 Passos para Implementação
1️⃣ Baixar os arquivos atualizados da **branch demo**.  
2️⃣ Adicionar o novo status **"Bloqueado"** e garantir que ele apareça na criação e nos filtros.  
3️⃣ Ajustar o formato da **data** para uma exibição mais clara no console.  
4️⃣ Implementar uma **opção de ordenação por ID**, perguntando ao usuário se deseja a ordem **decrescente**.

---


# 📌 Atualizações no Projeto de Gerenciamento de Tarefas

## 📝 Introdução
Este documento detalha as alterações realizadas nas tarefas 2, 3 e 4 do projeto, abordando a adição de um novo status, melhorias na filtragem e ordenação, além da formatação da data na saída.

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
