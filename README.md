### MySQL DB setup
enter these commands in mysql command line tool:
* mysql> CREATE DATABASE demo;
* mysql> CREATE USER demouser@localhost IDENTIFIED BY 'demopass';
* mysql> GRANT ALL ON demo.* TO demouser@localhost; 
* mysql> use demo;
* mysql> source cars_mysql.sql

fix environment variables *MYSQL_USER* and *MYSQL_DB_PASS* which are used in application.properties

available APIs:
/car?id={id} - to find a car with specific id
/car/all - to show all cars
/car/add?model={model}&colour={colour} - to add a new car