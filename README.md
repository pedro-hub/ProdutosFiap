# Produtos FIAP (Java)

> Projeto desenvolvido para **conclusão do certificado da FIAP em Java Development**.

Mini-sistema de **Produtos e Categorias** com operações de cadastro/consulta/alteração.
A interação com o usuário é feita por janelas do **Swing** usando `JOptionPane`.
Os dados ficam armazenados **em memória** (coleções), simulando um CRUD simples.

---

## Intuito do projeto

Consolidar fundamentos de **Java** e **Programação Orientada a Objetos (POO)** e entender, na prática, como organizar um projeto por responsabilidades (camadas), mesmo em um sistema pequeno.

---

## Como funciona (passo a passo)

1. Ao iniciar, a classe `Main` exibe um menu de opções.
2. O usuário escolhe uma ação (ex.: cadastrar produto, consultar por id).
3. A camada `view` abre formulários/seleções com `JOptionPane`.
4. Os objetos são salvos e consultados através das classes `repository`, que mantêm os dados em listas.
5. O resultado é exibido novamente pela `view`.

---

## Funcionalidades

- Cadastrar categoria
- Cadastrar produto
- Alterar produto
- Consultar produto por ID
- Consultar produtos por categoria

---

## Estrutura do projeto

```text
src/main/java/br/com/fiap/produtos/
  Main.java
  Model/
	Categoria.java
	Produto.java
  repository/
	CategoriaCollectionRepository.java
	ProdutoCollectionRepository.java
  view/
	CategoriaView.java
	ProdutoView.java
	Opcao.java
	OpcaoView.java
```

### Responsabilidade de cada camada

- `Model`: entidades do domínio (dados que representam Produto e Categoria).
- `repository`: regras de armazenamento e consulta em memória (listas), simulando persistência.
- `view`: entrada/saída do usuário (formulários, seleção e mensagens).
- `Main`: fluxo principal e orquestração do menu.

---

## O que foi aprendido e usado (FIAP)

- **POO em Java**
  - classes, atributos, métodos
  - encapsulamento (getters/setters)
  - relacionamento entre `Produto` e `Categoria`

- **Coleções**
  - armazenamento e busca de dados em memória
  - consulta por id e filtro por categoria

- **Separação de responsabilidades**
  - organização do código em `Model`, `repository` e `view`
  - manutenção mais simples e base para evoluir para banco/API

- **Fluxo de aplicação e validações básicas**
  - menu e navegação
  - validação simples de entradas do usuário

---

## Como executar

### Requisitos

- **JDK (Java)** instalado e configurado na IDE (ou no `PATH`).
- (Opcional) **Maven**, se quiser compilar via terminal.

### IntelliJ IDEA (recomendado)

1. Abra o projeto no IntelliJ.
2. Configure um JDK em: *File → Project Structure → Project SDK*.
3. Execute a classe `Main`:
   - `src/main/java/br/com/fiap/produtos/Main.java`

### Terminal (com Maven instalado)

```bash
mvn clean compile
```

---

## Próximos passos (ideias de evolução)

- Persistência em arquivo (JSON/CSV)
- Persistência em banco (H2/MySQL)
- Testes unitários (JUnit)
- Versão API REST (Spring Boot)

---

## Autor

Projeto acadêmico FIAP — desenvolvido por **Pedro**.
