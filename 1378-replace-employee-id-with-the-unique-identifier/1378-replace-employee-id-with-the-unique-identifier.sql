/* Write your PL/SQL query statement below */

SELECT euni.unique_id, e.name
FROM employeeUni euni RIGHT JOIN 
     employees e
ON euni.id=e.id;