-- Insert values in Salesman table
insert into salesman values(5001,'James Hoog','New York',15);
insert into salesman values(5002,'Nail Knite','Paris',13);
insert into salesman values(5005,'Pit Alex','London',11);
insert into salesman values(5006,'McLyon','Paris',14);
insert into salesman values(5007,'Paul Adam','Rome',13);
insert into salesman values(5003,'Lauson Hen','San Jose',12);


select * from Salesman



-- Insert values in Salesman table
-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5001,'James Hoog','New York',15)
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

select * from salesman;

--From slides
-- Insert one row
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;