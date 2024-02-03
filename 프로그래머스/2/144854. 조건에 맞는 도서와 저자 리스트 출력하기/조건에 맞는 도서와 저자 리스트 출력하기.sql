SELECT book_id, author_name, DATE_FORMAT(published_date, "%Y-%m-%d") AS published_date
FROM book JOIN author
ON book.author_id = author.author_id
WHERE book.category = "경제"
ORDER BY book.published_date ASC;