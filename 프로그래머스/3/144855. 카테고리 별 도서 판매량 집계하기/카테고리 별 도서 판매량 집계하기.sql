SELECT book.category, SUM(sales.sales) AS total_sales
FROM book JOIN book_sales AS sales
ON book.book_id = sales.book_id
WHERE DATE_FORMAT(sales.sales_date, "%Y-%m") = '2022-01'
GROUP BY book.category
ORDER BY book.category ASC;