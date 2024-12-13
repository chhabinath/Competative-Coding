# Write your MySQL query statement below

SELECT emp_ui.unique_id, emp.name 
FROM employeeuni emp_ui RIGHT JOIN employees emp
ON emp.id = emp_ui.id;