-- create data base
CREATE DATABASE base_hibernate_01;

-- create table users
CREATE TABLE users(
  id serial PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  profession VARCHAR(50) NOT NULL
);

-- insert users to table users to database base_hibernate_01
INSERT INTO users(name, profession) VALUES('bob', 'doctor');
INSERT INTO users(name, profession) VALUES('adolf', 'tiran');
INSERT INTO users(name, profession) VALUES('amanda', 'team lead');

-- select all user from users
SELECT * FROM users;


-- create table items
CREATE TABLE items (
  id serial PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(50) NOT NULL,
  user_id INT REFERENCES users(id) ON DELETE CASCADE
);

-- insert item to table items to database base_hibernate_01
INSERT INTO items(name, description, user_id) VALUES('alarm','sell car',1);
INSERT INTO items(name, description, user_id) VALUES('alarm','sell cycle',1);
INSERT INTO items(name, description, user_id) VALUES('2','2',2);
INSERT INTO items(name, description, user_id) VALUES('3','3',3);
INSERT INTO items(name, description, user_id) VALUES('33','33',3);
INSERT INTO items(name, description, user_id) VALUES('4','4',4);
INSERT INTO items(name, description, user_id) VALUES('alarm','test delete',1);

-- selects all item for user by id=1
SELECT (SELECT users.name FROM users WHERE users.id='1'), items.id, items.name, items.description
  FROM items
  WHERE items.user_id = 1
  ORDER BY items.id
;
-- selects all item for user by id=2
SELECT (SELECT users.name FROM users WHERE users.id='2'), items.id, items.name, items.description
  FROM items
  WHERE items.user_id = 2
  ORDER BY items.id
;
-- selects all item for user by id=3
SELECT (SELECT users.name FROM users WHERE users.id='3'), items.id, items.name, items.description
  FROM items
  WHERE items.user_id = 3
  ORDER BY items.id
;
-- selects all item for user by id=4
SELECT (SELECT users.name FROM users WHERE users.id='4'), items.id, items.name, items.description
  FROM items
  WHERE items.user_id = 4
  ORDER BY items.id
;



SELECT product.id, product.name, product.type_id, product.expired_date, product.price,
  (SELECT type.name AS type FROM type WHERE type.name = 'cheese')
  FROM product
  WHERE product.type_id IN (SELECT type.id FROM type WHERE type.name = 'cheese')
  ORDER BY product.price
;



DROP TABLE users;



INSERT INTO users(login, name) VALUES(?, ?)
SELECT * FROM users WHERE id=?
SELECT * FROM users WHERE name=?
SELECT * FROM users WHERE login=?
SELECT * FROM users WHERE login=? AND name=?
UPDATE users SET login = ?, name = ? WHERE id = ?
DELETE FROM users WHERE id=?
SELECT * FROM users ORDER BY id


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