DROP TABLE IF EXISTS dispositivo;
CREATE TABLE dispositivo (
id bigint auto_increment,
name VARCHAR(50),
mac int,
email VARCHAR(50),
latitude VARCHAR(80),
longitude VARCHAR(80)
);

INSERT INTO dispositivo(name, mac, email, latitude, longitude)
VALUES ('tiago', 123456, 'ttiago@teste.com', '12313.112', '23156.22');

INSERT INTO dispositivo(name, mac, email, latitude, longitude)
VALUES ('jorge', 2432, 'jorge@teste.com', '4324.112', '55.22');

INSERT INTO dispositivo(name, mac, email, latitude, longitude)
VALUES ('john', 45353, 'john@teste.com', '543.112', '44.22');

INSERT INTO dispositivo(name, mac, email, latitude, longitude)
VALUES ('jan', 65346, 'jan@teste.com', '4324.112', '777.22');

INSERT INTO dispositivo(name, mac, email, latitude, longitude)
VALUES ('aaa', 423423, 'aaa@teste.com', '432.112', '2222.22');