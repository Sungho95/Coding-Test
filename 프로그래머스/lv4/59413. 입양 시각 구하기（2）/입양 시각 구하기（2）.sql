-- 코드를 입력하세요
WITH RECURSIVE TIME AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
    FROM TIME
    WHERE HOUR < 23
), OUTS AS (
    SELECT HOUR(DATETIME) AS HOUR,
        COUNT(ANIMAL_ID) AS COUNT
    FROM ANIMAL_OUTS
    GROUP BY HOUR
)
SELECT T.HOUR,
    IFNULL(O.COUNT, 0) AS COUNT
FROM TIME T
LEFT JOIN OUTS O
    ON T.HOUR = O.HOUR
ORDER BY 1;