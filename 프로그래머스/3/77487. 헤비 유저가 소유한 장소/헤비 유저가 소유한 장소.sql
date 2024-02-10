WITH cte AS(
    SELECT
        host_id
    FROM
        places
    GROUP BY
        host_id
    HAVING
        COUNT(*) >= 2
)

SELECT
    id,
    name,
    host_id
FROM
    places
WHERE
    host_id IN (select host_id FROM cte)
ORDER BY
    id ASC;