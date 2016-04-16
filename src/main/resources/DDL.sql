CREATE TABLE person
(
  id integer NOT NULL,
  first_name character varying,
  last_name character varying,
  CONSTRAINT pk_person PRIMARY KEY (id)
);
INSERT INTO person (id, first_name, last_name) VALUES (1, "Konrad", "Grabowski");
INSERT INTO person (id, first_name, last_name) VALUES (2, "Zuzanna", "Grabowska");
INSERT INTO person (id, first_name, last_name) VALUES (3, "Jan", "Kowalski");
