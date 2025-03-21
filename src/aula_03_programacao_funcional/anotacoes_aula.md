# Exemplos de Programação Funcional com JavaScript

## 1. Função Simples
```javascript
function saudacao(){
    console.log("Hello World");
}

saudacao();
```

## 2. Função como Parâmetro
```javascript
function saudacao(function2){
    function2();
}
```

## 3. Atribuindo Função a uma Variável
```javascript
const saudar = function saudacao(){
    console.log("oi");
};
```

## 4. Composição de Funções
```javascript
function somar(n1, n2){
    return n1 + n2;
}

function multiplicar(n1, n2){
    return n1 * n2;
}

function compor(f1, f2){
    return function(a, b, c){
        return f1(f2(a, b), c);
    };
}

var somarDepoisMultiplicar = compor(multiplicar, somar);
multiplicar(somar(2+3) * 4); // 5 * 4 = 20
```

## 5. Chamadas de Funções Compostas
```javascript
console.log(somar(2, 3)); // 5
console.log(somarDepoisMultiplicar(2, 3, 4)); // 20
```

## 6. Programação Funcional com Lambda
```javascript
const somar = (n1, n2) => n1 + n2;
const multiplicar = (n1, n2) => n1 * n2;
const compor = (f1, f2) => (a, b, c) => f1(f2(a, b), c);

var somarDepoisMultiplicar = compor(multiplicar, somar);
```

## 7. Trabalhando com Listas

- **Filtrar dados em uma lista por condições específicas**
- **Ordenar dados em uma lista em uma condição específica**

Essas operações são simples de implementar com funções lambda.

## 8. Interfaces de Lambda

- **Function**  
  `(a) => a;`  
  `(a, b) => c;`

- **BiFunction**

- **Consumer**

- **Supplier**

## 9. Simplificação de Funções com Lambda
Lambda é uma forma de simplificar a manipulação de funções e a declaração delas.

```javascript
return switch (case){
    case 1 -> "a";
}
```