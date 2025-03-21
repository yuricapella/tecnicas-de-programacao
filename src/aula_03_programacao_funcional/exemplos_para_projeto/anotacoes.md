# Criar um Gerenciador de Tarefas Inteligente

## Link do Enunciado do Projeto
[Projeto - Gerenciador de Tarefas](https://marceltanuri.github.io/1322-java-tecnicas-programacao/projeto/)

## Entrada de Dados
Manter (CRUD) o cadastro de tarefas

### Tecnologias Utilizadas:
- **Rest API**
  - HTTP
  - Servidor HTTP (instalado na sua app)
  - Client HTTP (browser, CLI/curl, Postman)
- **PWA** (Página na internet, acessível no mobile)
- **CLI**
  - `System.in` (Scanner)

## Saída de Dados
- HTTP
- Página WEB
- CLI (`System.out.print`)

## Processamento
- **Linguagem:** Java
- **Bibliotecas adicionais:** Não precisa

## Armazenamento
- Banco de Dados
- Sistema de Arquivos
- API
- Lista em Memória (inMemory)

**Vamos utilizar:** Scanner, prints e Memória.

---

## Arquitetura - Padrão MVC

### Pacotes do Projeto
```plaintext
br.com.ada.t1322.tecnicasprogramacao.projeto.app
└── main

br.com.ada.t1322.tecnicasprogramacao.projeto.model
└── service
└── repository

br.com.ada.t1322.tecnicasprogramacao.projeto.view
└── Parte visual (códigos de Scanner)

br.com.ada.t1322.tecnicasprogramacao.projeto.controller
```

### Camadas e Responsabilidades
- **Model** - Opera as solicitações recebidas do controller.
  - Service
  - Repository
- **View** - Trata da apresentação da aplicação (Scanner).
- **Controller** - Encaminha as solicitações da View para o Model e vice-versa.

