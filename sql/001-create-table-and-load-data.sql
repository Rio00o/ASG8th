DROP TABLE IF EXISTS generals;
CREATE TABLE generals (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 birthPlace VARCHAR(20),
 birthYear int,
 age int,
 PRIMARY KEY(id)
);
INSERT INTO generals (name, birthPlace, birthYear, age) VALUES ('織田信長', '尾張国', 1534, 49);
INSERT INTO generals (name, birthPlace, birthYear, age) VALUES ('豊臣秀吉', '近江国', 1537, 62);
INSERT INTO generals (name, birthPlace, birthYear, age) VALUES ('徳川家康', '三河国', 1543, 75);