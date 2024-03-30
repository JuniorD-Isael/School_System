# School System

Este é um projeto de sistema escolar desenvolvido em Java, utilizando o framework Spring Boot. O sistema é responsável por gerenciar alunos e colaboradores.

## Tecnologias Utilizadas

- **Java**: A linguagem de programação principal do projeto.
- **Spring Boot**: Um framework Java para desenvolvimento de aplicações web.
- **JPA (Java Persistence API)**: Interface padrão que simplifica a interação entre a aplicação Java e o banco de dados.
- **Hibernate**: Implementação do JPA que facilita o mapeamento de objetos Java para tabelas de banco de dados e vice-versa.
- **SQL**: Linguagem usada para interagir com o banco de dados.
- **Maven**: Ferramenta de automação de compilação usada para gerenciar as dependências do projeto e construir o projeto.
- **Lombok**: Biblioteca Java que ajuda a reduzir a verbosidade do código Java.
- **Jakarta Validation**: Especificação para validação de dados em aplicações Java.

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto Maven:

- `src/main/java`: Contém o código fonte do projeto.
- `src/main/resources`: Contém recursos como arquivos de propriedades.
- `src/test`: Contém os testes do projeto.
- `pom.xml`: O arquivo de configuração do Maven.

## Como Executar

```bash
git clone https://github.com/JuniorD-Isael/Scholl_System.git
cd School_System
mvn clean install
mvn spring-boot:run
```

## API Endpoints

- `GET /colaborador-teste`: Retorna uma lista de todos os colaboradores.
- `POST /colaborador-teste`: Cadastra um novo colaborador.
- `GET /aluno-teste`: Retorna uma lista de todos os alunos.
- `POST /aluno-teste`: Cadastra um novo alunos.

## Contribuição

Contribuições são bem-vindas. Para contribuir:

1. Faça um fork do projeto.
2. Crie uma nova branch para suas alterações.
3. Faça suas alterações.
4. Envie um pull request.