CREATE TABLE veiculo (
    id SERIAL PRIMARY KEY,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    cor VARCHAR(30),
    placa VARCHAR(15) UNIQUE NOT NULL,
    morador_id INTEGER REFERENCES morador(id) ON DELETE SET NULL,
    visitante_id INTEGER REFERENCES visitante(id) ON DELETE SET NULL
);