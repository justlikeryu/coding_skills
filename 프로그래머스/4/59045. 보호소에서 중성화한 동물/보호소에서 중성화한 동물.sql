SELECT
    ins.animal_id,
    ins.animal_type,
    ins.name
FROM
    animal_ins AS ins JOIN animal_outs AS outs
    ON ins.animal_id = outs.animal_id
WHERE
    ins.sex_upon_intake LIKE 'Intact%'
    AND
    outs.sex_upon_outcome NOT LIKE 'Intact%'
ORDER BY
    animal_id ASC;
