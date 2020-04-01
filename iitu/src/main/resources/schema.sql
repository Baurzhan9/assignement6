--DROP TABLE Employee;
CREATE TABLE EMPLOYEE1 (
  ID          INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  firstName        VARCHAR(50)  NOT NULL,
  lastName         VARCHAR(50)  NOT NULL,
  fixedSalary      DOUBLE(250)  NOT NULL,
  hourRate		   DOUBLE(250)  NOT NULL,
  hoursWorked	   INT			NOT NULL,		
  commRate		   FLOAT		NOT NULL
);
