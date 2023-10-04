CREATE DATABASE  IF NOT EXISTS `doctor_directory`;
USE `doctor_directory`;


DROP TABLE IF EXISTS `doctor`;

CREATE TABLE `doctor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `specialization` varchar(45) DEFAULT NULL,
  `maxappointments` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



INSERT INTO `doctor` VALUES 
	(1,'Leslie','Cardio',10),
	(2,'Emma','Neuro',5),
	(3,'Avani','Pedia',15),
	(4,'Yuri','Gyno',20),
	(5,'Juan','General',30);
    

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `doctor` int DEFAULT NULL,
  `time`  datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



INSERT INTO `appointment` VALUES 
	(1,'1',"2023-10-01 10:43:22"),
	(2,'2',"2023-10-01 11:52:00"),
	(3,'3',"2023-10-01 15:45:34"),
	(4,'4',"2023-10-01 17:15:19"),
	(5,'5',"2023-10-01 21:05:01");



