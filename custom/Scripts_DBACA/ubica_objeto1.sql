-- ubica cualquier objeto por nombre
--Sergio Cruz
col owner format a12
col SUBOBJECT_NAME format a12
select * from all_objects
where object_name like '&OBJETO';