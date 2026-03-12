CREATE DATABASE lead_management;

USE lead_management;

CREATE TABLE leads(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
phone VARCHAR(20),
email VARCHAR(100),
car_model VARCHAR(100),
status VARCHAR(50),
source VARCHAR(100)
);
