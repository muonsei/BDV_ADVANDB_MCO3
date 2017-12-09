-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: advandb_ea
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Current Database: `advandb_ea`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `advandb_ea` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `advandb_ea`;

--
-- Table structure for table `ar`
--

DROP TABLE IF EXISTS `ar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Region` varchar(45) NOT NULL,
  `CountryName` varchar(45) NOT NULL,
  `YearC` varchar(45) NOT NULL,
  `MortalityRateOfFemale` decimal(12,4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=256 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ar`
--

LOCK TABLES `ar` WRITE;
/*!40000 ALTER TABLE `ar` DISABLE KEYS */;
INSERT INTO `ar` VALUES (1,'East Asia & Pacific','Australia','2005 [YR2005]',47.5940),(2,'East Asia & Pacific','Brunei Darussalam','2005 [YR2005]',79.7290),(3,'East Asia & Pacific','Cambodia','2005 [YR2005]',192.2450),(4,'East Asia & Pacific','China','2005 [YR2005]',85.2620),(5,'East Asia & Pacific','Fiji','2005 [YR2005]',162.2320),(6,'East Asia & Pacific','Guam','2005 [YR2005]',61.6590),(7,'East Asia & Pacific','Hong Kong SAR, China','2005 [YR2005]',41.0630),(8,'East Asia & Pacific','Indonesia','2005 [YR2005]',162.1200),(9,'East Asia & Pacific','Japan','2005 [YR2005]',44.9400),(10,'East Asia & Pacific','Kiribati','2005 [YR2005]',174.6140),(11,'East Asia & Pacific','Korea, Rep.','2005 [YR2005]',44.5940),(12,'East Asia & Pacific','Lao PDR','2005 [YR2005]',221.3230),(13,'East Asia & Pacific','Macao SAR, China','2005 [YR2005]',48.5130),(14,'East Asia & Pacific','Malaysia','2005 [YR2005]',91.1020),(15,'East Asia & Pacific','Micronesia, Fed. Sts.','2005 [YR2005]',165.4490),(16,'East Asia & Pacific','Mongolia','2005 [YR2005]',174.3060),(17,'East Asia & Pacific','Myanmar','2005 [YR2005]',196.8890),(18,'East Asia & Pacific','New Caledonia','2005 [YR2005]',73.6870),(19,'East Asia & Pacific','New Zealand','2005 [YR2005]',59.5760),(20,'East Asia & Pacific','Papua New Guinea','2005 [YR2005]',265.4610),(21,'East Asia & Pacific','Philippines','2005 [YR2005]',157.6950),(22,'Europe & Central Asia','Albania','2005 [YR2005]',53.1450),(23,'Europe & Central Asia','Armenia','2005 [YR2005]',84.6420),(24,'Europe & Central Asia','Austria','2005 [YR2005]',55.0400),(25,'Europe & Central Asia','Azerbaijan','2005 [YR2005]',103.3720),(26,'Europe & Central Asia','Belarus','2005 [YR2005]',127.9840),(27,'Europe & Central Asia','Belgium','2005 [YR2005]',62.1950),(28,'Europe & Central Asia','Bosnia and Herzegovina','2005 [YR2005]',74.0580),(29,'Europe & Central Asia','Bulgaria','2005 [YR2005]',92.4110),(30,'Europe & Central Asia','Channel Islands','2005 [YR2005]',51.0990),(31,'Europe & Central Asia','Croatia','2005 [YR2005]',65.5000),(32,'Europe & Central Asia','Cyprus','2005 [YR2005]',43.2770),(33,'Europe & Central Asia','Czech Republic','2005 [YR2005]',69.6800),(34,'Europe & Central Asia','Denmark','2005 [YR2005]',69.2870),(35,'Europe & Central Asia','Estonia','2005 [YR2005]',99.8610),(36,'Europe & Central Asia','Finland','2005 [YR2005]',63.0510),(37,'Europe & Central Asia','France','2005 [YR2005]',56.7740),(38,'Europe & Central Asia','Georgia','2005 [YR2005]',70.7580),(39,'Europe & Central Asia','Germany','2005 [YR2005]',57.1970),(40,'Europe & Central Asia','Greece','2005 [YR2005]',46.2490),(41,'Europe & Central Asia','Hungary','2005 [YR2005]',107.4440),(42,'Europe & Central Asia','Iceland','2005 [YR2005]',48.7210),(43,'Europe & Central Asia','Ireland','2005 [YR2005]',56.8320),(44,'Europe & Central Asia','Italy','2005 [YR2005]',44.0790),(45,'Europe & Central Asia','Kazakhstan','2005 [YR2005]',159.4590),(46,'Europe & Central Asia','Kyrgyz Republic','2005 [YR2005]',143.7310),(47,'Europe & Central Asia','Latvia','2005 [YR2005]',117.4250),(48,'Europe & Central Asia','Lithuania','2005 [YR2005]',112.7050),(49,'Europe & Central Asia','Luxembourg','2005 [YR2005]',56.4940),(50,'Europe & Central Asia','Macedonia, FYR','2005 [YR2005]',79.2120),(51,'Europe & Central Asia','Moldova','2005 [YR2005]',151.0160),(52,'Europe & Central Asia','Montenegro','2005 [YR2005]',94.4780),(53,'Europe & Central Asia','Netherlands','2005 [YR2005]',61.2920),(54,'Europe & Central Asia','Norway','2005 [YR2005]',56.0130),(55,'Europe & Central Asia','Poland','2005 [YR2005]',79.7970),(56,'Europe & Central Asia','Spain','2005 [YR2005]',44.3510),(57,'Europe & Central Asia','Switzerland','2005 [YR2005]',46.1920),(58,'Europe & Central Asia','United Kingdom','2005 [YR2005]',61.5710),(59,'Latin America & Caribbean','Antigua and Barbuda','2005 [YR2005]',122.3900),(60,'Latin America & Caribbean','Argentina','2005 [YR2005]',85.9520),(61,'Latin America & Caribbean','Aruba','2005 [YR2005]',82.3210),(62,'Latin America & Caribbean','Bahamas, The','2005 [YR2005]',134.9700),(63,'Latin America & Caribbean','Barbados','2005 [YR2005]',89.5680),(64,'Latin America & Caribbean','Belize','2005 [YR2005]',141.8020),(65,'Latin America & Caribbean','Bolivia','2005 [YR2005]',187.6020),(66,'Latin America & Caribbean','Brazil','2005 [YR2005]',111.3240),(67,'Latin America & Caribbean','Chile','2005 [YR2005]',57.5030),(68,'Latin America & Caribbean','Colombia','2005 [YR2005]',101.9970),(69,'Latin America & Caribbean','Costa Rica','2005 [YR2005]',67.6530),(70,'Latin America & Caribbean','Cuba','2005 [YR2005]',80.6070),(71,'Latin America & Caribbean','Curacao','2005 [YR2005]',77.3350),(72,'Latin America & Caribbean','Dominican Republic','2005 [YR2005]',134.0460),(73,'Latin America & Caribbean','Ecuador','2005 [YR2005]',103.5370),(74,'Latin America & Caribbean','Grenada','2005 [YR2005]',118.7420),(75,'Latin America & Caribbean','Guatemala','2005 [YR2005]',140.7920),(76,'Latin America & Caribbean','Guyana','2005 [YR2005]',175.9600),(77,'Latin America & Caribbean','Haiti','2005 [YR2005]',255.9520),(78,'Latin America & Caribbean','Honduras','2005 [YR2005]',135.2320),(79,'Latin America & Caribbean','Jamaica','2005 [YR2005]',115.3300),(80,'Latin America & Caribbean','Mexico','2005 [YR2005]',88.8190),(81,'Latin America & Caribbean','Nicaragua','2005 [YR2005]',129.3070),(82,'Latin America & Caribbean','Panama','2005 [YR2005]',87.6600),(83,'Latin America & Caribbean','Peru','2005 [YR2005]',109.7820),(84,'Latin America & Caribbean','Puerto Rico','2005 [YR2005]',68.8950),(85,'Latin America & Caribbean','St. Lucia','2005 [YR2005]',131.4440),(86,'Middle East & North Africa','Algeria','2005 [YR2005]',112.4570),(87,'Middle East & North Africa','Bahrain','2005 [YR2005]',69.3260),(88,'Middle East & North Africa','Djibouti','2005 [YR2005]',281.4010),(89,'Middle East & North Africa','Egypt, Arab Rep.','2005 [YR2005]',131.0890),(90,'Middle East & North Africa','Iran, Islamic Rep.','2005 [YR2005]',102.0640),(91,'Middle East & North Africa','Iraq','2005 [YR2005]',135.9900),(92,'Middle East & North Africa','Israel','2005 [YR2005]',49.5560),(93,'Middle East & North Africa','Jordan','2005 [YR2005]',105.4290),(94,'Middle East & North Africa','Kuwait','2005 [YR2005]',65.4670),(95,'Middle East & North Africa','Lebanon','2005 [YR2005]',67.0940),(96,'Middle East & North Africa','Libya','2005 [YR2005]',107.2450),(97,'Middle East & North Africa','Malta','2005 [YR2005]',48.4340),(98,'Middle East & North Africa','Morocco','2005 [YR2005]',117.7400),(99,'Middle East & North Africa','Oman','2005 [YR2005]',86.4780),(100,'Middle East & North Africa','United Arab Emirates','2005 [YR2005]',70.5410),(101,'North America','Canada','2005 [YR2005]',57.0910),(102,'South Asia','Afghanistan','2005 [YR2005]',273.6540),(103,'South Asia','Bangladesh','2005 [YR2005]',140.1370),(104,'South Asia','Bhutan','2005 [YR2005]',256.8930),(105,'South Asia','India','2005 [YR2005]',178.5140),(106,'South Asia','Maldives','2005 [YR2005]',81.7320),(107,'South Asia','Nepal','2005 [YR2005]',184.1280),(108,'South Asia','Pakistan','2005 [YR2005]',166.0060),(109,'South Asia','Sri Lanka','2005 [YR2005]',82.6110),(110,'Sub-Saharan Africa','Angola','2005 [YR2005]',358.5880),(111,'Sub-Saharan Africa','Benin','2005 [YR2005]',245.6800),(112,'Sub-Saharan Africa','Botswana','2005 [YR2005]',431.9960),(113,'Sub-Saharan Africa','Burkina Faso','2005 [YR2005]',285.9580),(114,'Sub-Saharan Africa','Burundi','2005 [YR2005]',321.0680),(115,'Sub-Saharan Africa','Cabo Verde','2005 [YR2005]',115.4090),(116,'Sub-Saharan Africa','Cameroon','2005 [YR2005]',388.4080),(117,'Sub-Saharan Africa','Central African Republic','2005 [YR2005]',477.4550),(118,'Sub-Saharan Africa','Comoros','2005 [YR2005]',235.6640),(119,'Sub-Saharan Africa','Congo, Rep.','2005 [YR2005]',363.1510),(120,'Sub-Saharan Africa','Cote d\'Ivoire','2005 [YR2005]',429.4450),(121,'Sub-Saharan Africa','Equatorial Guinea','2005 [YR2005]',320.4390),(122,'Sub-Saharan Africa','Eritrea','2005 [YR2005]',296.3700),(123,'Sub-Saharan Africa','Ethiopia','2005 [YR2005]',317.9140),(124,'Sub-Saharan Africa','Gabon','2005 [YR2005]',322.2810),(125,'Sub-Saharan Africa','Gambia, The','2005 [YR2005]',261.9220),(126,'Sub-Saharan Africa','Ghana','2005 [YR2005]',260.7330),(127,'Sub-Saharan Africa','Guinea','2005 [YR2005]',302.8440),(128,'Sub-Saharan Africa','Guinea-Bissau','2005 [YR2005]',285.2920),(129,'Sub-Saharan Africa','Kenya','2005 [YR2005]',403.0730),(130,'Sub-Saharan Africa','Lesotho','2005 [YR2005]',669.9040),(131,'Sub-Saharan Africa','Liberia','2005 [YR2005]',287.1140),(132,'Sub-Saharan Africa','Madagascar','2005 [YR2005]',240.9640),(133,'Sub-Saharan Africa','Malawi','2005 [YR2005]',499.1330),(134,'Sub-Saharan Africa','Mali','2005 [YR2005]',293.3280),(135,'Sub-Saharan Africa','Mauritania','2005 [YR2005]',197.2000),(136,'Sub-Saharan Africa','Mauritius','2005 [YR2005]',107.2940),(137,'Sub-Saharan Africa','Mozambique','2005 [YR2005]',410.2400),(138,'Sub-Saharan Africa','Namibia','2005 [YR2005]',381.0020),(139,'Sub-Saharan Africa','Niger','2005 [YR2005]',267.9390),(140,'Sub-Saharan Africa','Nigeria','2005 [YR2005]',380.8400);
/*!40000 ALTER TABLE `ar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ea`
--

DROP TABLE IF EXISTS `ea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Region` varchar(45) NOT NULL,
  `CountryName` varchar(45) NOT NULL,
  `YearC` varchar(45) NOT NULL,
  `MortalityRateOfFemale` decimal(12,4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ea`
--

LOCK TABLES `ea` WRITE;
/*!40000 ALTER TABLE `ea` DISABLE KEYS */;
INSERT INTO `ea` VALUES (1,'Europe & Central Asia','Albania','2005 [YR2005]',53.1450),(2,'Europe & Central Asia','Armenia','2005 [YR2005]',84.6420),(3,'Europe & Central Asia','Austria','2005 [YR2005]',55.0400),(4,'Europe & Central Asia','Azerbaijan','2005 [YR2005]',103.3720),(5,'Europe & Central Asia','Belarus','2005 [YR2005]',127.9840),(6,'Europe & Central Asia','Belgium','2005 [YR2005]',62.1950),(7,'Europe & Central Asia','Bosnia and Herzegovina','2005 [YR2005]',74.0580),(8,'Europe & Central Asia','Bulgaria','2005 [YR2005]',92.4110),(9,'Europe & Central Asia','Channel Islands','2005 [YR2005]',51.0990),(10,'Europe & Central Asia','Croatia','2005 [YR2005]',65.5000),(11,'Europe & Central Asia','Cyprus','2005 [YR2005]',43.2770),(12,'Europe & Central Asia','Czech Republic','2005 [YR2005]',69.6800),(13,'Europe & Central Asia','Denmark','2005 [YR2005]',69.2870),(14,'Europe & Central Asia','Estonia','2005 [YR2005]',99.8610),(15,'Europe & Central Asia','Finland','2005 [YR2005]',63.0510),(16,'Europe & Central Asia','France','2005 [YR2005]',56.7740),(17,'Europe & Central Asia','Georgia','2005 [YR2005]',70.7580),(18,'Europe & Central Asia','Germany','2005 [YR2005]',57.1970),(19,'Europe & Central Asia','Greece','2005 [YR2005]',46.2490),(20,'Europe & Central Asia','Hungary','2005 [YR2005]',107.4440),(21,'Europe & Central Asia','Iceland','2005 [YR2005]',48.7210),(22,'Europe & Central Asia','Ireland','2005 [YR2005]',56.8320),(23,'Europe & Central Asia','Italy','2005 [YR2005]',44.0790),(24,'Europe & Central Asia','Kazakhstan','2005 [YR2005]',159.4590),(25,'Europe & Central Asia','Kyrgyz Republic','2005 [YR2005]',143.7310),(26,'Europe & Central Asia','Latvia','2005 [YR2005]',117.4250),(27,'Europe & Central Asia','Lithuania','2005 [YR2005]',112.7050),(28,'Europe & Central Asia','Luxembourg','2005 [YR2005]',56.4940),(29,'Europe & Central Asia','Macedonia, FYR','2005 [YR2005]',79.2120),(30,'Europe & Central Asia','Moldova','2005 [YR2005]',151.0160),(31,'Europe & Central Asia','Montenegro','2005 [YR2005]',94.4780),(32,'Europe & Central Asia','Netherlands','2005 [YR2005]',61.2920),(33,'Europe & Central Asia','Norway','2005 [YR2005]',56.0130),(34,'Europe & Central Asia','Poland','2005 [YR2005]',79.7970),(35,'Europe & Central Asia','Spain','2005 [YR2005]',44.3510),(36,'Europe & Central Asia','Switzerland','2005 [YR2005]',46.1920),(37,'Europe & Central Asia','United Kingdom','2005 [YR2005]',61.5710),(38,'Latin America & Caribbean','Antigua and Barbuda','2005 [YR2005]',122.3900),(39,'Latin America & Caribbean','Argentina','2005 [YR2005]',85.9520),(40,'Latin America & Caribbean','Aruba','2005 [YR2005]',82.3210),(41,'Latin America & Caribbean','Bahamas, The','2005 [YR2005]',134.9700),(42,'Latin America & Caribbean','Barbados','2005 [YR2005]',89.5680),(43,'Latin America & Caribbean','Belize','2005 [YR2005]',141.8020),(44,'Latin America & Caribbean','Bolivia','2005 [YR2005]',187.6020),(45,'Latin America & Caribbean','Brazil','2005 [YR2005]',111.3240),(46,'Latin America & Caribbean','Chile','2005 [YR2005]',57.5030),(47,'Latin America & Caribbean','Colombia','2005 [YR2005]',101.9970),(48,'Latin America & Caribbean','Costa Rica','2005 [YR2005]',67.6530),(49,'Latin America & Caribbean','Cuba','2005 [YR2005]',80.6070),(50,'Latin America & Caribbean','Curacao','2005 [YR2005]',77.3350),(51,'Latin America & Caribbean','Dominican Republic','2005 [YR2005]',134.0460),(52,'Latin America & Caribbean','Ecuador','2005 [YR2005]',103.5370),(53,'Latin America & Caribbean','Grenada','2005 [YR2005]',118.7420),(54,'Latin America & Caribbean','Guatemala','2005 [YR2005]',140.7920),(55,'Latin America & Caribbean','Guyana','2005 [YR2005]',175.9600),(56,'Latin America & Caribbean','Haiti','2005 [YR2005]',255.9520),(57,'Latin America & Caribbean','Honduras','2005 [YR2005]',135.2320),(58,'Latin America & Caribbean','Jamaica','2005 [YR2005]',115.3300),(59,'Latin America & Caribbean','Mexico','2005 [YR2005]',88.8190),(60,'Latin America & Caribbean','Nicaragua','2005 [YR2005]',129.3070),(61,'Latin America & Caribbean','Panama','2005 [YR2005]',87.6600),(62,'Latin America & Caribbean','Peru','2005 [YR2005]',109.7820),(63,'Latin America & Caribbean','Puerto Rico','2005 [YR2005]',68.8950),(64,'Latin America & Caribbean','St. Lucia','2005 [YR2005]',131.4440),(65,'North America','Canada','2005 [YR2005]',57.0910);
/*!40000 ALTER TABLE `ea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'advandb_ea'
--

--
-- Dumping routines for database 'advandb_ea'
--

--
-- Current Database: `advandb_ar`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `advandb_ar` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `advandb_ar`;

--
-- Table structure for table `aa`
--

DROP TABLE IF EXISTS `aa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Region` varchar(45) NOT NULL,
  `CountryName` varchar(45) NOT NULL,
  `YearC` varchar(45) NOT NULL,
  `MortalityRateOfFemale` decimal(12,4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aa`
--

LOCK TABLES `aa` WRITE;
/*!40000 ALTER TABLE `aa` DISABLE KEYS */;
INSERT INTO `aa` VALUES (1,'East Asia & Pacific','Australia','2005 [YR2005]',47.5940),(2,'East Asia & Pacific','Brunei Darussalam','2005 [YR2005]',79.7290),(3,'East Asia & Pacific','Cambodia','2005 [YR2005]',192.2450),(4,'East Asia & Pacific','China','2005 [YR2005]',85.2620),(5,'East Asia & Pacific','Fiji','2005 [YR2005]',162.2320),(6,'East Asia & Pacific','Guam','2005 [YR2005]',61.6590),(7,'East Asia & Pacific','Hong Kong SAR, China','2005 [YR2005]',41.0630),(8,'East Asia & Pacific','Indonesia','2005 [YR2005]',162.1200),(9,'East Asia & Pacific','Japan','2005 [YR2005]',44.9400),(10,'East Asia & Pacific','Kiribati','2005 [YR2005]',174.6140),(11,'East Asia & Pacific','Korea, Rep.','2005 [YR2005]',44.5940),(12,'East Asia & Pacific','Lao PDR','2005 [YR2005]',221.3230),(13,'East Asia & Pacific','Macao SAR, China','2005 [YR2005]',48.5130),(14,'East Asia & Pacific','Malaysia','2005 [YR2005]',91.1020),(15,'East Asia & Pacific','Micronesia, Fed. Sts.','2005 [YR2005]',165.4490),(16,'East Asia & Pacific','Mongolia','2005 [YR2005]',174.3060),(17,'East Asia & Pacific','Myanmar','2005 [YR2005]',196.8890),(18,'East Asia & Pacific','New Caledonia','2005 [YR2005]',73.6870),(19,'East Asia & Pacific','New Zealand','2005 [YR2005]',59.5760),(20,'East Asia & Pacific','Papua New Guinea','2005 [YR2005]',265.4610),(21,'East Asia & Pacific','Philippines','2005 [YR2005]',157.6950),(22,'Middle East & North Africa','Algeria','2005 [YR2005]',112.4570),(23,'Middle East & North Africa','Bahrain','2005 [YR2005]',69.3260),(24,'Middle East & North Africa','Djibouti','2005 [YR2005]',281.4010),(25,'Middle East & North Africa','Egypt, Arab Rep.','2005 [YR2005]',131.0890),(26,'Middle East & North Africa','Iran, Islamic Rep.','2005 [YR2005]',102.0640),(27,'Middle East & North Africa','Iraq','2005 [YR2005]',135.9900),(28,'Middle East & North Africa','Israel','2005 [YR2005]',49.5560),(29,'Middle East & North Africa','Jordan','2005 [YR2005]',105.4290),(30,'Middle East & North Africa','Kuwait','2005 [YR2005]',65.4670),(31,'Middle East & North Africa','Lebanon','2005 [YR2005]',67.0940),(32,'Middle East & North Africa','Libya','2005 [YR2005]',107.2450),(33,'Middle East & North Africa','Malta','2005 [YR2005]',48.4340),(34,'Middle East & North Africa','Morocco','2005 [YR2005]',117.7400),(35,'Middle East & North Africa','Oman','2005 [YR2005]',86.4780),(36,'Middle East & North Africa','United Arab Emirates','2005 [YR2005]',70.5410),(37,'South Asia','Afghanistan','2005 [YR2005]',273.6540),(38,'South Asia','Bangladesh','2005 [YR2005]',140.1370),(39,'South Asia','Bhutan','2005 [YR2005]',256.8930),(40,'South Asia','India','2005 [YR2005]',178.5140),(41,'South Asia','Maldives','2005 [YR2005]',81.7320),(42,'South Asia','Nepal','2005 [YR2005]',184.1280),(43,'South Asia','Pakistan','2005 [YR2005]',166.0060),(44,'South Asia','Sri Lanka','2005 [YR2005]',82.6110),(45,'Sub-Saharan Africa','Angola','2005 [YR2005]',358.5880),(46,'Sub-Saharan Africa','Benin','2005 [YR2005]',245.6800),(47,'Sub-Saharan Africa','Botswana','2005 [YR2005]',431.9960),(48,'Sub-Saharan Africa','Burkina Faso','2005 [YR2005]',285.9580),(49,'Sub-Saharan Africa','Burundi','2005 [YR2005]',321.0680),(50,'Sub-Saharan Africa','Cabo Verde','2005 [YR2005]',115.4090),(51,'Sub-Saharan Africa','Cameroon','2005 [YR2005]',388.4080),(52,'Sub-Saharan Africa','Central African Republic','2005 [YR2005]',477.4550),(53,'Sub-Saharan Africa','Comoros','2005 [YR2005]',235.6640),(54,'Sub-Saharan Africa','Congo, Rep.','2005 [YR2005]',363.1510),(55,'Sub-Saharan Africa','Cote d\'Ivoire','2005 [YR2005]',429.4450),(56,'Sub-Saharan Africa','Equatorial Guinea','2005 [YR2005]',320.4390),(57,'Sub-Saharan Africa','Eritrea','2005 [YR2005]',296.3700),(58,'Sub-Saharan Africa','Ethiopia','2005 [YR2005]',317.9140),(59,'Sub-Saharan Africa','Gabon','2005 [YR2005]',322.2810),(60,'Sub-Saharan Africa','Gambia, The','2005 [YR2005]',261.9220),(61,'Sub-Saharan Africa','Ghana','2005 [YR2005]',260.7330),(62,'Sub-Saharan Africa','Guinea','2005 [YR2005]',302.8440),(63,'Sub-Saharan Africa','Guinea-Bissau','2005 [YR2005]',285.2920),(64,'Sub-Saharan Africa','Kenya','2005 [YR2005]',403.0730),(65,'Sub-Saharan Africa','Lesotho','2005 [YR2005]',669.9040),(66,'Sub-Saharan Africa','Liberia','2005 [YR2005]',287.1140),(67,'Sub-Saharan Africa','Madagascar','2005 [YR2005]',240.9640),(68,'Sub-Saharan Africa','Malawi','2005 [YR2005]',499.1330),(69,'Sub-Saharan Africa','Mali','2005 [YR2005]',293.3280),(70,'Sub-Saharan Africa','Mauritania','2005 [YR2005]',197.2000),(71,'Sub-Saharan Africa','Mauritius','2005 [YR2005]',107.2940),(72,'Sub-Saharan Africa','Mozambique','2005 [YR2005]',410.2400),(73,'Sub-Saharan Africa','Namibia','2005 [YR2005]',381.0020),(74,'Sub-Saharan Africa','Niger','2005 [YR2005]',267.9390),(75,'Sub-Saharan Africa','Nigeria','2005 [YR2005]',380.8400);
/*!40000 ALTER TABLE `aa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ar`
--

DROP TABLE IF EXISTS `ar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Region` varchar(45) NOT NULL,
  `CountryName` varchar(45) NOT NULL,
  `YearC` varchar(45) NOT NULL,
  `MortalityRateOfFemale` decimal(12,4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=256 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ar`
--

LOCK TABLES `ar` WRITE;
/*!40000 ALTER TABLE `ar` DISABLE KEYS */;
INSERT INTO `ar` VALUES (1,'East Asia & Pacific','Australia','2005 [YR2005]',47.5940),(2,'East Asia & Pacific','Brunei Darussalam','2005 [YR2005]',79.7290),(3,'East Asia & Pacific','Cambodia','2005 [YR2005]',192.2450),(4,'East Asia & Pacific','China','2005 [YR2005]',85.2620),(5,'East Asia & Pacific','Fiji','2005 [YR2005]',162.2320),(6,'East Asia & Pacific','Guam','2005 [YR2005]',61.6590),(7,'East Asia & Pacific','Hong Kong SAR, China','2005 [YR2005]',41.0630),(8,'East Asia & Pacific','Indonesia','2005 [YR2005]',162.1200),(9,'East Asia & Pacific','Japan','2005 [YR2005]',44.9400),(10,'East Asia & Pacific','Kiribati','2005 [YR2005]',174.6140),(11,'East Asia & Pacific','Korea, Rep.','2005 [YR2005]',44.5940),(12,'East Asia & Pacific','Lao PDR','2005 [YR2005]',221.3230),(13,'East Asia & Pacific','Macao SAR, China','2005 [YR2005]',48.5130),(14,'East Asia & Pacific','Malaysia','2005 [YR2005]',91.1020),(15,'East Asia & Pacific','Micronesia, Fed. Sts.','2005 [YR2005]',165.4490),(16,'East Asia & Pacific','Mongolia','2005 [YR2005]',174.3060),(17,'East Asia & Pacific','Myanmar','2005 [YR2005]',196.8890),(18,'East Asia & Pacific','New Caledonia','2005 [YR2005]',73.6870),(19,'East Asia & Pacific','New Zealand','2005 [YR2005]',59.5760),(20,'East Asia & Pacific','Papua New Guinea','2005 [YR2005]',265.4610),(21,'East Asia & Pacific','Philippines','2005 [YR2005]',157.6950),(22,'Europe & Central Asia','Albania','2005 [YR2005]',53.1450),(23,'Europe & Central Asia','Armenia','2005 [YR2005]',84.6420),(24,'Europe & Central Asia','Austria','2005 [YR2005]',55.0400),(25,'Europe & Central Asia','Azerbaijan','2005 [YR2005]',103.3720),(26,'Europe & Central Asia','Belarus','2005 [YR2005]',127.9840),(27,'Europe & Central Asia','Belgium','2005 [YR2005]',62.1950),(28,'Europe & Central Asia','Bosnia and Herzegovina','2005 [YR2005]',74.0580),(29,'Europe & Central Asia','Bulgaria','2005 [YR2005]',92.4110),(30,'Europe & Central Asia','Channel Islands','2005 [YR2005]',51.0990),(31,'Europe & Central Asia','Croatia','2005 [YR2005]',65.5000),(32,'Europe & Central Asia','Cyprus','2005 [YR2005]',43.2770),(33,'Europe & Central Asia','Czech Republic','2005 [YR2005]',69.6800),(34,'Europe & Central Asia','Denmark','2005 [YR2005]',69.2870),(35,'Europe & Central Asia','Estonia','2005 [YR2005]',99.8610),(36,'Europe & Central Asia','Finland','2005 [YR2005]',63.0510),(37,'Europe & Central Asia','France','2005 [YR2005]',56.7740),(38,'Europe & Central Asia','Georgia','2005 [YR2005]',70.7580),(39,'Europe & Central Asia','Germany','2005 [YR2005]',57.1970),(40,'Europe & Central Asia','Greece','2005 [YR2005]',46.2490),(41,'Europe & Central Asia','Hungary','2005 [YR2005]',107.4440),(42,'Europe & Central Asia','Iceland','2005 [YR2005]',48.7210),(43,'Europe & Central Asia','Ireland','2005 [YR2005]',56.8320),(44,'Europe & Central Asia','Italy','2005 [YR2005]',44.0790),(45,'Europe & Central Asia','Kazakhstan','2005 [YR2005]',159.4590),(46,'Europe & Central Asia','Kyrgyz Republic','2005 [YR2005]',143.7310),(47,'Europe & Central Asia','Latvia','2005 [YR2005]',117.4250),(48,'Europe & Central Asia','Lithuania','2005 [YR2005]',112.7050),(49,'Europe & Central Asia','Luxembourg','2005 [YR2005]',56.4940),(50,'Europe & Central Asia','Macedonia, FYR','2005 [YR2005]',79.2120),(51,'Europe & Central Asia','Moldova','2005 [YR2005]',151.0160),(52,'Europe & Central Asia','Montenegro','2005 [YR2005]',94.4780),(53,'Europe & Central Asia','Netherlands','2005 [YR2005]',61.2920),(54,'Europe & Central Asia','Norway','2005 [YR2005]',56.0130),(55,'Europe & Central Asia','Poland','2005 [YR2005]',79.7970),(56,'Europe & Central Asia','Spain','2005 [YR2005]',44.3510),(57,'Europe & Central Asia','Switzerland','2005 [YR2005]',46.1920),(58,'Europe & Central Asia','United Kingdom','2005 [YR2005]',61.5710),(59,'Latin America & Caribbean','Antigua and Barbuda','2005 [YR2005]',122.3900),(60,'Latin America & Caribbean','Argentina','2005 [YR2005]',85.9520),(61,'Latin America & Caribbean','Aruba','2005 [YR2005]',82.3210),(62,'Latin America & Caribbean','Bahamas, The','2005 [YR2005]',134.9700),(63,'Latin America & Caribbean','Barbados','2005 [YR2005]',89.5680),(64,'Latin America & Caribbean','Belize','2005 [YR2005]',141.8020),(65,'Latin America & Caribbean','Bolivia','2005 [YR2005]',187.6020),(66,'Latin America & Caribbean','Brazil','2005 [YR2005]',111.3240),(67,'Latin America & Caribbean','Chile','2005 [YR2005]',57.5030),(68,'Latin America & Caribbean','Colombia','2005 [YR2005]',101.9970),(69,'Latin America & Caribbean','Costa Rica','2005 [YR2005]',67.6530),(70,'Latin America & Caribbean','Cuba','2005 [YR2005]',80.6070),(71,'Latin America & Caribbean','Curacao','2005 [YR2005]',77.3350),(72,'Latin America & Caribbean','Dominican Republic','2005 [YR2005]',134.0460),(73,'Latin America & Caribbean','Ecuador','2005 [YR2005]',103.5370),(74,'Latin America & Caribbean','Grenada','2005 [YR2005]',118.7420),(75,'Latin America & Caribbean','Guatemala','2005 [YR2005]',140.7920),(76,'Latin America & Caribbean','Guyana','2005 [YR2005]',175.9600),(77,'Latin America & Caribbean','Haiti','2005 [YR2005]',255.9520),(78,'Latin America & Caribbean','Honduras','2005 [YR2005]',135.2320),(79,'Latin America & Caribbean','Jamaica','2005 [YR2005]',115.3300),(80,'Latin America & Caribbean','Mexico','2005 [YR2005]',88.8190),(81,'Latin America & Caribbean','Nicaragua','2005 [YR2005]',129.3070),(82,'Latin America & Caribbean','Panama','2005 [YR2005]',87.6600),(83,'Latin America & Caribbean','Peru','2005 [YR2005]',109.7820),(84,'Latin America & Caribbean','Puerto Rico','2005 [YR2005]',68.8950),(85,'Latin America & Caribbean','St. Lucia','2005 [YR2005]',131.4440),(86,'Middle East & North Africa','Algeria','2005 [YR2005]',112.4570),(87,'Middle East & North Africa','Bahrain','2005 [YR2005]',69.3260),(88,'Middle East & North Africa','Djibouti','2005 [YR2005]',281.4010),(89,'Middle East & North Africa','Egypt, Arab Rep.','2005 [YR2005]',131.0890),(90,'Middle East & North Africa','Iran, Islamic Rep.','2005 [YR2005]',102.0640),(91,'Middle East & North Africa','Iraq','2005 [YR2005]',135.9900),(92,'Middle East & North Africa','Israel','2005 [YR2005]',49.5560),(93,'Middle East & North Africa','Jordan','2005 [YR2005]',105.4290),(94,'Middle East & North Africa','Kuwait','2005 [YR2005]',65.4670),(95,'Middle East & North Africa','Lebanon','2005 [YR2005]',67.0940),(96,'Middle East & North Africa','Libya','2005 [YR2005]',107.2450),(97,'Middle East & North Africa','Malta','2005 [YR2005]',48.4340),(98,'Middle East & North Africa','Morocco','2005 [YR2005]',117.7400),(99,'Middle East & North Africa','Oman','2005 [YR2005]',86.4780),(100,'Middle East & North Africa','United Arab Emirates','2005 [YR2005]',70.5410),(101,'North America','Canada','2005 [YR2005]',57.0910),(102,'South Asia','Afghanistan','2005 [YR2005]',273.6540),(103,'South Asia','Bangladesh','2005 [YR2005]',140.1370),(104,'South Asia','Bhutan','2005 [YR2005]',256.8930),(105,'South Asia','India','2005 [YR2005]',178.5140),(106,'South Asia','Maldives','2005 [YR2005]',81.7320),(107,'South Asia','Nepal','2005 [YR2005]',184.1280),(108,'South Asia','Pakistan','2005 [YR2005]',166.0060),(109,'South Asia','Sri Lanka','2005 [YR2005]',82.6110),(110,'Sub-Saharan Africa','Angola','2005 [YR2005]',358.5880),(111,'Sub-Saharan Africa','Benin','2005 [YR2005]',245.6800),(112,'Sub-Saharan Africa','Botswana','2005 [YR2005]',431.9960),(113,'Sub-Saharan Africa','Burkina Faso','2005 [YR2005]',285.9580),(114,'Sub-Saharan Africa','Burundi','2005 [YR2005]',321.0680),(115,'Sub-Saharan Africa','Cabo Verde','2005 [YR2005]',115.4090),(116,'Sub-Saharan Africa','Cameroon','2005 [YR2005]',388.4080),(117,'Sub-Saharan Africa','Central African Republic','2005 [YR2005]',477.4550),(118,'Sub-Saharan Africa','Comoros','2005 [YR2005]',235.6640),(119,'Sub-Saharan Africa','Congo, Rep.','2005 [YR2005]',363.1510),(120,'Sub-Saharan Africa','Cote d\'Ivoire','2005 [YR2005]',429.4450),(121,'Sub-Saharan Africa','Equatorial Guinea','2005 [YR2005]',320.4390),(122,'Sub-Saharan Africa','Eritrea','2005 [YR2005]',296.3700),(123,'Sub-Saharan Africa','Ethiopia','2005 [YR2005]',317.9140),(124,'Sub-Saharan Africa','Gabon','2005 [YR2005]',322.2810),(125,'Sub-Saharan Africa','Gambia, The','2005 [YR2005]',261.9220),(126,'Sub-Saharan Africa','Ghana','2005 [YR2005]',260.7330),(127,'Sub-Saharan Africa','Guinea','2005 [YR2005]',302.8440),(128,'Sub-Saharan Africa','Guinea-Bissau','2005 [YR2005]',285.2920),(129,'Sub-Saharan Africa','Kenya','2005 [YR2005]',403.0730),(130,'Sub-Saharan Africa','Lesotho','2005 [YR2005]',669.9040),(131,'Sub-Saharan Africa','Liberia','2005 [YR2005]',287.1140),(132,'Sub-Saharan Africa','Madagascar','2005 [YR2005]',240.9640),(133,'Sub-Saharan Africa','Malawi','2005 [YR2005]',499.1330),(134,'Sub-Saharan Africa','Mali','2005 [YR2005]',293.3280),(135,'Sub-Saharan Africa','Mauritania','2005 [YR2005]',197.2000),(136,'Sub-Saharan Africa','Mauritius','2005 [YR2005]',107.2940),(137,'Sub-Saharan Africa','Mozambique','2005 [YR2005]',410.2400),(138,'Sub-Saharan Africa','Namibia','2005 [YR2005]',381.0020),(139,'Sub-Saharan Africa','Niger','2005 [YR2005]',267.9390),(140,'Sub-Saharan Africa','Nigeria','2005 [YR2005]',380.8400);
/*!40000 ALTER TABLE `ar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'advandb_ar'
--

--
-- Dumping routines for database 'advandb_ar'
--

--
-- Current Database: `advandb_aa`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `advandb_aa` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `advandb_aa`;

--
-- Table structure for table `aa`
--

DROP TABLE IF EXISTS `aa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Region` varchar(45) NOT NULL,
  `CountryName` varchar(45) NOT NULL,
  `YearC` varchar(45) NOT NULL,
  `MortalityRateOfFemale` decimal(12,4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aa`
--

LOCK TABLES `aa` WRITE;
/*!40000 ALTER TABLE `aa` DISABLE KEYS */;
INSERT INTO `aa` VALUES (1,'East Asia & Pacific','Australia','2005 [YR2005]',47.5940),(2,'East Asia & Pacific','Brunei Darussalam','2005 [YR2005]',79.7290),(3,'East Asia & Pacific','Cambodia','2005 [YR2005]',192.2450),(4,'East Asia & Pacific','China','2005 [YR2005]',85.2620),(5,'East Asia & Pacific','Fiji','2005 [YR2005]',162.2320),(6,'East Asia & Pacific','Guam','2005 [YR2005]',61.6590),(7,'East Asia & Pacific','Hong Kong SAR, China','2005 [YR2005]',41.0630),(8,'East Asia & Pacific','Indonesia','2005 [YR2005]',162.1200),(9,'East Asia & Pacific','Japan','2005 [YR2005]',44.9400),(10,'East Asia & Pacific','Kiribati','2005 [YR2005]',174.6140),(11,'East Asia & Pacific','Korea, Rep.','2005 [YR2005]',44.5940),(12,'East Asia & Pacific','Lao PDR','2005 [YR2005]',221.3230),(13,'East Asia & Pacific','Macao SAR, China','2005 [YR2005]',48.5130),(14,'East Asia & Pacific','Malaysia','2005 [YR2005]',91.1020),(15,'East Asia & Pacific','Micronesia, Fed. Sts.','2005 [YR2005]',165.4490),(16,'East Asia & Pacific','Mongolia','2005 [YR2005]',174.3060),(17,'East Asia & Pacific','Myanmar','2005 [YR2005]',196.8890),(18,'East Asia & Pacific','New Caledonia','2005 [YR2005]',73.6870),(19,'East Asia & Pacific','New Zealand','2005 [YR2005]',59.5760),(20,'East Asia & Pacific','Papua New Guinea','2005 [YR2005]',265.4610),(21,'East Asia & Pacific','Philippines','2005 [YR2005]',157.6950),(22,'Middle East & North Africa','Algeria','2005 [YR2005]',112.4570),(23,'Middle East & North Africa','Bahrain','2005 [YR2005]',69.3260),(24,'Middle East & North Africa','Djibouti','2005 [YR2005]',281.4010),(25,'Middle East & North Africa','Egypt, Arab Rep.','2005 [YR2005]',131.0890),(26,'Middle East & North Africa','Iran, Islamic Rep.','2005 [YR2005]',102.0640),(27,'Middle East & North Africa','Iraq','2005 [YR2005]',135.9900),(28,'Middle East & North Africa','Israel','2005 [YR2005]',49.5560),(29,'Middle East & North Africa','Jordan','2005 [YR2005]',105.4290),(30,'Middle East & North Africa','Kuwait','2005 [YR2005]',65.4670),(31,'Middle East & North Africa','Lebanon','2005 [YR2005]',67.0940),(32,'Middle East & North Africa','Libya','2005 [YR2005]',107.2450),(33,'Middle East & North Africa','Malta','2005 [YR2005]',48.4340),(34,'Middle East & North Africa','Morocco','2005 [YR2005]',117.7400),(35,'Middle East & North Africa','Oman','2005 [YR2005]',86.4780),(36,'Middle East & North Africa','United Arab Emirates','2005 [YR2005]',70.5410),(37,'South Asia','Afghanistan','2005 [YR2005]',273.6540),(38,'South Asia','Bangladesh','2005 [YR2005]',140.1370),(39,'South Asia','Bhutan','2005 [YR2005]',256.8930),(40,'South Asia','India','2005 [YR2005]',178.5140),(41,'South Asia','Maldives','2005 [YR2005]',81.7320),(42,'South Asia','Nepal','2005 [YR2005]',184.1280),(43,'South Asia','Pakistan','2005 [YR2005]',166.0060),(44,'South Asia','Sri Lanka','2005 [YR2005]',82.6110),(45,'Sub-Saharan Africa','Angola','2005 [YR2005]',358.5880),(46,'Sub-Saharan Africa','Benin','2005 [YR2005]',245.6800),(47,'Sub-Saharan Africa','Botswana','2005 [YR2005]',431.9960),(48,'Sub-Saharan Africa','Burkina Faso','2005 [YR2005]',285.9580),(49,'Sub-Saharan Africa','Burundi','2005 [YR2005]',321.0680),(50,'Sub-Saharan Africa','Cabo Verde','2005 [YR2005]',115.4090),(51,'Sub-Saharan Africa','Cameroon','2005 [YR2005]',388.4080),(52,'Sub-Saharan Africa','Central African Republic','2005 [YR2005]',477.4550),(53,'Sub-Saharan Africa','Comoros','2005 [YR2005]',235.6640),(54,'Sub-Saharan Africa','Congo, Rep.','2005 [YR2005]',363.1510),(55,'Sub-Saharan Africa','Cote d\'Ivoire','2005 [YR2005]',429.4450),(56,'Sub-Saharan Africa','Equatorial Guinea','2005 [YR2005]',320.4390),(57,'Sub-Saharan Africa','Eritrea','2005 [YR2005]',296.3700),(58,'Sub-Saharan Africa','Ethiopia','2005 [YR2005]',317.9140),(59,'Sub-Saharan Africa','Gabon','2005 [YR2005]',322.2810),(60,'Sub-Saharan Africa','Gambia, The','2005 [YR2005]',261.9220),(61,'Sub-Saharan Africa','Ghana','2005 [YR2005]',260.7330),(62,'Sub-Saharan Africa','Guinea','2005 [YR2005]',302.8440),(63,'Sub-Saharan Africa','Guinea-Bissau','2005 [YR2005]',285.2920),(64,'Sub-Saharan Africa','Kenya','2005 [YR2005]',403.0730),(65,'Sub-Saharan Africa','Lesotho','2005 [YR2005]',669.9040),(66,'Sub-Saharan Africa','Liberia','2005 [YR2005]',287.1140),(67,'Sub-Saharan Africa','Madagascar','2005 [YR2005]',240.9640),(68,'Sub-Saharan Africa','Malawi','2005 [YR2005]',499.1330),(69,'Sub-Saharan Africa','Mali','2005 [YR2005]',293.3280),(70,'Sub-Saharan Africa','Mauritania','2005 [YR2005]',197.2000),(71,'Sub-Saharan Africa','Mauritius','2005 [YR2005]',107.2940),(72,'Sub-Saharan Africa','Mozambique','2005 [YR2005]',410.2400),(73,'Sub-Saharan Africa','Namibia','2005 [YR2005]',381.0020),(74,'Sub-Saharan Africa','Niger','2005 [YR2005]',267.9390),(75,'Sub-Saharan Africa','Nigeria','2005 [YR2005]',380.8400);
/*!40000 ALTER TABLE `aa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ea`
--

DROP TABLE IF EXISTS `ea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Region` varchar(45) NOT NULL,
  `CountryName` varchar(45) NOT NULL,
  `YearC` varchar(45) NOT NULL,
  `MortalityRateOfFemale` decimal(12,4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ea`
--

LOCK TABLES `ea` WRITE;
/*!40000 ALTER TABLE `ea` DISABLE KEYS */;
INSERT INTO `ea` VALUES (1,'Europe & Central Asia','Albania','2005 [YR2005]',53.1450),(2,'Europe & Central Asia','Armenia','2005 [YR2005]',84.6420),(3,'Europe & Central Asia','Austria','2005 [YR2005]',55.0400),(4,'Europe & Central Asia','Azerbaijan','2005 [YR2005]',103.3720),(5,'Europe & Central Asia','Belarus','2005 [YR2005]',127.9840),(6,'Europe & Central Asia','Belgium','2005 [YR2005]',62.1950),(7,'Europe & Central Asia','Bosnia and Herzegovina','2005 [YR2005]',74.0580),(8,'Europe & Central Asia','Bulgaria','2005 [YR2005]',92.4110),(9,'Europe & Central Asia','Channel Islands','2005 [YR2005]',51.0990),(10,'Europe & Central Asia','Croatia','2005 [YR2005]',65.5000),(11,'Europe & Central Asia','Cyprus','2005 [YR2005]',43.2770),(12,'Europe & Central Asia','Czech Republic','2005 [YR2005]',69.6800),(13,'Europe & Central Asia','Denmark','2005 [YR2005]',69.2870),(14,'Europe & Central Asia','Estonia','2005 [YR2005]',99.8610),(15,'Europe & Central Asia','Finland','2005 [YR2005]',63.0510),(16,'Europe & Central Asia','France','2005 [YR2005]',56.7740),(17,'Europe & Central Asia','Georgia','2005 [YR2005]',70.7580),(18,'Europe & Central Asia','Germany','2005 [YR2005]',57.1970),(19,'Europe & Central Asia','Greece','2005 [YR2005]',46.2490),(20,'Europe & Central Asia','Hungary','2005 [YR2005]',107.4440),(21,'Europe & Central Asia','Iceland','2005 [YR2005]',48.7210),(22,'Europe & Central Asia','Ireland','2005 [YR2005]',56.8320),(23,'Europe & Central Asia','Italy','2005 [YR2005]',44.0790),(24,'Europe & Central Asia','Kazakhstan','2005 [YR2005]',159.4590),(25,'Europe & Central Asia','Kyrgyz Republic','2005 [YR2005]',143.7310),(26,'Europe & Central Asia','Latvia','2005 [YR2005]',117.4250),(27,'Europe & Central Asia','Lithuania','2005 [YR2005]',112.7050),(28,'Europe & Central Asia','Luxembourg','2005 [YR2005]',56.4940),(29,'Europe & Central Asia','Macedonia, FYR','2005 [YR2005]',79.2120),(30,'Europe & Central Asia','Moldova','2005 [YR2005]',151.0160),(31,'Europe & Central Asia','Montenegro','2005 [YR2005]',94.4780),(32,'Europe & Central Asia','Netherlands','2005 [YR2005]',61.2920),(33,'Europe & Central Asia','Norway','2005 [YR2005]',56.0130),(34,'Europe & Central Asia','Poland','2005 [YR2005]',79.7970),(35,'Europe & Central Asia','Spain','2005 [YR2005]',44.3510),(36,'Europe & Central Asia','Switzerland','2005 [YR2005]',46.1920),(37,'Europe & Central Asia','United Kingdom','2005 [YR2005]',61.5710),(38,'Latin America & Caribbean','Antigua and Barbuda','2005 [YR2005]',122.3900),(39,'Latin America & Caribbean','Argentina','2005 [YR2005]',85.9520),(40,'Latin America & Caribbean','Aruba','2005 [YR2005]',82.3210),(41,'Latin America & Caribbean','Bahamas, The','2005 [YR2005]',134.9700),(42,'Latin America & Caribbean','Barbados','2005 [YR2005]',89.5680),(43,'Latin America & Caribbean','Belize','2005 [YR2005]',141.8020),(44,'Latin America & Caribbean','Bolivia','2005 [YR2005]',187.6020),(45,'Latin America & Caribbean','Brazil','2005 [YR2005]',111.3240),(46,'Latin America & Caribbean','Chile','2005 [YR2005]',57.5030),(47,'Latin America & Caribbean','Colombia','2005 [YR2005]',101.9970),(48,'Latin America & Caribbean','Costa Rica','2005 [YR2005]',67.6530),(49,'Latin America & Caribbean','Cuba','2005 [YR2005]',80.6070),(50,'Latin America & Caribbean','Curacao','2005 [YR2005]',77.3350),(51,'Latin America & Caribbean','Dominican Republic','2005 [YR2005]',134.0460),(52,'Latin America & Caribbean','Ecuador','2005 [YR2005]',103.5370),(53,'Latin America & Caribbean','Grenada','2005 [YR2005]',118.7420),(54,'Latin America & Caribbean','Guatemala','2005 [YR2005]',140.7920),(55,'Latin America & Caribbean','Guyana','2005 [YR2005]',175.9600),(56,'Latin America & Caribbean','Haiti','2005 [YR2005]',255.9520),(57,'Latin America & Caribbean','Honduras','2005 [YR2005]',135.2320),(58,'Latin America & Caribbean','Jamaica','2005 [YR2005]',115.3300),(59,'Latin America & Caribbean','Mexico','2005 [YR2005]',88.8190),(60,'Latin America & Caribbean','Nicaragua','2005 [YR2005]',129.3070),(61,'Latin America & Caribbean','Panama','2005 [YR2005]',87.6600),(62,'Latin America & Caribbean','Peru','2005 [YR2005]',109.7820),(63,'Latin America & Caribbean','Puerto Rico','2005 [YR2005]',68.8950),(64,'Latin America & Caribbean','St. Lucia','2005 [YR2005]',131.4440),(65,'North America','Canada','2005 [YR2005]',57.0910);
/*!40000 ALTER TABLE `ea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'advandb_aa'
--

--
-- Dumping routines for database 'advandb_aa'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-09  2:04:48
