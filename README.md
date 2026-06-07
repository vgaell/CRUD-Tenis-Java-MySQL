# CRUD Tênis - Java + MySQL

Projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos utilizando Java Swing, JDBC e MySQL.

## 📋 Descrição

Sistema de cadastro de tênis desenvolvido seguindo a arquitetura em camadas:

- DTO (Data Transfer Object)
- DAL (Data Access Layer)
- BLL (Business Logic Layer)
- UI (Interface Gráfica)

O sistema permite realizar operações básicas de CRUD (Create, Read, Update e Delete) em um banco de dados MySQL.

---

## 🚀 Tecnologias Utilizadas

- Java
- Java Swing
- JDBC
- MySQL
- Apache NetBeans
- Git/GitHub

---

## 📂 Estrutura do Projeto

```
src
├── BLL
│   └── TenisBLL.java
│
├── DAL
│   ├── Conexao.java
│   └── TenisDAL.java
│
├── DTO
│   └── TenisDTO.java
│
├── UI
│   ├── FrmPrincipal.java
│   ├── FrmCadastroTenis.java
│   └── Principal.java
│
└── imagens
    ├── fundotenis.png
    └── iconetenis.png
```

---

## ⚙️ Funcionalidades

- ✅ Cadastrar tênis
- ✅ Alterar tênis
- ✅ Excluir tênis
- ✅ Interface gráfica em Java Swing
- ✅ Integração com banco de dados MySQL

---

## 🗄️ Banco de Dados

### Criação do banco

```sql
CREATE DATABASE provaA1;

USE provaA1;

CREATE TABLE Tenis (
    tenID INT AUTO_INCREMENT PRIMARY KEY,
    tenFabricante VARCHAR(100) NOT NULL,
    tenModelo VARCHAR(100) NOT NULL
);
```

---

## 🔧 Configuração da Conexão

Arquivo:

```java
DAL/Conexao.java
```

Exemplo:

```java
String url = "jdbc:mysql://localhost:3306/provaA1";
String usuario = "root";
String senha = "UDF2026";
```

Altere os dados conforme a configuração do seu MySQL.

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/vgaell/CRUD-Tenis-Java-MySQL.git
```

2. Crie o banco de dados utilizando o script SQL.

3. Configure usuário e senha no arquivo:

```java
Conexao.java
```

4. Abra o projeto no Apache NetBeans.

5. Execute a classe:

```java
UI.Principal
```

---

## 👨‍💻 Autor

Victor Gael

Projeto desenvolvido para fins acadêmicos.
