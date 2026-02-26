SELECT 
    date_format(SALES_DATE,'%Y-%m-%d') as SALES_DATE,
    PRODUCT_ID,
    USER_ID,
    SALES_AMOUNT
from 
    ONLINE_SALE
where 
    year(sales_date) = 2022
    and month(sales_date) = 3
union all
select
    date_format(SALES_DATE,'%Y-%m-%d') as SALES_DATE,
    product_id,
    null as user_id,
    sales_amount
from
    OFFLINE_SALE
where 
    year(sales_date) = 2022
    and month(sales_date) = 3
order by
    sales_date asc,
    product_id asc,
    user_id asc;
    
