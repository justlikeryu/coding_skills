SELECT
    DATE_FORMAT(total.sales_date, '%Y-%m-%d') AS sales_date,
    product_id,
    user_id,
    sales_amount
FROM (
    SELECT
        sales_date,
        product_id,
        user_id,
        sales_amount
    FROM
        online_sale
    UNION ALL
    SELECT
        sales_date,
        product_id,
        NULL AS user_id,
        sales_amount
    FROM
        offline_sale
) AS total
WHERE
    sales_date BETWEEN '2022-03-01' AND '2022-03-31'
ORDER BY
    sales_date ASC,
    product_id ASC,
    user_id ASC;