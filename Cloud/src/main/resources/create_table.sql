CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(128) NOT NULL ,
  `password` VARCHAR(50) NOT NULL ,
  `addTime` timestamp NOT NULL DEFAULT '2017-07-08 00:00:00',
  `updateTime` timestamp NOT NULL DEFAULT '2017-07-08 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `ix_userName` (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;