-- 코드를 입력하세요
WITH TEMP AS (
    SELECT HOST_ID
    FROM PLACES
    GROUP BY HOST_ID
    HAVING COUNT(HOST_ID) >= 2
)
SELECT P.ID, P.NAME, P.HOST_ID
FROM PLACES P
INNER JOIN TEMP T ON P.HOST_ID = T.HOST_ID
ORDER BY 1