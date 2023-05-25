-- 코드를 입력하세요
SELECT CC.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR CC
INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY CH
    ON CC.CAR_ID = CH.CAR_ID
    AND CC.CAR_TYPE = '세단'
    AND CH.START_DATE >= '2022-10-01' AND CH.START_DATE < '2022-11-01'
GROUP BY 1
ORDER BY 1 DESC;