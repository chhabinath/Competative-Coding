# Write your MySQL query statement below
SELECT prod.product_name, sal.year, sal.price
from product prod, sales sal
where prod.product_id = sal.product_id;