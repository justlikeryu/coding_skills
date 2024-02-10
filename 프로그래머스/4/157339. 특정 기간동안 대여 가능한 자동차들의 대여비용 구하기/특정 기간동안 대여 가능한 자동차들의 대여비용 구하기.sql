SELECT
    car_id,
    car_type,
    FLOOR(30 * daily_fee * (1 - discount_rate / 100)) AS fee
FROM
    car_rental_company_car AS car JOIN car_rental_company_discount_plan AS discount
    USING(car_type)
WHERE
    car.car_type IN ('세단', 'SUV')
    AND
    car.car_id NOT IN
    (SELECT 
        car_id
     FROM
        car_rental_company_rental_history
     WHERE
        end_date >= '2022-11-01'
        AND start_date <='2022-11-30')
    AND 
    duration_type = '30일 이상'
HAVING
    fee BETWEEN 500000 AND 2000000
ORDER BY
    fee DESC,
    car_type ASC,
    car_id DESC;