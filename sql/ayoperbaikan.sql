-- MySQL dump 10.13  Distrib 5.6.35, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: AYOPERBAIKAN
-- ------------------------------------------------------
-- Server version	5.6.35-1+deb.sury.org~xenial+0.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbPerbaikan`
--

DROP TABLE IF EXISTS `tbPerbaikan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbPerbaikan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matapelajaran` varchar(45) DEFAULT NULL,
  `jenisperbaikan` varchar(45) DEFAULT NULL,
  `kegiatanperbaikan` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbPerbaikan`
--

LOCK TABLES `tbPerbaikan` WRITE;
/*!40000 ALTER TABLE `tbPerbaikan` DISABLE KEYS */;
INSERT INTO `tbPerbaikan` VALUES (1,'Bahasa Indonesia','UH 2','Papertest','Selesai'),(2,'Matematika','UH 1','Paperless','Selesai'),(3,'Bahasa Inggris','UH 1','Paperless','Selesai'),(4,'Matematika','UH 2','Paperless','Selesai'),(5,'Bahasa Indonesia','UH 2','Paperless','Selesai'),(6,'Bahasa Indonesia','UH 2','Paperless','Selesai'),(7,'Bahasa Indonesia','UH 2','Paperless','Pending');
/*!40000 ALTER TABLE `tbPerbaikan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbUser`
--

DROP TABLE IF EXISTS `tbUser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbUser` (
  `username` varchar(25) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbUser`
--

LOCK TABLES `tbUser` WRITE;
/*!40000 ALTER TABLE `tbUser` DISABLE KEYS */;
INSERT INTO `tbUser` VALUES ('dan','dan'),('root','root');
/*!40000 ALTER TABLE `tbUser` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-01 16:13:00
