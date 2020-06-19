CREATE TABLE vehicle (
    id                    INT NOT NULL,
    name                  VARCHAR2(50) NOT NULL,
    model                 VARCHAR2(50) NOT NULL,
    manufacturing_date    DATE NOT NULL,
    consumption_city      FLOAT NOT NULL,
    consumption_highway   FLOAT NOT NULL
);

ALTER TABLE vehicle
    ADD CONSTRAINT vehicle_pk
        PRIMARY KEY (id);

ALTER TABLE vehicle
    ADD CONSTRAINT vehicle_uk
        UNIQUE (name);

CREATE SEQUENCE s_vehicle
    MINVALUE 1 MAXVALUE 999999999
        NOCACHE ORDER;
