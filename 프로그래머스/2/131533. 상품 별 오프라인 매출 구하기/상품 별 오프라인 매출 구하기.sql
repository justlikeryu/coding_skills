SELECT product.product_code, SUM(product.price * sale.sales_amount) AS sales
FROM product JOIN offline_sale AS sale
ON product.product_id = sale.product_id
GROUP BY product.product_id
ORDER BY sales DESC, product_code ASC;
