-- 코드를 입력하세요
SELECT ri.REST_ID,
        ri.REST_NAME,
        ri.FOOD_TYPE,
        ri.FAVORITES,
        ri.ADDRESS,
        round(avg(rn.review_score),2) as SCORE
from REST_INFO as ri
join REST_REVIEW  as rn
on ri.rest_id = rn.rest_id
where ri.address like '서울%'
group by ri.rest_id
order by score desc, ri.favorites desc;