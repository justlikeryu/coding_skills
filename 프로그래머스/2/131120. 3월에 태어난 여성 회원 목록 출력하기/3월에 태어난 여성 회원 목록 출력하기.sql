SELECT member_id, member_name, gender, DATE_FORMAT(date_of_birth, "%Y-%m-%d") as date_of_birth
FROM member_profile
WHERE MONTH(date_of_birth) = '3'
AND GENDER = "W"
AND NOT tlno IS NULL
ORDER BY member_id ASC;