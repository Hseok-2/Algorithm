-- 코드를 작성해주세요
select ITEM_ID,
        ITEM_NAME,
        RARITY
from ITEM_INFO
where item_id in (
    select it.item_id
    from item_info as ii
    join item_tree as it
    on ii.item_id = it.parent_item_id
    where ii.rarity = 'rare'
)
order by item_id desc;