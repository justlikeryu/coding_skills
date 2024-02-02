SELECT animal_type, count(animal_id) AS count
FROM animal_ins
GROUP BY animal_type
ORDER BY FIELD(animal_type, 'Cat', 'Dog');