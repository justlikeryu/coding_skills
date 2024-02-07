SELECT
    author.author_id,
    author.author_name, 
    book.category,
    SUM(book.price * sales.sales) AS total_sales
FROM 
    book 
    JOIN author
    ON book.author_id = author.author_id
    JOIN book_sales AS sales
    ON book.book_id = sales.book_id
WHERE 
    DATE_FORMAT(sales.sales_date, '%Y-%m') = '2022-01'
GROUP BY 
    author.author_id, book.category
ORDER BY
    author.author_id ASC,
    book.category DESC;