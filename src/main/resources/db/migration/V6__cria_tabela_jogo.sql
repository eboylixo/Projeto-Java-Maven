CREATE TABLE jogo(
	id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(1000) NOT NULL,
	descricao VARCHAR(1000) NOT NULL,
	preco REAL NOT NULL,
	dt_lancamento DATE NOT NULL,
	nome_desenvolvedora VARCHAR(100) NOT NULL,
	nome_publisher VARCHAR(100) NOT NULL
)
