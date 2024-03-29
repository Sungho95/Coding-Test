-- 코드를 입력하세요
-- 정규식
# SELECT CAR_TYPE,
#     COUNT(CAR_TYPE) AS CASRS
# FROM CAR_RENTAL_COMPANY_CAR
# WHERE REGEXP_LIKE(OPTIONS, '통풍시트|열선시트|가죽시트')
# GROUP BY CAR_TYPE
# ORDER BY CAR_TYPE ASC;

-- LIKE
SELECT CAR_TYPE,
    COUNT(CAR_TYPE) AS CASRS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%' OR
    OPTIONS LIKE '%열선시트%' OR
    OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE ASC;