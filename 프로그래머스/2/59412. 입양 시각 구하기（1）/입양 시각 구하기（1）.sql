SELECT DATE_FORMAT(datetime, "%H") AS hour, count(animal_id) AS count
FROM animal_outs
GROUP BY DATE_FORMAT(datetime, "%H")
HAVING hour BETWEEN '09' AND '19'
ORDER BY DATE_FORMAT(datetime, "%H") ASC; 