--Add a new column - grade - to the salesman table. The grade will be integer values.
ALTER TABLE Salesman
ADD Grade int;

--Set the value in the grade column for everyone to 100.
UPDATE Salesman
SET Grade= 100

--Use SELECT command to display the results.
select * from salesman;
