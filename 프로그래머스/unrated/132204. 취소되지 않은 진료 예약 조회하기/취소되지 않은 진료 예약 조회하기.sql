-- 코드를 입력하세요
SELECT A.APNT_NO,
    P.PT_NAME,
    P.PT_NO,
    D.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
FROM APPOINTMENT A
INNER JOIN PATIENT P
    ON A.PT_NO = P.PT_NO
INNER JOIN DOCTOR D
    ON A.MDDR_ID = D.DR_ID
WHERE A.APNT_YMD >= '2022-04-13' AND A.APNT_YMD < '2022-05-01'
    AND A.APNT_CNCL_YN = 'N'
    AND A.MCDP_CD = 'CS'
ORDER BY A.APNT_YMD ASC;