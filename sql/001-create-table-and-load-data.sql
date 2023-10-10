DROP TABLE IF EXISTS clients;

CREATE TABLE clients (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  age int NOT NULL,
  working VARCHAR(20) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO clients (name, age, working) VALUES ("田中一郎", 20, "警察官");
INSERT INTO clients (name, age, working) VALUES ("鈴木二郎", 30, "教師");
INSERT INTO clients (name, age, working) VALUES ("佐藤三郎", 40, "銀行員");
