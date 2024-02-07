SELECT 
    info.rest_id,
    info.rest_name,
    info.food_type,
    info.favorites,
    info.address,
    ROUND(AVG(review.review_score), 2) AS score
FROM 
    rest_info AS info JOIN rest_review AS review
    ON info.rest_id = review.rest_id
WHERE
    info.address LIKE '서울%'
GROUP BY
    info.rest_id
ORDER BY
    score DESC,
    info.favorites DESC;