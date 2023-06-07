-- 코드를 입력하세요
WITH TEMP AS (
    SELECT FOOD_TYPE,
        MAX(FAVORITES) AS MAX
    FROM REST_INFO
    GROUP BY FOOD_TYPE
)
SELECT R.FOOD_TYPE,
    R.REST_ID,
    R.REST_NAME,
    R.FAVORITES
FROM REST_INFO R
INNER JOIN TEMP T ON R.FOOD_TYPE = T.FOOD_TYPE
WHERE R.FAVORITES = MAX
ORDER BY R.FOOD_TYPE DESC;
# 한식	734
# 중식	20
# 일식	230
# 양식	102
# 분식	151