/*Exercise 10: Write a SQL statement that finds out each order number followed by 
the name of the customers who made the order.*/

SELECT orders.ord_no, customer.cust_name
FROM orders, customer
WHERE orders.customer_id = customer.customer_id; 