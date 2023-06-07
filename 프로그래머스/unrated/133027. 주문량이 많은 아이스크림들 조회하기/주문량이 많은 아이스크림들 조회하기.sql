-- 코드를 입력하세요
SELECT FH.FLAVOR
FROM FIRST_HALF FH
INNER JOIN JULY J
    ON FH.FLAVOR = J.FLAVOR
GROUP BY J.FLAVOR
ORDER BY SUM(FH.TOTAL_ORDER + J.TOTAL_ORDER) DESC
LIMIT 3;