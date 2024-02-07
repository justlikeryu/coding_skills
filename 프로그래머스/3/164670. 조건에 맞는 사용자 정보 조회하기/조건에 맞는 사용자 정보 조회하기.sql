SELECT
    user.user_id, 
    user.nickname, 
    CONCAT(user.city,' ', user.street_address1, ' ', user.street_address2) AS 전체주소, 
    INSERT(INSERT(user.tlno, 4, 0, '-'), 9, 0, '-') AS 전화번호
FROM 
    used_goods_board AS board JOIN used_goods_user AS user
    ON board.writer_id = user.user_id
GROUP BY 
    user.user_id
HAVING                    
    COUNT(board.writer_id) >= 3
ORDER BY 
    user.user_id DESC;