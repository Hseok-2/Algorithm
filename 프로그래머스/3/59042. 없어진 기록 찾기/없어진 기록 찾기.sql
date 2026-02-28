SELECT
    au.ANIMAL_ID,
    au.NAME
from 
    ANIMAL_INS as ai
right join
    ANIMAL_OUTS as au
on ai.animal_id = au.animal_id
where 
    ai.ANIMAL_ID is null
order by
    au.ANIMAL_ID asc;
    
