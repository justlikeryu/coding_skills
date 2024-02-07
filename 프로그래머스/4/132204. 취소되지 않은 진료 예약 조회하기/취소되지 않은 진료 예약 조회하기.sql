SELECT
    appointment.apnt_no,
    patient.pt_name,
    appointment.pt_no,
    appointment.mcdp_cd,
    doctor.dr_name,
    appointment.apnt_ymd
FROM
    appointment 
    JOIN patient
    ON appointment.pt_no = patient.pt_no
    JOIN doctor
    ON appointment.mddr_id = doctor.dr_id
WHERE 
    appointment.apnt_ymd LIKE '2022-04-13%'
    AND
    appointment.apnt_cncl_yn = 'N'
ORDER BY
    apnt_ymd;
    