CREATE TABLE produto(
	id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(1000) NOT NULL,
	descricao VARCHAR(20) NOT NULL,
	preco REAL NOT NULL,
	prazo_entrega DATE NOT NULL
)
