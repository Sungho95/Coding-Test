WITH TEMP AS (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE >= '2022-08-01' AND START_DATE < '2022-11-01'
    GROUP BY CAR_ID
    HAVING COUNT(CAR_ID) >= 5
)
SELECT MONTH(H.START_DATE) AS MONTH,
    H.CAR_ID,
    COUNT(H.HISTORY_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
INNER JOIN TEMP T ON H.CAR_ID = T.CAR_ID
WHERE H.START_DATE >= '2022-08-01' AND H.START_DATE < '2022-11-01'
GROUP BY 1, 2
ORDER BY 1, 2 DESC;