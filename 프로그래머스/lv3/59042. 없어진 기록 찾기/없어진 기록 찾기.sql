-- 코드를 입력하세요
SELECT AO.ANIMAL_ID, AO.NAME
FROM ANIMAL_OUTS AO
LEFT JOIN ANIMAL_INS AI
    ON AO.ANIMAL_ID = AI.ANIMAL_ID
WHERE AI.DATETIME IS NULL
ORDER BY AO.ANIMAL_ID, AO.NAME