/*
FLOOR(): 소수점 이하는 버리고 가장 가까운 정수값을 출력하는 함수
*/
SELECT 
    FLOOR(price / 10000) * 10000 AS price_group
    , COUNT(product_code) AS products
FROM product
GROUP BY price_group
ORDER BY price_group ASC;
