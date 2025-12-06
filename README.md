### Webservices JPA

[![Java](https://img.shields.io/badge/Java-17-blue)]()
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)]()
[![JPA / Hibernate](https://img.shields.io/badge/JPA-Hibernate-orange)]()
[![Status](https://img.shields.io/badge/Status-Ativo-success)]()

Este projeto implementa uma API REST em Java utilizando Spring Boot, Spring Data JPA e Hibernate.  
O objetivo é demonstrar a construção de webservices profissionais com persistência de dados, mapeamento ORM, relacionamento entre entidades e boas práticas de arquitetura backend.

### 🧰 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- Banco H2 (em memória)  
- Maven  

---

### 📄 Descrição do Projeto

A aplicação consiste em uma API REST organizada em camadas, permitindo realizar operações CRUD e gerenciar entidades com persistência via JPA/Hibernate.

Conceitos aplicados:

- CRUD completo  
- Relacionamentos entre entidades (OneToMany, ManyToOne, ManyToMany)  
- Tratamento customizado de exceções  
- Padrão de arquitetura em camadas  
- Script `import.sql` para carga inicial de dados  
- Banco em memória (H2) para fácil execução e testes  

---

### 🏛 Arquitetura da Aplicação

O projeto segue a arquitetura em camadas, com funções bem definidas:

- **Controller**: expõe os endpoints REST  
- **Service**: regras de negócio  
- **Repository**: acesso ao banco via JPA  
- **Entities**: mapeamento ORM das tabelas

 ---

  ### 🚀 Como Executar o Projeto

Siga os passos abaixo para rodar a aplicação localmente.

### **1. Clonar o repositório**
```bash
git clone https://github.com/lutheone/webservices-jpa.git
```
### **2. Acessar o diretório**
```bash
cd webservices-jpa
```
### **3. Executar a aplicação**
```bash
mvn spring-boot:run
```
### **4. Acessar o H2 Console (opcional)**
```bash
http://localhost:8080/h2-console
```
### **5. Configurações do H2**
```bash
JDBC URL: jdbc:h2:mem:testdb
Usuário:
Senha:
```
### **6. Testar endpoint (exemplo)**
```bash
GET http://localhost:8080/users
```
---

### 🎥 **Breve apresentação sobre o projeto:**

- [Apresentação](https://www.linkedin.com/feed/update/urn:li:activity:7385047725844705280/)

