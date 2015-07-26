# --- !Ups

create table test_table (id BIGSERIAL NOT NULL PRIMARY KEY,numb BIGINT NOT NULL);
INSERT INTO test_table values(null, 1);
INSERT INTO test_table values(null, 2);
INSERT INTO test_table values(null, 3);
INSERT INTO test_table values(null, 4);

# --- !Downs

drop table test_table;
