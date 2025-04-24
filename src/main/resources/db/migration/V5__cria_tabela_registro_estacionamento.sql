CREATE TABLE registro_estacionamento (
    id SERIAL PRIMARY KEY,
    data_entrada TIMESTAMP NOT NULL,
    data_saida TIMESTAMP,

    vaga_id INTEGER NOT NULL REFERENCES vaga(id) ON DELETE CASCADE,
    morador_id INTEGER REFERENCES morador(id) ON DELETE SET NULL,
    visitante_id INTEGER REFERENCES visitante(id) ON DELETE SET NULL,
    veiculo_id INTEGER NOT NULL REFERENCES veiculo(id) ON DELETE CASCADE
);