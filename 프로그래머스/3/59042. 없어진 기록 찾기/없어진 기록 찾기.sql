SELECT 
    outs.animal_id, outs.name
FROM 
    animal_ins AS ins RIGHT JOIN animal_outs AS outs
    ON ins.animal_id = outs.animal_id
WHERE
    ins.animal_Id IS NULL
ORDER BY 
    outs.animal_id ASC,
    outs.name ASC;