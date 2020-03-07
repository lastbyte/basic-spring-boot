DROP TABLE IF EXISTS products;

CREATE TABLE products(
    id INT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    count INT DEFAULT 0,
    category_id INT DEFAULT NULL
);

DROP TABLE IF EXISTS categories;

CREATE TABLE categories(
    id INT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    description VARCHAR(250) DEFAULT NULL
);

