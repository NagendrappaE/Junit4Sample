DROP TABLE IF EXISTS ta_student;

CREATE TABLE ta_student (
  id bigint auto_increment  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  usn VARCHAR(250) NOT NULL
);
