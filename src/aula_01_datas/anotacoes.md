# 📚 Conteúdo da Aula

### 🔗 **Materiais de Referência**
- **Repositório do professor:** [GitHub](https://github.com/marceltanuri/1322-java-tecnicas-programacao)
- **Slides da aula:** [Acesse aqui](https://marceltanuri.github.io/1322-java-tecnicas-programacao/)
- **Aula específica:** [Clique aqui](https://marceltanuri.github.io/1322-java-tecnicas-programacao/aula1/)

### 🕒 **Evolução da Manipulação de Datas em Java**
- Antes do **Java 8**, eram utilizadas as classes `java.util.Date` e `java.util.Calendar`, que apresentavam diversas limitações.
- O pacote **`java.time`** trouxe melhorias significativas na manipulação de datas.
- Muitos códigos seguem boas práticas como **SOLID**, sendo usados como base para a construção de APIs e bibliotecas.

### 📌 **Principais Classes do `java.time`**
- **`LocalDate`** → Representa uma data sem horário.
- **`LocalTime`** → Representa apenas um horário.
- **`LocalDateTime`** → Combina data e horário.
- **`ZonedDateTime`** → Inclui fuso horário.
- **`Period`** → Calcula a diferença entre datas em anos, meses e dias.
- **`Duration`** → Mede tempo entre instantes (horas, minutos, segundos).

### 🕒 **Timestamps e `Instant`**
- `LocalDate` gera um **timestamp**, que representa o tempo em milissegundos desde 1970.
- É comum usar timestamps como números inteiros para representar datas.
- Exemplo:
  ```java
  Instant timestamp = Instant.now();
  System.out.println("Timestamp (Instant): " + timestamp);
  System.out.println("Milissegundos desde 1970: " + timestamp.toEpochMilli());
  ```
  **Saída:**
  ```
  Timestamp (Instant): 2025-03-07T23:09:47.133454700Z
  Milissegundos desde 1970: 1741388987133
  ```

### 🚀 **Curiosidades sobre `LocalDate`**
- **`LocalDate` não pode ser instanciado diretamente** com `new` porque não possui construtor público.
- A classe é **final**, impedindo herança, mas isso não bloqueia sua instanciação.
- Seu **construtor é privado**, o que impede a criação direta de objetos.
- O método **`.now()`** é próprio de cada classe (`LocalDate`, `LocalTime` etc.), **não é polimorfismo**.
- O **`.now()`** considera o fuso horário configurado na **JVM**, que pode ser diferente do fuso do computador do usuário.
- O método `.now()` é **static** e serve como fábrica de objetos `LocalDate`.

Aqui está uma reformulação do exemplo com mais casos de uso práticos:

---

### ✨ **Exemplos de Uso do `LocalDate`**

#### 📌 **Obter a Data Atual**
```java
LocalDate hoje = LocalDate.now();
System.out.println("Data atual: " + hoje);
```
**Saída:**
```
Data atual: 2025-03-11
```

#### 📌 **Obter o Dia da Semana**
```java
LocalDate date = LocalDate.now();
System.out.println("Dia da semana: " + date.getDayOfWeek());
```
**Saída:**
```
Dia da semana: TUESDAY
```

#### 📌 **Criar uma Data Específica**
```java
LocalDate dataEspecifica = LocalDate.of(2024, 12, 25);
System.out.println("Data escolhida: " + dataEspecifica);
```
**Saída:**
```
Data escolhida: 2024-12-25
```

#### 📌 **Adicionar ou Remover Dias, Meses e Anos**
```java
LocalDate hoje = LocalDate.now();
LocalDate futuro = hoje.plusDays(10);
LocalDate passado = hoje.minusMonths(1);

System.out.println("Data atual: " + hoje);
System.out.println("Daqui a 10 dias: " + futuro);
System.out.println("Um mês atrás: " + passado);
```
**Saída:**
```
Data atual: 2025-03-11
Daqui a 10 dias: 2025-03-21
Um mês atrás: 2025-02-11
```