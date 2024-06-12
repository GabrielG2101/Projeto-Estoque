CREATE TABLE IF NOT EXISTS usuario (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    datanascimento TEXT NOT NULL,
    cpf TEXT NOT NULL,
    senha TEXT NOT NULL
);
