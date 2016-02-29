
-- Table Account
CREATE TABLE Account (
    id int  NOT NULL,
    accountType varchar(20)  NULL,
    id_currency int  NOT NULL,
    balance int  NULL,
    users_id int  NOT NULL,
    CONSTRAINT Account_pk PRIMARY KEY (id)
);

-- Table Currency
CREATE TABLE Currency (
    id int  NOT NULL,
    name varchar(10)  NULL,
    rate int  NULL,
    CONSTRAINT Currency_pk PRIMARY KEY (id)
);

-- Table History_operations
CREATE TABLE History_operations (
    id int  NOT NULL,
    id_account int  NOT NULL,
    operation varchar(20)  NULL,
    amount int  NULL,
    CONSTRAINT History_operations_pk PRIMARY KEY (id)
);

-- Table User
CREATE TABLE User (
    id int  NOT NULL,
    first_name varchar(20)  NULL,
    last_name varchar(20)  NULL,
    email varchar(40)  NULL,
    password varchar(10)  NULL,
    dateOfBirth date  NULL,
    registrationDate date  NULL,
    gender bool  NULL,
    role varchar(10)  NOT NULL,
    CONSTRAINT Users_pk PRIMARY KEY (id)
);





-- foreign keys
-- Reference:  Account_Currency (table: Account)

ALTER TABLE Account ADD CONSTRAINT Account_Currency FOREIGN KEY Account_Currency (id_currency)
    REFERENCES Currency (id);
-- Reference:  Account_Users (table: Account)

ALTER TABLE Account ADD CONSTRAINT Account_Users FOREIGN KEY Account_Users (users_id)
    REFERENCES User (id);
-- Reference:  History_operations_Account (table: History_operations)

ALTER TABLE History_operations ADD CONSTRAINT History_operations_Account FOREIGN KEY History_operations_Account (id_account)
    REFERENCES Account (id);




