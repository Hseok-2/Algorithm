-- 코드를 입력하세요
SELECT f.FLAVOR as flavor
from FIRST_HALF as f
inner join ICECREAM_INFO i
on f.flavor = i.flavor
where f.TOTAL_ORDER > 3000 and i.INGREDIENT_TYPE = 'fruit_based'
order by f.total_order desc;