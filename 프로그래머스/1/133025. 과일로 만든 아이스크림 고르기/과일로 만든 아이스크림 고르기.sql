SELECT half.flavor
FROM first_half AS half JOIN icecream_info AS info
ON half.flavor = info.flavor
WHERE half.total_order > 3000
AND info.ingredient_type LIKE "fruit%"
ORDER BY half.total_order DESC;