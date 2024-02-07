SELECT 
    CONCAT('/home/grep/src/', file.board_id, '/', file.file_id, file.file_name, file.file_ext) AS file_path
FROM 
    used_goods_board AS board JOIN used_goods_file AS file
    ON board.board_id = file.board_id
WHERE 
    board.views = (
    SELECT MAX(views)
    FROM used_goods_board)
ORDER BY 
    file.file_id DESC;