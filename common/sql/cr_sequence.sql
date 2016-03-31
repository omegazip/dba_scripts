-- +----------------------------------------------------------------------------+
-- |                          Jeffrey M. Hunter                                 |
-- |                      jhunter@idevelopment.info                             |
-- |                         www.idevelopment.info                              |
-- |----------------------------------------------------------------------------|
-- |      Copyright (c) 1998-2011 Jeffrey M. Hunter. All rights reserved.       |
-- |----------------------------------------------------------------------------|
-- | DATABASE : Oracle                                                          |
-- | FILE     : cr_sequence.sql                                                 |
-- | CLASS    : Create Object Examples                                          |
-- | PURPOSE  : Example SQL script that demonstrates how to create a sequence   |
-- |            number generator.                                               |
-- | NOTE     : As with any code, ensure to test this script in a development   |
-- |            environment before attempting to run it in production.          |
-- +----------------------------------------------------------------------------+

DROP SEQUENCE user_id_seq
/

CREATE SEQUENCE user_id_seq
       INCREMENT BY 1
       START WITH 1000
       NOMAXVALUE
       NOCYCLE
/
