-- Schema: employeecrud

-- DROP SCHEMA "employeecrud";
--create schema
CREATE SCHEMA "employeecrud"
  AUTHORIZATION POSTGRES;


GRANT ALL ON SCHEMA "employeecrud" TO POSTGRES;
GRANT ALL ON SCHEMA "employeecrud" TO PUBLIC;
COMMENT ON SCHEMA "employeecrud"
  IS 'FOR employeecrud PROJECT';
----------************************************************************************************-------------

--create employee and department table
  CREATE TABLE IF NOT EXISTS employeecrud.TBL_DEPARTMENT
	(
	DEPTID   INTEGER NOT NULL,
	DEPTNAME CHAR(30),
	CREATED_ON DATE NOT NULL DEFAULT CURRENT_DATE,
	PRIMARY KEY (DEPTID)
	)

CREATE TABLE IF NOT EXISTS employeecrud.TBL_Emp
	(
	EMPID     INTEGER NOT NULL,
	FIRSTNAME CHAR (20),
	LASTNAME  CHAR (20),
	DEPTID    INTEGER,
	ADDED_ON DATE NOT NULL DEFAULT CURRENT_DATE,
	LAST_EDITED DATE NOT NULL DEFAULT CURRENT_DATE,
	FOREIGN KEY (DEPTID) REFERENCES employeecrud.TBL_DEPARTMENT (DEPTID)
	)

--View data

SELECT * FROM employeecrud.TBL_DEPARTMENT;
SELECT * FROM employeecrud.TBL_EMP;
SELECT EMPID,FIRSTNAME,LASTNAME,DEPTNAME as DEPARTMENTNAME FROM employeecrud.TBL_DEPARTMENT a JOIN employeecrud.TBL_Emp b ON a.DEPTID=b.DEPTID;

----**************Drop table ********************************************
  
 
 -- DROP TABLE employeecrud.TBL_DEPARTMENT CASCADE;

 --DROP TABLE employeecrud.TBL_Emp CASCADE;

-- *************************************
truncate table employeecrud.TBL_DEPARTMENT cascade;
 truncate table employeecrud.TBL_Emp cascade;
SELECT CURRENT_DATE;

