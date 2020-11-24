DROP TABLE IF EXISTS car;
CREATE TABLE car(id INT PRIMARY KEY AUTO_INCREMENT, model VARCHAR(100),
                    colour VARCHAR(50));

INSERT INTO car(model, colour) VALUES('Ferrari', 'Red');
INSERT INTO car(model, colour) VALUES('Tesla', 'Grey');
INSERT INTO car(model, colour) VALUES('Volvo', 'Black');