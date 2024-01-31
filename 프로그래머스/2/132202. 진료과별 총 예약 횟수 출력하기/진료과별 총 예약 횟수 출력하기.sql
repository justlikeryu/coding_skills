SELECT mcdp_cd AS 진료과코드, COUNT(pt_no) AS 5월예약건수
FROM appointment
WHERE YEAR(apnt_ymd) = '2022'
AND MONTH(apnt_ymd) = '5'
GROUP BY mcdp_cd
ORDER BY COUNT(mcdp_cd) ASC, mcdp_cd ASC;