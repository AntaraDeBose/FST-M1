--Write an SQL statement to find the total purchase amount of all orders.
select sum(purchase_amount) as "Total Purcase Amount" from orders;

--Write an SQL statement to find the average purchase amount of all orders.
select avg(purchase_amount) as "AVG AMOUNT" from orders;

--Write an SQL statement to get the maximum purchase amount of all the orders.
select max(purchase_amount) as "MAX AMOUNT" from orders;

--Write an SQL statement to get the minimum purchase amount of all the orders.
select min(purchase_amount) as "MIN AMOUNT" from orders;

--Write an SQL statement to find the number of salesmen listed in the table.
select count(salesman_id) as "No.of Salesman" from orders;