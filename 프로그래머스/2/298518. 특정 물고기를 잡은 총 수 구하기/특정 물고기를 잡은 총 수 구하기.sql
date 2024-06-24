-- 코드를 작성해주세요
SELECT COUNT(FISH_TYPE) as FISH_COUNT
FROM FISH_INFO
WHERE FISH_TYPE in 
    (SELECT FISH_TYPE
    FROM FISH_NAME_INFO
    WHERE FISH_NAME = "BASS" or FISH_NAME = "SNAPPER")