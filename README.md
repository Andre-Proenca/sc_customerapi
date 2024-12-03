# CRUD de Clientes - Spring Boot

Este projeto foi desenvolvido como parte de um desafio para criar um sistema de **CRUD** (Create, Read, Update, Delete) completo para gerenciar clientes, utilizando **Spring Boot** e boas práticas de desenvolvimento.

## 🎯 Desafio

O objetivo deste projeto é implementar um serviço RESTful contendo as operações básicas para manipulação de recursos de clientes.

### Funcionalidades Implementadas
- **Busca Paginada de Clientes**
- **Busca de Cliente por ID**
- **Cadastro de Novo Cliente**
- **Atualização de Cliente**
- **Exclusão de Cliente**

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Maven**
- **Banco de Dados H2 (ambiente de testes)**

---

## 📂 Estrutura do Projeto

### Entidade **Client**
A entidade `Client` segue o seguinte modelo:

| Campo               | Tipo         | Restrição                      |  
|----------------------|--------------|--------------------------------|  
| `id`                | Long         | Gerado automaticamente         |  
| `name`              | String       | Não pode ser vazio             |  
| `cpf`               | String       | Único                          |  
| `income`            | Double       | Nenhuma                        |  
| `birthDate`         | LocalDate    | Não pode ser uma data futura   |  
| `children`          | Integer      | Nenhuma                        |  

---

## 🚀 Recursos

### 🧩 Validações Implementadas

- **Nome**: Não pode ser vazio.
- **Data de Nascimento**: Não pode ser futura (`@PastOrPresent`).
- **Tratamento de Exceções**:
    - ID não encontrado (`404 Not Found`).
    - Erro de validação dos campos (`422 Unprocessable Entity`), com mensagens customizadas.

---

### 🔍 Exemplos de Uso

#### 1️⃣ Busca Paginada de Clientes
**GET** `/clients?page=0&size=10&sort=name,asc`

#### 2️⃣ Busca de Cliente por ID
**GET** `/clients/{id}`

#### 3️⃣ Inserir Novo Cliente
**POST** `/clients`  
**Body**:
```json  
{  
  "name": "João Silva",  
  "cpf": "123.456.789-00",  
  "income": 5000.0,  
  "birthDate": "1985-10-15",  
  "children": 2  
}
```
#### 📊 Seed de Dados
O projeto insere automaticamente 10 clientes com dados significativos no banco H2 para facilitar a utilização.
#### 🙋‍♂️ Autor
Projeto desenvolvido por André Proença.

