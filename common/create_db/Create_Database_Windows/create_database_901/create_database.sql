
connect SYS/change_on_install as SYSDBA

define ORACLE_HOME = &1
define ORACLE_SID  = &2

set echo on

spool create_database.log

startup nomount

CREATE DATABASE &ORACLE_SID
  MAXINSTANCES   10
  MAXLOGHISTORY  1000
  MAXLOGFILES    32
  MAXLOGMEMBERS  5
  MAXDATAFILES   600
DATAFILE 'C:\oracle\oradata\&ORACLE_SID\system01.dbf' SIZE 500M
  REUSE
  AUTOEXTEND ON
  NEXT 10M
  MAXSIZE UNLIMITED
DEFAULT TEMPORARY TABLESPACE temp
  TEMPFILE 'C:\oracle\oradata\&ORACLE_SID\temp01.dbf' SIZE 100M
  REUSE
  EXTENT MANAGEMENT LOCAL UNIFORM SIZE 500K
UNDO TABLESPACE "UNDOTBS"
  DATAFILE 'C:\oracle\oradata\&ORACLE_SID\undotbs01.dbf' SIZE 200M
  REUSE
  AUTOEXTEND ON
  NEXT 5M
  MAXSIZE UNLIMITED
CHARACTER SET WE8ISO8859P1
NATIONAL CHARACTER SET UTF8
LOGFILE
  GROUP 1
 ('C:\oracle\oradata\&ORACLE_SID\redo_g01a.log',
  'C:\oracle\oradata\&ORACLE_SID\redo_g01b.log',
  'C:\oracle\oradata\&ORACLE_SID\redo_g01c.log') SIZE 1M,
  GROUP 2 
( 'C:\oracle\oradata\&ORACLE_SID\redo_g02a.log',
  'C:\oracle\oradata\&ORACLE_SID\redo_g02b.log',
  'C:\oracle\oradata\&ORACLE_SID\redo_g02c.log') SIZE 1M,
  GROUP 3 
( 'C:\oracle\oradata\&ORACLE_SID\redo_g03a.log',
  'C:\oracle\oradata\&ORACLE_SID\redo_g03b.log',
  'C:\oracle\oradata\&ORACLE_SID\redo_g03c.log') SIZE 1M
/

spool off
exit;
