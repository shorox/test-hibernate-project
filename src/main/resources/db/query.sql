-- Role: hb_user
-- DROP ROLE hb_user;

CREATE ROLE hb_user WITH
  NOLOGIN
  NOSUPERUSER
  INHERIT
  NOCREATEDB
  NOCREATEROLE
  NOREPLICATION;

-- Database: Hibernate

-- DROP DATABASE "Hibernate";

CREATE DATABASE "Hibernate"
    WITH
    OWNER = hb_user
    ENCODING = 'UTF8'
    LC_COLLATE = 'Russian_Russia.1251'
    LC_CTYPE = 'Russian_Russia.1251'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

-- Table: public.users

-- DROP TABLE public.users;

CREATE TABLE public.users
(
    id integer NOT NULL,
    name character varying(200) COLLATE pg_catalog."default" NOT NULL,
    age integer,
    CONSTRAINT id PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to hb_user;

-- Table: public.autos

-- DROP TABLE public.autos;

CREATE TABLE public.autos
(
    id integer NOT NULL,
    user_id integer NOT NULL,
    model character varying(50) COLLATE pg_catalog."default" NOT NULL,
    color character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT auto_id PRIMARY KEY (id)
        INCLUDE(id),
    CONSTRAINT user_id FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.autos
    OWNER to hb_user;

