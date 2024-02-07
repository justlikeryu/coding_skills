SELECT 
    history.car_id
FROM 
    car_rental_company_car AS car JOIN car_rental_company_rental_history AS history
    ON car.car_id = history.car_id
WHERE
    car.car_type = '세단'
    AND MONTH(history.start_date) = 10
GROUP BY
    history.car_id
ORDER BY
    history.car_id DESC;