ALTER INDEX OPGE.POGE_CAMBESTBOLSAS_I01 REBUILD;
ALTER INDEX OPGE.POGE_CAMBESTBOLSAS_I02 REBUILD;
ALTER INDEX OPGE.POGE_CAMBESTBOLSAS_PK REBUILD;
exec dbms_stats.gather_table_stats('OPGE', 'POGE_CAMBESTBOLSAS', CASCADE => TRUE, ESTIMATE_PERCENT => 5,degree => 4);
