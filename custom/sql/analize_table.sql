exec dbms_stats.gather_table_stats(ownname =>'&schema',tabname =>'&tabla',estimate_percent =>dbms_stats.auto_sample_size, method_opt =>'for all columns size skewonly', degree => 6, cascade => TRUE, granularity => 'ALL');