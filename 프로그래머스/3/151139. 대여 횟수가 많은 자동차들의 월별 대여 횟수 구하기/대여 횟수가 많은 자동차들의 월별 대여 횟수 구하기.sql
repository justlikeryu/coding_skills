SELECT 
    MONTH(start_date) AS month, 
    car_id, 
    COUNT(car_id) AS records
FROM 
    car_rental_company_rental_history
WHERE 
    start_date BETWEEN '2022-08-01' AND '2022-10-31'
    AND car_id IN (
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY car_id
    HAVING COUNT(car_id) >= 5)
GROUP BY 
    month, car_id
HAVING 
    records > 0
ORDER BY 
    month ASC, 
    car_id DESC;