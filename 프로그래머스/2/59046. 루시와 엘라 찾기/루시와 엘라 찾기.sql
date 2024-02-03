SELECT animal_id, name, sex_upon_intake
FROM animal_ins
WHERE name IN ('Lucy', 'Ella', 'Pickle', 'Sabrina', 'Mitty')
ORDER BY animal_id ASC;