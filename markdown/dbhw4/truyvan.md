# Bài 1:

```sql
SELECT b.title ,b.year_of_publication 
FROM book b  
WHERE b.year_of_publication <1900
AND b.page_number <100

SELECT b.title, b.id_publisher ,b.page_number  
FROM book b 
WHERE b.id_publisher =1
ORDER BY b.page_number ASC
```

# Bài 2:

```sql
SELECT AVG(f.rental_rate) AS 'Trung bình cộng'
FROM film f 
WHERE f.rating ='R'

SELECT JSON_ARRAYAGG(JSON_OBJECT('title',f.title ,'special features',f.special_features ))
,COUNT(f.film_id)
FROM film f 
WHERE f.special_features LIKE 'Deleted Scenes'

SELECT f.title 
FROM film f 
WHERE f.title LIKE '%ACADEMY%'
```