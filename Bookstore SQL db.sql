/*
SQLyog Ultimate v8.55 
MySQL - 5.2.3-falcon-alpha-community-nt : Database - shi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shi` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `shi`;

/*Table structure for table `buy` */

DROP TABLE IF EXISTS `buy`;

CREATE TABLE `buy` (
  `BOOKID` varchar(11) NOT NULL,
  `BOOKNAME` varchar(40) DEFAULT NULL,
  `AUTHUR` varchar(30) DEFAULT NULL,
  `EDITION` varchar(11) DEFAULT NULL,
  `DATEOFPURCHASE` date DEFAULT NULL,
  `GENRE` varchar(15) DEFAULT NULL,
  `QUANTITY` int(11) DEFAULT NULL,
  `PRICE` int(11) DEFAULT NULL,
  PRIMARY KEY (`BOOKID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `buy` */

insert  into `buy`(`BOOKID`,`BOOKNAME`,`AUTHUR`,`EDITION`,`DATEOFPURCHASE`,`GENRE`,`QUANTITY`,`PRICE`) values ('100','mathh','naothingkhong','27','2000-12-10','FICTION',63,275),('101','ghjjk','jhghyjg','6767','2000-03-18','CLASSICS',18,300),('102','The Picture Of Dorian Gray','Oscar Wilde','11','2021-12-13','CLASSICS',2,2699),('103','Little Women','Alcott','10','2021-12-13','CLASSICS',25,500),('104','Les Miserables','John Milton','11','2021-12-13','CLASSICS',6,2299),('105','chemistry','romio','9','2021-03-17','CLASSICS',41,250),('106','THOR','ABRIMAHA ','7','2022-01-11','COMIC BOOK',1,150),('107','Life Of Pi','Yan Martel','6','2022-01-13','FICTION',33,500),('108','scycho','milanjo','6','2022-01-15','CLASSICS',13,450);

/*Table structure for table `cancel` */

DROP TABLE IF EXISTS `cancel`;

CREATE TABLE `cancel` (
  `ORDERID` int(11) DEFAULT NULL,
  `CDATE` date DEFAULT NULL,
  `RAMOUNT` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cancel` */

insert  into `cancel`(`ORDERID`,`CDATE`,`RAMOUNT`) values (1,'2021-12-23',900),(5,'2021-12-23',7500),(1,'2021-12-23',900),(1,'2021-12-23',800),(1,'2021-12-23',800),(1,'2021-12-23',800),(1,'2021-12-23',600),(1,'2021-12-23',600),(1,'2021-12-23',600),(2,'2021-12-23',1000),(1,'2021-12-25',900);

/*Table structure for table `delivery` */

DROP TABLE IF EXISTS `delivery`;

CREATE TABLE `delivery` (
  `ORDERID` int(11) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `pay` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `delivery` */

insert  into `delivery`(`ORDERID`,`DATE`,`pay`) values (1,'2021-12-23',NULL),(2,'2021-12-26',NULL),(2,'2021-12-26',NULL),(1,'2021-12-26',NULL);

/*Table structure for table `odr` */

DROP TABLE IF EXISTS `odr`;

CREATE TABLE `odr` (
  `ORDERID` int(11) NOT NULL AUTO_INCREMENT,
  `BOOKID` int(11) DEFAULT NULL,
  `BOOKNAME` char(30) DEFAULT NULL,
  `CUSTOMERNAME` char(20) DEFAULT NULL,
  `ADDRESS` char(30) DEFAULT NULL,
  `DISTRICT` varchar(30) DEFAULT NULL,
  `PINCODE` varchar(8) DEFAULT NULL,
  `MOBILE` varchar(10) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `QUANTITY` int(11) DEFAULT NULL,
  `PRICE` int(11) DEFAULT NULL,
  `DISCOUNT` int(11) DEFAULT NULL,
  `BALANCE` int(11) DEFAULT NULL,
  `PAYMENT` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ORDERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `odr` */

insert  into `odr`(`ORDERID`,`BOOKID`,`BOOKNAME`,`CUSTOMERNAME`,`ADDRESS`,`DISTRICT`,`PINCODE`,`MOBILE`,`DATE`,`QUANTITY`,`PRICE`,`DISCOUNT`,`BALANCE`,`PAYMENT`) values (1,100,'mathh','boby','phaknung','ENTER THE DISTRICT','795010','7085199532','2021-12-26',1,275,5,270,'CONFIRMED'),(2,101,'ghjjk','sunil','phaknung','IMPHAL EAST','795010','7085199532','2021-12-19',4,1200,100,1100,'CONFIRMED'),(3,103,'Little Women','PRISAN','KHURAIi','IMPHAL EAST','795001','7085199532','2021-12-19',5,1000,50,45667,'CONFIRMED'),(4,100,'mathh','albert','THOUBAL','THOUBAL','795010','7085199532','2021-12-19',4,1000,50,950,'CONFIRMED'),(5,102,'The Picture Of Dorian Gray','rohit','pamgei','IMPHAL EAST','795001','3456776578','2021-12-18',3,8097,97,8000,'CONFIRMED'),(6,100,'mathh','OMEGA','CHALOU','IMPHAL EAST','795010','8119967793','2021-12-19',10,2750,50,2700,'CONFIRMED'),(7,102,'The Picture Of Dorian Gray','rohit','PANGEI','IMPHAL EAST','795001','3456776578','2021-12-19',3,8097,97,8000,'PENDING..'),(8,100,'mathh','DEVAJIT','CHALLOU','IMPHAL EAST','795010','7009981326','2021-12-19',4,1100,50,1050,'CONFIRMED'),(9,100,'mathh','fghj','fghj','ENTER THE STATE','5678','56789','2021-12-19',2,550,50,500,'PENDING...'),(10,100,'mathh','fghj','fghj','ENTER THE STATE','5678','56789','2021-12-19',2,550,50,500,''),(11,100,'mathh','fghj','fghj','ENTER THE STATE','5678','56789','2021-12-19',2,550,50,500,''),(12,105,'chemistry','HASHIRAMA','JAPAN','IMPHAL EAST','700510','9862678951','2021-12-19',10,2500,100,2400,'CONFIRMED'),(13,104,'Les Miserables','NARUTO','JAPAN','JIRIBAM','760991','7009864321','2021-12-19',3,6897,97,6800,'PENDING...'),(14,103,'Little Women','ferdinand','khairen','CHANDEL','56789','4567898765','2021-12-24',3,1500,100,1400,'PENDING...'),(15,102,'The Picture Of Dorian Gray','','','ENTER THE DISTRICT','','','2022-01-11',1,2699,0,2699,''),(16,105,'chemistry','rtyjg','gghhhhh','ENTER THE DISTRICT','677878','4566776555','2022-01-11',2,500,0,500,'PENDING...');

/*Table structure for table `sell` */

DROP TABLE IF EXISTS `sell`;

CREATE TABLE `sell` (
  `SALEID` int(14) NOT NULL AUTO_INCREMENT,
  `BOOKID` int(11) DEFAULT NULL,
  `BOOKNAME` varchar(40) DEFAULT NULL,
  `CUSTOMERNAME` char(40) DEFAULT NULL,
  `MOBILE` varchar(20) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `QUANTITY` float DEFAULT NULL,
  `PRICE` int(15) DEFAULT NULL,
  `DISCOUNT` int(15) DEFAULT NULL,
  `BALANCE` int(14) DEFAULT NULL,
  PRIMARY KEY (`SALEID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sell` */

insert  into `sell`(`SALEID`,`BOOKID`,`BOOKNAME`,`CUSTOMERNAME`,`MOBILE`,`DATE`,`QUANTITY`,`PRICE`,`DISCOUNT`,`BALANCE`) values (1,100,'mathh','roni','7950108576','2021-12-16',1,300,50,250),(2,102,'The Picture Of Dorian Gray','dorendo','456787766','2021-12-22',10,26990,1000,25990),(3,105,'chemistry','shashi','1234567890','2021-12-19',15,3750,50,3700),(4,106,'dw','etdfhgjk','7085199','2000-06-07',3,354678945,34567865,NULL),(5,105,'chemistry','shashi','1234567890','2021-12-19',15,3750,50,3700),(6,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(7,105,'chemistry','shashi','1234567890','2021-12-19',15,3750,50,3700),(8,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(9,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(10,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(11,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(12,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(13,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(14,101,'ghjjk','robert','5676435678','2021-12-19',2,600,50,550),(15,102,'The Picture Of Dorian Gray','dorendo','456787766','2021-12-22',10,26990,1000,25990),(16,103,'Little Women','','','2021-12-18',10,19990,0,19990),(17,102,'The Picture Of Dorian Gray','dorendo','456787766','2021-12-22',10,26990,1000,25990),(18,102,'The Picture Of Dorian Gray','dorendo','456787766','2021-12-22',10,26990,1000,25990),(19,104,'Les Miserables','dfgh','4567','2021-12-18',2,4598,400,4198),(20,100,'mathh','hhhhh','45678','2021-12-23',5,1375,50,1325),(21,100,'mathh','homen','456789876','2021-12-23',6,1650,150,1500),(22,105,'chemistry','jibon','567876567','2021-12-23',5,1250,50,1200),(23,101,'ghjjk','romen','45678876','2021-12-23',5,1500,0,1500),(24,104,'Les Miserables','fardinand','7085199532','2021-12-24',3,6897,197,6700),(25,104,'Les Miserables','donkey','7009854721','2021-12-24',1,2299,99,2200),(26,101,'ghjjk','','','2022-01-11',1,300,1,299),(27,102,'The Picture Of Dorian Gray','','','2022-01-11',1,2699,9,2690),(28,103,'Little Women','','','2022-01-11',1,500,0,500),(29,102,'The Picture Of Dorian Gray','','','2022-01-11',2,5398,0,5398),(30,105,'chemistry','','','2022-01-11',1,250,0,250),(31,103,'Little Women','gghhh','','2022-01-11',1,500,0,500),(32,105,'chemistry','yhh','7788888888','2022-01-11',1,250,0,250),(33,102,'The Picture Of Dorian Gray','erttt','456677','2022-01-11',1,2699,0,2699);

/*Table structure for table `staf` */

DROP TABLE IF EXISTS `staf`;

CREATE TABLE `staf` (
  `STAFFID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(40) DEFAULT NULL,
  `MOBILE` varchar(10) DEFAULT NULL,
  `ADDRESS` varchar(40) DEFAULT NULL,
  `MOTHERNAME` varchar(40) DEFAULT NULL,
  `FATHERNAME` varchar(40) DEFAULT NULL,
  `JOINDATE` date DEFAULT NULL,
  `SEX` varchar(10) DEFAULT NULL,
  `WORKINGHOUR` varchar(9) DEFAULT NULL,
  `SHIFTMODE` varchar(40) DEFAULT NULL,
  `PASSWORD` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`STAFFID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `staf` */

insert  into `staf`(`STAFFID`,`NAME`,`MOBILE`,`ADDRESS`,`MOTHERNAME`,`FATHERNAME`,`JOINDATE`,`SEX`,`WORKINGHOUR`,`SHIFTMODE`,`PASSWORD`) values (1,'homura','7085199532','phaknung','pramo','mani','2021-04-23','MALE','4 30','morning',NULL),(2,'tomba','6009865732','khurai','tombi','bombon','2021-12-19','MALE','7 40','evening',NULL),(3,'jason','8967543753','manipur','nonee','monotonous','2021-12-20','FEMALE','7:30','morning',NULL),(4,'HAMURA ENASHAKI','7008696543','SAWOMBUNG','MOTHER ENASHAKI','FATHER ENASHAKI','2021-12-21','FEMALE','7:30','MORNING','1234'),(5,'FGHJJNHBG','567887656','DFGHJKJHG','DFGHJHGF','DFGHJKJHG','2021-12-21','MALE','6:70','MORNING','123456'),(6,'ghj','4567876','fghjkjh','rfghjkjhg','fghjkuytrtyu','2021-12-21','MALE','6:70','mormimg','1234'),(7,'MORGAN','6098765432','PHAKNUNG','MOTHER','FATHER','2021-12-21','MALE','8:90','MORNING','SHASHI'),(8,'MORGAN','8769056901','PHAKNUNG','MOTHER','FATHER','2021-12-21','MALE','6:60','MORNING','MOR'),(9,'NOACHA','8907654110','SAWOMBUNG','MOTHER','FATHER','2021-12-21','MALE','7:40','AFTERNOON','NOA'),(10,'ranchandra','7416238421','konoha','monoma','monopa','2021-12-22','MALE','5','Morning','1234');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
