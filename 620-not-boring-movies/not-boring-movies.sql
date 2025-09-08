SELECT *
FROM Cinema
Where ID%2 != 0 AND description != "boring"
ORDER BY rating DESC;
