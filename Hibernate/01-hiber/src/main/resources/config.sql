
CREATE TABLE developers(
  id serial PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  speciality VARCHAR(50) NOT NULL,
  salary VARCHAR(50) NOT NULL
);

INSERT INTO developers(first_name, last_name, speciality, salary)
VALUES ('aleks', 'svistun', 'doctor', '1000');
INSERT INTO developers(first_name, last_name, speciality, salary)
VALUES ('vova', 'mishc', 'botan', '500');
INSERT INTO developers(first_name, last_name, speciality, salary)
VALUES ('denis', 'bondar', 'heyter', '200');



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