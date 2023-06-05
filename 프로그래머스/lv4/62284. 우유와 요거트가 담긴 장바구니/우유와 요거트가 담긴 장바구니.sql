-- 코드를 입력하세요
# WITH MILK AS (
#     SELECT CART_ID,
#         NAME
#     FROM CART_PRODUCTS
#     WHERE NAME = 'Milk'
# ), YOGURT AS (
#     SELECT CART_ID,
#         NAME
#     FROM CART_PRODUCTS
#     WHERE NAME = 'Yogurt'
# )
# SELECT DISTINCT M.CART_ID
# FROM MILK M
# INNER JOIN YOGURT Y
#     ON M.CART_ID = Y.CART_ID
# ORDER BY 1;


SELECT DISTINCT A.CART_ID
FROM CART_PRODUCTS A
INNER JOIN CART_PRODUCTS B
    ON A.CART_ID = B.CART_ID
WHERE A.NAME = 'Milk' AND B.NAME = 'Yogurt'
ORDER BY 1;