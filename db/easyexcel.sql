CREATE DATABASE `easyexcel` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
-- easyexcel.student definition
CREATE TABLE `student` (
                           `id` varchar(100) NOT NULL,
                           `name` varchar(100) DEFAULT NULL,
                           `gender` varchar(45) DEFAULT NULL,
                           `birth_date` date DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;