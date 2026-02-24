-- 코드를 작성해주세요
select distinct ID,
        EMAIL,
        FIRST_NAME,
        LAST_NAME
from SKILLCODES as s
join DEVELOPERS as d
on (s.code & d.SKILL_CODE) != 0
where s.name = 'Python'
    or s.name = 'C#'
order by id asc;