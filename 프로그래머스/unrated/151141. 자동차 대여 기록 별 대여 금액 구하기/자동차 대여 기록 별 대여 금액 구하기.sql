-- 코드를 입력하세요
SELECT HISTORY_ID,
    ROUND(DAILY_FEE * (DATEDIFF(END_DATE, START_DATE) + 1) * (100 - IF(DISCOUNT_RATE IS NULL, 0, DISCOUNT_RATE)) / 100) AS FEE
FROM CAR_RENTAL_COMPANY_CAR CC
INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY RH
    ON CC.CAR_ID = RH.CAR_ID
LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN DP
    ON CC.CAR_TYPE = DP.CAR_TYPE
    AND DP.DURATION_TYPE = (CASE
                                WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= '90' THEN '90일 이상'
                                WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= '30' THEN '30일 이상'
                                WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= '7' THEN '7일 이상'
                                ELSE NULL
                            END)
WHERE CC.CAR_TYPE = '트럭'
ORDER BY FEE DESC, HISTORY_ID DESC;