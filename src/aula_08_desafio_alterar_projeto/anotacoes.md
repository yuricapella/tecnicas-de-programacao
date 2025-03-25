# 📌 Estrutura de Projetos Java e Padrões de Desenvolvimento

## 📝 Introdução
Este documento descreve a estrutura típica de um projeto Java, abordando a organização de pacotes, responsabilidades de classes e padrões de desenvolvimento. Além disso, explora a modelagem de APIs e a diferença entre aplicações monolíticas e microsserviços.

---

## 🎯 Estrutura do Projeto

🔹 Sempre procurar a **classe com método `main`** como ponto de entrada.  

🔹 **Pacotes principais**:
- **`model`** – Define os dados do negócio (modelo anêmico).
- **`repository`** – Responsável pela persistência e acesso aos dados.
- **`service`** – Contém as regras de negócio e operações principais.

🔹 **Pacotes de infraestrutura** (não diretamente ligados às regras de negócio):
- **`controller`** – Lida com a interação da aplicação com o usuário ou API.
- **`dto` (Data Transfer Object)** – Transporta dados entre camadas sem expor a estrutura interna.
- **`view`** – Usa o **Command Pattern**, garantindo que cada interação do usuário tenha uma classe específica.

---

## 🎯 Responsabilidades das Camadas

🔹 **Interface**: Define tudo que precisamos saber sobre uma funcionalidade.  
Se for necessário entender a implementação, deve-se analisar a classe concreta.  

🔹 **Repository**:  
- Configura e gerencia o acesso aos dados.  

🔹 **Service**:  
- Implementa as regras de negócio.  
- Contém as operações mais importantes do projeto.  
- Segue o princípio de **um serviço por modalidade**.  

🔹 **Model**:  
- Define os dados do negócio.  
- Geralmente segue um **modelo anêmico**, ou seja, apenas declara os atributos.  

🔹 **Controller**:  
- Responsável por intermediar a entrada do usuário e a lógica de negócio.  

🔹 **DTO (Data Transfer Object)**:  
- Transporta dados entre camadas sem expor diretamente o modelo.  
- No contexto do **Controller**, pode ser usado para atualizar entidades.  

🔹 **View**:  
- Utiliza o **Command Pattern**, garantindo modularidade nas interações do usuário.  

---

## 🎯 Aplicação Monolítica vs. Microsserviços

🔹 **Aplicação Monolítica**:  
- Todo o sistema está unificado em um único código-base.  

🔹 **Microsserviços**:  
- Arquitetura distribuída onde cada serviço é independente.  
- Cada equipe é responsável por um serviço específico.  
- Maior escalabilidade e flexibilidade no desenvolvimento.  

---

## 🎯 Padrão para Desenvolvimento de API

🔹 A estrutura básica segue:
- **`model`** – Define a estrutura dos dados.
- **`repository`** – Gerencia a persistência.
- **`service`** – Implementa a lógica de negócio.  

🔹 **Processo de Modelagem**:
1. Identificar as **entidades principais** (ex: Aluguel, Cliente, TipoContrato).  
2. Criar classes para representar esses conceitos, sem focar em algoritmos ou validações iniciais.  
3. Modelagem é iterativa – refinar conforme necessário.  

🔹 **Fluxo de desenvolvimento**:
1. Criar interfaces primeiro para definir os contratos.  
2. Ter clareza do **objetivo do projeto** antes de implementar a lógica.  
3. Em grandes projetos, a modelagem é feita por **arquitetos**, e os times traduzem essa modelagem para implementações concretas.  
4. Em projetos do zero, o processo é mais iterativo e experimental.  

---
