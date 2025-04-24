CREATE TABLE morador (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    apartamento VARCHAR(10) NOT NULL,
    bloco VARCHAR(10) NOT NULL
);