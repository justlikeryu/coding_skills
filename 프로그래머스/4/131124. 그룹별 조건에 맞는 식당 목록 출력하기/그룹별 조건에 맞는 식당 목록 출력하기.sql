SELECT
    profile.member_name,
    review.review_text,
    DATE_FORMAT(review.review_date, '%Y-%m-%d') AS review_date
FROM
    member_profile AS profile JOIN rest_review AS review
    ON profile.member_id = review.member_id
WHERE
    profile.member_id = (
        SELECT
            member_id
        FROM 
            rest_review
        GROUP BY
            member_id
        ORDER BY
            COUNT(*) DESC
        LIMIT 1
    )
ORDER BY
    review_date ASC,
    review_text ASC;