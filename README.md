# School System

Este é um projeto de sistema escolar desenvolvido em Java, utilizando o framework Spring Boot. O sistema é responsável por gerenciar alunos e colaboradores de uma instituição de ensino.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação robusta e orientada a objetos utilizada como base do projeto.
- **Spring Boot**: Framework que simplifica o desenvolvimento de aplicações Java, oferecendo configuração automática e um container de servlets embutido.
- **Spring Data JPA**: Facilita a implementação de repositórios baseados em JPA, reduzindo o código boilerplate para operações de acesso a dados.
- **Hibernate**: Framework ORM (Object-Relational Mapping) que implementa JPA, facilitando a persistência de objetos Java no banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para desenvolvimento e testes.
- **Maven**: Ferramenta de automação de compilação usada para gerenciar as dependências do projeto e construir o projeto.
- **Lombok**: Biblioteca Java que ajuda a reduzir a verbosidade do código Java através de anotações que geram código em tempo de compilação.
- **Jakarta Validation**: API de validação que permite definir restrições de dados usando anotações.

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto Maven:

- `src/main/java`: Contém o código fonte do projeto.
- `src/main/resources`: Contém recursos como arquivos de propriedades.
- `src/test`: Contém os testes do projeto.
- `pom.xml`: O arquivo de configuração do Maven.

## Como Executar

```bash
git clone https://github.com/JuniorD-Isael/School_System.git
cd School_System
mvn clean install
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`

## API Endpoints

### Colaboradores

- `GET /colaborador`: Retorna uma lista de todos os colaboradores.
- `GET /colaborador/{id}`: Retorna um colaborador específico pelo ID.
- `POST /colaborador`: Cadastra um novo colaborador.
  - Corpo da requisição: JSON com nome, email, CPF, cargo e endereço.
- `PUT /colaborador/{id}`: Atualiza informações de um colaborador.
  - Corpo da requisição: JSON com nome e email.
- `DELETE /colaborador/{id}`: Remove um colaborador pelo ID.

### Alunos

- `GET /aluno`: Retorna uma lista de todos os alunos.
- `GET /aluno/{id}`: Retorna um aluno específico pelo ID.
- `POST /aluno`: Cadastra um novo aluno.
  - Corpo da requisição: JSON com nome, CPF, email, curso, telefone e endereço.
- `PUT /aluno/{id}`: Atualiza informações de um aluno.
  - Corpo da requisição: JSON com nome e email.
- `DELETE /aluno/{id}`: Remove um aluno pelo ID.

## Banco de Dados

O sistema utiliza H2 Database em memória com as seguintes tabelas:
- `tb_colaboradores`: Armazena dados dos colaboradores
- `tb_alunos`: Armazena dados dos alunos

O console H2 está disponível em `http://localhost:8080/h2-console` com as credenciais configuradas no application.properties.

## Contribuição

Contribuições são bem-vindas. Para contribuir:

1. Faça um fork do projeto.
2. Crie uma nova branch para suas alterações.
3. Faça suas alterações.
4. Envie um pull request.
