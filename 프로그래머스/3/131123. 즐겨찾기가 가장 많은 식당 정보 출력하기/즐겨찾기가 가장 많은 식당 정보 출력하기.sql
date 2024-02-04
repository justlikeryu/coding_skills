SELECT A.food_type, A.rest_id, A.rest_name, A.favorites
FROM rest_info A 
JOIN (
    SELECT food_type, MAX(favorites) AS favorites
    FROM rest_info
    GROUP BY food_type) B
ON a.food_type = B.food_type
AND A.favorites = B.favorites
GROUP BY food_type
ORDER BY food_type DESC;