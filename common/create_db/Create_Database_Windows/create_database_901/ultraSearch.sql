
connect SYS/change_on_install as SYSDBA

define ORACLE_HOME = &1
define ORACLE_SID  = &2

set echo on

spool ultraSearch.log

@%ORACLE_HOME%\ultrasearch\admin\wk0install.sql SYS change_on_install change_on_install &ORACLE_SID 1521 DRSYS TEMP;

spool off

exit;
