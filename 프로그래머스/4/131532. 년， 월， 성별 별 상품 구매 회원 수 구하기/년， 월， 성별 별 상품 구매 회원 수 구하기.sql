SELECT
    YEAR(sale.sales_date) AS year,
    MONTH(sale.sales_date) AS month,
    user.gender,
    COUNT(DISTINCT user.user_id) AS users
FROM 
    user_info AS user JOIN online_sale AS sale
    ON user.user_id = sale.user_id
WHERE
    NOT user.gender IS NULL
GROUP BY
   year,
   month,
   gender
ORDER BY
    year ASC,
    month ASC,
    gender ASC;