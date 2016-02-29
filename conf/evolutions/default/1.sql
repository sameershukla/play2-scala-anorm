# Tasks Contacts

# --- !Ups

CREATE TABLE contacts (
    id int NOT NULL AUTO_INCREMENT,
    name 			varchar(255),
    email 		    varchar(255),
    PRIMARY KEY (id)
);

INSERT INTO CONTACTS (ID, NAME, EMAIL) VALUES (1, "Sameer", "sameer.shukla@gmail.com");
INSERT INTO CONTACTS (ID, NAME, EMAIL) VALUES (2, "Aryav", "aryav.shukla@gmail.com");

# --- !Downs

DROP TABLE contacts;