-- operator: id int(11), name varchar(255), craated_at , updates_at
CREATE TABLE operators(
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    created_at TIMESTAMP  NOT NULL,
    update_at TIMESTAMP  NOT NULL
);

-- insert 5 data di operators
INSERT INTO operators (id, name, created_at, update_at) VALUES (1, 'op_name_1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO operators (id, name, created_at, update_at) VALUES (2, 'op_name_1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO operators (id, name, created_at, update_at) VALUES (3, 'op_name_1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO operators (id, name, created_at, update_at) VALUES (4, 'op_name_1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO operators (id, name, created_at, update_at) VALUES (5, 'op_name_1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);



-- insert 5 data table users
INSERT INTO users (user_id, name, alamat, dob, status_user, gender, created_at, update_at) 
VALUES (1, 'Budi', 'solo', CURRENT_DATE, 'active', 'male', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO users (user_id, name, alamat, dob, status_user, gender, created_at, update_at) 
VALUES (2, 'Mei', 'bandung', CURRENT_DATE, 'active', 'female', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO users (user_id, name, alamat, dob, status_user, gender, created_at, update_at) 
VALUES (3, 'Arya', 'surabaya', CURRENT_DATE, 'active', 'male', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO users (user_id, name, alamat, dob, status_user, gender, created_at, update_at) 
VALUES (4, 'Jaya', 'solo', CURRENT_DATE, 'active', 'male', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO users (user_id, name, alamat, dob, status_user, gender, created_at, update_at) 
VALUES (5, 'Danang', 'semarang', CURRENT_DATE, 'active', 'male', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


-- insert 5 data table product
INSERT INTO products (product_id, product_name, product_type, product_desc, operator, payment_method) 
VALUES (1, 'Kulkas', 'dapur', 'desc here', 'op_name_1', 'ovo');
INSERT INTO products (product_id, product_name, product_type, product_desc, operator, payment_method) 
VALUES (2, 'HP', 'elektronik', 'desc here', 'op_name_2', 'gopay');
INSERT INTO products (product_id, product_name, product_type, product_desc, operator, payment_method) 
VALUES (3, 'TV', 'electronik', 'desc here', 'op_name_2', 'atm');
INSERT INTO products (product_id, product_name, product_type, product_desc, operator, payment_method) 
VALUES (4, 'Meja', 'perabotan', 'desc here', 'op_name_4', 'cod');
INSERT INTO products (product_id, product_name, product_type, product_desc, operator, payment_method) 
VALUES (5, 'Kursi', 'perabotan', 'desc here', 'op_name_4', 'cod');


-- select  user gender male
SELECT name FROM users WHERE gender = 'male';
SELECT * FROM users WHERE id = 3;

-- update 
UPDATE products SET product_name = 'product dummy' WHERE product_id=1;

-- delete
DELETE FROM products WHERE product_id=1;

