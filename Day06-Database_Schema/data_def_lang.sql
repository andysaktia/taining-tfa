-- create data base
CREATE DATABASE alta_online_shop

-- create table
-- table user: nama, alamat, dob, status_user, gender, created_at, updated_at
CREATE TABLE users(
    user_id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    alamat TEXT NOT NULL,
    dob DATE NOT NULL,
    status_user VARCHAR NOT NULL,
    gender VARCHAR NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    update_at TIMESTAMP  NOT NULL
);

-- product: product name, product type, product desc, operator, payment methods
CREATE TABLE products(
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50) NOT NULL,
    product_type VARCHAR NOT NULL,
    product_desc TEXT NOT NULL,
    operator VARCHAR NOT NULL,
    payment_method VARCHAR NOT NULL
);

-- transaction: id, product id, user_id, transaction date, price, quantity

CREATE TABLE transactions(
    transaction_id INT PRIMARY KEY,
    product_id INT NOT NULL,
    user_id INT NOT NULL,
    transaction_date TIMESTAMP NOT NULL,
    price INT NOT NULL,
    quantity INT NOT NULL
);

-- kurir: id, name, created_at, updated_at
CREATE TABLE kurires(
    kurir_id INT PRIMARY KEY,
    kurir_name VARCHAR(50) NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    update_at TIMESTAMP  NOT NULL
);

-- add kolom ongkos ke kurires
ALTER TABLE kurires ADD ongkos_dasar INT NOT NULL;

-- rename kurires to shipping
ALTER TABLE kurires RENAME TO shipping;

-- drop shipping table
DROP TABLE shipping;
