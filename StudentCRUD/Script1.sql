CREATE TABLE IF NOT EXISTS studentcrud.class( ClassNumber     INTEGER NOT NULL,
	ClassIncharge CHAR (20), ClassStrength INTEGER NOT NULL, PRIMARY KEY (ClassNumber));

CREATE TABLE IF NOT EXISTS studentcrud.student( Rollno     INTEGER NOT NULL,
	Name CHAR (20),
	CurrentClass    CHAR (20),
	JoinedOn DATE NOT NULL DEFAULT CURRENT_DATE,
	PRIMARY KEY (Rollno),
	FOREIGN KEY (ClassNumber) REFERENCES studentcrud.class (ClassNumber)
);

select * from studentcrud.student;
select * from studentcrud.class;

select * from studentcrud.student where  Rollno=2;
SELECT Name,CurrentClass,JoinedOn,a.ClassIncharge as ClassInchargeName FROM studentcrud.class a JOIN studentcrud.student b ON a.ClassNumber=b.CurrentClass;



--drop tabel commands

 -- DROP TABLE studentcrud.student CASCADE;

 --DROP TABLE studentcrud.class CASCADE;

 --to truncate the table
 
truncate table studentcrud.student cascade;

truncate table studentcrud.class cascade;
