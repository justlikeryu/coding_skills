SELECT ingredient_type, SUM(total_order) AS total_order
FROM first_half AS half JOIN icecream_info AS info
ON half.flavor = info.flavor
GROUP BY info.ingredient_type
ORDER BY half.total_order ASC;