SELECT
    product.product_id,
    product.product_name,
    product.price * SUM(food_order.amount) AS total_sales
FROM
    food_product AS product JOIN food_order
    ON product.product_id = food_order.product_id
WHERE
    food_order.produce_date LIKE '2022-05%'
GROUP BY
    product.product_id
ORDER BY
    total_sales DESC,
    product_id ASC;