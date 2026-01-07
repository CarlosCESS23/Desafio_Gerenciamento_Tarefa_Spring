# 📋 Desafio Técnico: Sistema de Gerenciamento de Tarefas (To-Do List)

## 🚀 Sobre o Projeto
Este desafio consiste no desenvolvimento de uma aplicação **Web Full Stack** (ou API) para o gerenciamento de tarefas cotidianas. O objetivo principal é fornecer uma ferramenta onde o usuário tenha controle total sobre suas atividades através de uma interface funcional integrada a um banco de dados persistente.

---

## 🛠️ Stack Tecnológica
A aplicação deve ser construída utilizando as seguintes tecnologias:

* **Linguagem:** Java 17+
* **Framework:** Spring Boot 3.x / 4.x
* **Persistência:** Spring Data JPA
* **Banco de Dados:** PostgreSQL
* **Documentação:** Insomnia (SpringDoc OpenAPI)

---

## 🏗️ Modelagem de Dados
A entidade principal do sistema, **Tarefa**, deve seguir a estrutura abaixo:

| Campo | Descrição | Tipo |
| :--- | :--- | :--- |
| `id` | Identificador único (Primary Key) | Long / UUID |
| `nome` | Título curto da tarefa | String |
| `descricao` | Detalhamento da atividade | String/Text |
| `realizado` | Status de conclusão | Boolean |
| `prioridade` | Nível de urgência | Integer ou Enum |



---

## ⚙️ Requisitos Funcionais (CRUD)
O sistema deve implementar obrigatoriamente as seguintes operações:

1.  **Criar (POST):** Permitir a inclusão de novas tarefas.
2.  **Visualizar (GET):** Listar todas as tarefas cadastradas ou buscar por ID.
3.  **Editar (PUT):** Atualizar os dados de uma tarefa existente.
4.  **Excluir (DELETE):** Remover permanentemente uma tarefa do banco de dados.

---

## 📝 Instruções de Configuração

### Pré-requisitos
* JDK 17 ou superior.
* Maven ou Gradle instalado.
* Instância do PostgreSQL ativa.

### Configuração do Banco de Dados
No arquivo `src/main/resources/application.yml`, configure as credenciais:
```properties
spring.datasource.url:jdbc: postgresql://localhost:5432/nome_do_seu_banco
spring.datasource.username: seu_usuario
spring.datasource.password: sua_senha
spring.jpa.hibernate.ddl-auto: update
