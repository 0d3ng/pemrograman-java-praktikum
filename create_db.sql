/* 
 * Pemrograman-java-praktikum

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 7, 2018 2:27:34 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
/**
 * Author:  od3ng
 * Created: Dec 7, 2018
 */

CREATE DATABASE praktikum_java;

CREATE TABLE IF NOT EXISTS EMPLOYEE_TBL(
ID VARCHAR(12) NOT NULL,
NAME VARCHAR(50) NOT NULL,
DEPARTMENT VARCHAR(50) NOT NULL,
JOB_TITLE VARCHAR(50) NOT NULL,
HIRE_DATE DATE,
PERMANENT_EMPLOYEE TINYINT,
SALARY INT,
PRIMARY KEY(ID)
)ENGINE=INNODB;