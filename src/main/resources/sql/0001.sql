CREATE TABLE CONTACT (
	ID BIGINT NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(200),AGE INT(3),
	CREATED_BY BIGINT,
	CREATED_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	LAST_UPDATED_BY BIGINT,
	LAST_UPDATED_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (ID),
	CONSTRAINT FK_CONTACT_CREATED_BY FOREIGN KEY (CREATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE,
	CONSTRAINT FK_CONTACT_LAST_UPDATED_BY FOREIGN KEY (LAST_UPDATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE
	)ENGINE=InnoDB;

	
CREATE TABLE TRAVEL (
	ID BIGINT NOT NULL AUTO_INCREMENT,
	TICKET_ID VARCHAR(150),
	TRAVEL_MODE VARCHAR(10),
	STATUS VARCHAR(25),
	TRAVELS_NAME VARCHAR(25),
	DEPARUTRE_TIME DATETIME,
	NO_OF_PASSENGERS INT(3),
	SOURCE VARCHAR(200),
	DESTINATION VARCHAR(200),
	CREATED_BY BIGINT,
	CREATED_TIME TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
	LAST_UPDATED_BY BIGINT,
	LAST_UPDATED_TIME TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (ID),
	CONSTRAINT FK_TRAVEL_CREATED_BY FOREIGN KEY (CREATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE,
	CONSTRAINT FK_TRAVEL_LAST_UPDATED_BY FOREIGN KEY (LAST_UPDATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE)ENGINE=InnoDB;
	

CREATE TABLE CONTACT_DETAILS(
	ID BIGINT NOT NULL AUTO_INCREMENT,
	PHONE_NUMBER VARCHAR(15),
	EMAIL VARCHAR(100),
	ADDRESS VARCHAR(200),
	TYPE VARCHAR(15),
	CONTACT_ID BIGINT,
	CREATED_BY BIGINT,
	CREATED_TIME TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
	LAST_UPDATED_BY BIGINT,
	LAST_UPDATED_TIME TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (ID),
	CONSTRAINT FK_CONTACT_DETAILS_CONTACT_ID FOREIGN KEY (CONTACT_ID)REFERENCES CONTACT(ID) ON DELETE CASCADE,
	CONSTRAINT FK_CONTACT_DETAILS_CREATED_BY FOREIGN KEY (CREATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE,
	CONSTRAINT FK_CONTACT_DETAILS_LAST_UPDATED_BY FOREIGN KEY (LAST_UPDATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE
) ENGINE=InnoDB;	
	
CREATE TABLE TRAVEL_CONTACT_ASSOC(
	ID BIGINT NOT NULL AUTO_INCREMENT,
	CONTACT_ID BIGINT,
	TRAVEL_ID BIGINT,
	CREATED_BY BIGINT,
	CREATED_TIME TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
	LAST_UPDATED_BY BIGINT,
	LAST_UPDATED_TIME TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (ID),
	CONSTRAINT FK_TRAVEL_CONTACT_ASSOCL_CREATED_BY FOREIGN KEY (CREATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE,
	CONSTRAINT FK_TRAVEL_CONTACT_ASSOC_LAST_UPDATED_BY FOREIGN KEY (LAST_UPDATED_BY)REFERENCES CONTACT(ID) ON DELETE CASCADE
	)ENGINE=InnoDB;

	