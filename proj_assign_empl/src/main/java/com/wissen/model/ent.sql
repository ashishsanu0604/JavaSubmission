CREATE TABLE Issues (
    ID INT(6) NOT NULL,
    Date1 DATE NOT NULL,
    Disease VARCHAR(20) NOT NULL,
    status  Bit(1) NOT NULL,
    FOREIGN KEY (Disease) REFERENCES Dc(Disease)
);
CREATE TABLE Dc (
    Disease VARCHAR(20) UNIQUE NOT NULL,
    Cost  INT(20) NOT NULL,
    PRIMARY KEY (Disease)
);