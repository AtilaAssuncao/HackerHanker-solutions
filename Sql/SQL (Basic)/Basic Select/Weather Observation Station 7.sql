SELECT DISTINCT(`CITY`) FROM STATION WHERE `CITY` REGEXP('[aeiou]$');

-- or

SELECT DISTINCT(`CITY`) FROM STATION WHERE REGEXP_LIKE(`CITY`, '[aeiou]$')