DROP TABLE IF EXISTS dispositivo;

CREATE TABLE dispositivo (
  deviceId INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
  mac int,
  email VARCHAR(50),
  latitude VARCHAR(80),
  longitude VARCHAR(80),
);

INSERT INTO dispositivo(deviceId, name, mac, email, latitude, longitude)
VALUES ('tiago', 123456, 'ttiago@teste.com', '12313.112', '23156.22');