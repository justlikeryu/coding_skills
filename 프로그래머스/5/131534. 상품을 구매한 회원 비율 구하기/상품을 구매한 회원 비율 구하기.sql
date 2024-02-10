SELECT
    YEAR(sale.sales_date) AS year,
    MONTH(sale.sales_date) AS month,
    COUNT(DISTINCT sale.user_id) AS purchased_users,
    ROUND(
        COUNT(DISTINCT sale.user_id) / (SELECT COUNT(user_id) FROM user_info WHERE YEAR(joined) = 2021)
        , 1) AS purchased_ratio
FROM
    user_info AS info JOIN online_sale AS sale
    USING(user_id)
WHERE
    info.joined LIKE '2021%'
GROUP BY
    year,
    month
ORDER BY
    year ASC,
    MONTH ASC;