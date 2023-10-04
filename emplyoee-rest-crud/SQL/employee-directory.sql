CREATE DATABASE  IF NOT EXISTS `appointment_directory`;
USE `appointment_directory`;


DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `doctor` varchar(45) DEFAULT NULL,
  `time` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



INSERT INTO `appointment` VALUES 
	(1,'Leslie','10:43:22'),
	(2,'Emma','11:52:00'),
	(3,'Avani','15:45:34'),
	(4,'Yuri','17:15:19'),
	(5,'Juan','21:05:01');

