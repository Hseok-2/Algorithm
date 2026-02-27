select  
    INGREDIENT_TYPE,
    sum(TOTAL_ORDER) as TOTAL_ORDER
from
    FIRST_HALF as f
join
    ICECREAM_INFO as i
on f.flavor = i.flavor
group by
    INGREDIENT_TYPE
order by
    TOTAL_ORDER asc;
    

    