/*대여 기록이 다수 존재하면 대여중과 대여가능 둘 다 나올 수 있다.
* MAX()를 사용해 하나라도 대여중이 있으면 대여중만 나오도록 한다.
*/
SELECT car_id,
    MAX(CASE 
            WHEN '2022-10-16' BETWEEN start_date AND end_date THEN '대여중'
            ELSE '대여 가능'
        END) AS availability
FROM car_rental_company_rental_history
GROUP BY car_id
ORDER BY car_id DESC;