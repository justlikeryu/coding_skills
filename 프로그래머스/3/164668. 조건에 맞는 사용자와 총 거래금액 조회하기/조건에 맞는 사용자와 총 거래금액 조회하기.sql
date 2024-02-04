SELECT user.user_id, user.nickname, SUM(board.price) AS total_sales
FROM used_goods_board board
JOIN used_goods_user user
ON board.writer_id = user.user_id
WHERE board.status = 'DONE'
GROUP BY user_id
HAVING SUM(board.price) >= 700000
ORDER BY total_sales ASC;