CREATE TABLE tb_alunos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(15) NOT NULL,
    email VARCHAR(255) NOT NULL,
    curso INT,
    telefone VARCHAR(11)
);
