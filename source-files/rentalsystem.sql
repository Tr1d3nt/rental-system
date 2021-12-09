-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema rentalsystem
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `rentalsystem` ;

-- -----------------------------------------------------
-- Schema rentalsystem
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rentalsystem` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `rentalsystem` ;

-- -----------------------------------------------------
-- Table `rentalsystem`.`fee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rentalsystem`.`fee` ;

CREATE TABLE IF NOT EXISTS `rentalsystem`.`fee` (
                                                    `managerID` INT NOT NULL,
                                                    `amount` INT NOT NULL,
                                                    `period` INT NOT NULL,
                                                    PRIMARY KEY (`managerID`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rentalsystem`.`notifications`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rentalsystem`.`notifications` ;

CREATE TABLE IF NOT EXISTS `rentalsystem`.`notifications` (
                                                              `renterID` INT NOT NULL,
                                                              `renterUserName` VARCHAR(300) NULL DEFAULT NULL,
    `type` VARCHAR(45) NULL DEFAULT NULL,
    `bedrooms` INT NULL DEFAULT NULL,
    `bathrooms` INT NULL DEFAULT NULL,
    `furnished` VARCHAR(30) NULL DEFAULT NULL,
    `quadrant` VARCHAR(2) NULL DEFAULT NULL,
    `status` VARCHAR (45) NULL DEFAULT NULL,
    PRIMARY KEY (`renterID`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rentalsystem`.`property`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rentalsystem`.`property` ;

CREATE TABLE IF NOT EXISTS `rentalsystem`.`property` (
                                                         `propertyID` INT NOT NULL,
                                                         `landlordEmail` VARCHAR(300) NULL DEFAULT NULL,
    `address` VARCHAR(300) NULL DEFAULT NULL,
    `type` VARCHAR(45) NULL DEFAULT NULL,
    `bedrooms` INT NULL DEFAULT NULL,
    `bathrooms` INT NULL DEFAULT NULL,
    `furnished` VARCHAR(3) NULL DEFAULT NULL,
    `quadrant` VARCHAR(2) NULL DEFAULT NULL,
    `status` VARCHAR(45) NULL DEFAULT NULL,
    `submitted` DATE NULL DEFAULT NULL,
    `expiry` DATE NULL DEFAULT NULL,
    PRIMARY KEY (`propertyID`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rentalsystem`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rentalsystem`.`user` ;

CREATE TABLE IF NOT EXISTS `rentalsystem`.`user` (
                                                     `userID` INT NOT NULL,
                                                     `userName` VARCHAR(100) NULL DEFAULT NULL,
    `Password` VARCHAR(45) NULL DEFAULT NULL,
    `userType` VARCHAR(45) NULL DEFAULT NULL,
    PRIMARY KEY (`userID`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


---------------------------------------
-- Adding Users + Properties + Fees --
---------------------------------------
INSERT INTO property (propertyID, landlordEmail, address, type, bedrooms, bathrooms, furnished, quadrant, status, submitted, expiry) VALUES (0, "landlord@land.com", "123 street", "Apartment", 2, 1, "Yes", "NW", "Active", "2021-12-09", "2022-01-09");
INSERT INTO property (propertyID, landlordEmail, address, type, bedrooms, bathrooms, furnished, quadrant, status, submitted, expiry) VALUES (2, "landlord2@land.com", "321 street", "Attached", 3, 1, "Yes", "SW", "Active", "2021-12-09", "2022-01-09");

INSERT INTO user (userID, userName, Password, userType) VALUES (0, "admin@admin.com", "admin", "Manager");
INSERT INTO user (userID, userName, Password, userType) VALUES (1, "landlord@land.com", "landlord", "Landlord");
INSERT INTO user (userID, userName, Password, userType) VALUES (2, "landlord2@land.com", "landlord2", "Landlord");
INSERT INTO user (userID, userName, Password, userType) VALUES (3, "renter@renter.com", "renter", "Renter");

INSERT INTO fee (managerID, amount, period) VALUES (0, 30, 30);
INSERT INTO fee (managerID, amount, period) VALUES (1, 60, 60);
INSERT INTO fee (managerID, amount, period) VALUES (2, 90, 90);

