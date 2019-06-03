
CREATE TABLE developers(
  id serial PRIMARY KEY,
  firstName VARCHAR(50) NOT NULL,
  lastName VARCHAR(50) NOT NULL,
  speciality VARCHAR(50) NOT NULL,
  salary VARCHAR(50) NOT NULL
);

INSERT INTO developers(firstName, lastName, speciality, salary)
VALUES ('aleks', 'svistun', 'doctor', '1000');
INSERT INTO developers(firstName, lastName, speciality, salary)
VALUES ('vova', 'mishc', 'botan', '500');
INSERT INTO developers(firstName, lastName, speciality, salary)
VALUES ('denis', 'bondar', 'heyter', '200');



INSERT INTO users(login, name) VALUES('goad', 'dilan');
INSERT INTO users(login, name) VALUES('queen', 'amanda');
INSERT INTO users(login, name) VALUES('baron', 'bob');



SELECT * FROM users;
DROP TABLE users;



INSERT INTO users(login, name) VALUES(?, ?)
SELECT * FROM users WHERE id=?
SELECT * FROM users WHERE name=?
SELECT * FROM users WHERE login=?
SELECT * FROM users WHERE login=? AND name=?
UPDATE users SET login = ?, name = ? WHERE id = ?
DELETE FROM users WHERE id=?
SELECT * FROM users ORDER BY id