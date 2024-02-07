/*WITH RECURSIVE: 재귀 쿼리
*/
WITH RECURSIVE cte AS(
    SELECT 0 AS hour 
    UNION ALL
    SELECT hour + 1 FROM cte WHERE hour < 23
)

SELECT
    cte.hour,
    COUNT(hour(animal.datetime)) AS count
FROM 
    cte LEFT JOIN animal_outs AS animal
    ON cte.hour = HOUR(animal.datetime)
GROUP BY
    hour
ORDER BY
    hour ASC;