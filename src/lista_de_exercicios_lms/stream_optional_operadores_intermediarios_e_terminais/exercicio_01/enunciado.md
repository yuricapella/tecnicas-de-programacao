# 📌 Usando Predicates

## 📝 Introdução
A sintaxe de predicado (java.util.function.Predicate) foi introduzida no Java 8 como uma forma alternativa de lidar com impressões de avaliação no Lambda. A interface padrão é `Predicate`, onde `T` é um único argumento que retorna um valor booleano. Os predicados Java possuem um método funcional (abstrato) `test(Object)` que avalia esse predicado em um determinado objeto.

## 🎯 Objetivo
Complete o código dos métodos na classe fornecida para criar um `Predicate` que verifica se uma idade é menor que 18 e para remover todos os objetos da coleção onde o predicado retorna verdadeiro.

## 🔧 Passos para Implementação
1️⃣ Criar o método `criarVerificador`, que retorna um `Predicate<Integer>` que verifica se a idade é menor que 18.  
2️⃣ Criar o método `remover`, que utiliza o predicado para filtrar a coleção e remover os elementos que não atendem à condição.  
3️⃣ Testar a implementação usando a coleção de idades fornecida.

---
