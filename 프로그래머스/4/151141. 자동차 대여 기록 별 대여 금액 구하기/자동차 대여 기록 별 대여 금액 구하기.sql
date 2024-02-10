/*WITH절과 서브 쿼리의 차이점
*WITH절: 이름을 가진 서브쿼리를 정의하여 사용하는 구문
*서브 쿼리: SELECT절의 결과를 WHERE절에서 하나의 변수처럼 사용하고 싶을 때 사용하는 쿼리
*/

/*DATEDIFF(end_date, start_date)에서 1을 더하는 이유는 시작한 날을 포함하기 위함이다.
*/

/*JOIN할 때 조건으로 ON이나 USING을 사용한다.
*조인할 컬럼명이 일치할 때는 USING을 사용할 수 있고, 컬럼명이 일치하거나 다른 경우에는 ON을 사용한다.
*/

WITH rental_period_type AS (
    SELECT
        *,
        CASE
            WHEN DATEDIFF(end_date, start_date) + 1 < 7 THEN NULL
            WHEN DATEDIFF(end_date, start_date) + 1 < 30 THEN '7일 이상'
            WHEN DATEDIFF(end_date, start_date) + 1 < 90 THEN '30일 이상'
            ELSE '90일 이상'
        END AS period_type,
        DATEDIFF(end_date, start_date) + 1 AS rental_period
    FROM
        car_rental_company_rental_history
    JOIN
        car_rental_company_car
    USING(car_id)
)

SELECT
    history_id,
     TRUNCATE(rental_period * daily_fee * (1 - COALESCE(discount_rate, 0)/ 100), 0) AS fee
FROM
    rental_period_type AS period LEFT JOIN car_rental_company_discount_plan AS discount
    ON period.car_type = discount.car_type AND period.period_type = duration_type
WHERE
    period.car_type = '트럭'
ORDER BY
    fee DESC,
    history_id DESC;