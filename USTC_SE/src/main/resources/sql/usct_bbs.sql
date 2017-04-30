/*
SQLyog Trial v12.3.3 (64 bit)
MySQL - 5.7.17-log : Database - ustc_bbs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ustc_bbs` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `ustc_bbs`;

/*Table structure for table `t_comment` */

DROP TABLE IF EXISTS `t_comment`;

CREATE TABLE `t_comment` (
  `commentID` int(11) NOT NULL AUTO_INCREMENT,
  `postID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `commentFloor` int(11) NOT NULL DEFAULT '1',
  `commentTime` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `commentContent` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`commentID`),
  KEY `FK_Post_Comment` (`postID`),
  KEY `FK_User_Commemt` (`userID`),
  CONSTRAINT `FK_Post_Comment` FOREIGN KEY (`postID`) REFERENCES `t_post` (`postID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_User_Commemt` FOREIGN KEY (`userID`) REFERENCES `t_user` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_comment` */

/*Table structure for table `t_message` */

DROP TABLE IF EXISTS `t_message`;

CREATE TABLE `t_message` (
  `messageID` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) NOT NULL,
  `messageSendName` int(11) NOT NULL,
  `messageTime` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `commentID` int(11) NOT NULL,
  `messageUnread` int(11) NOT NULL,
  PRIMARY KEY (`messageID`),
  KEY `FK_Comment_Message` (`commentID`),
  KEY `FK_User_Message` (`userID`),
  CONSTRAINT `FK_Comment_Message` FOREIGN KEY (`commentID`) REFERENCES `t_comment` (`commentID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_User_Message` FOREIGN KEY (`userID`) REFERENCES `t_user` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_message` */

/*Table structure for table `t_post` */

DROP TABLE IF EXISTS `t_post`;

CREATE TABLE `t_post` (
  `postID` int(11) NOT NULL AUTO_INCREMENT,
  `postTitle` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `postTime` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `postHits` int(11) NOT NULL DEFAULT '0',
  `postContent` text COLLATE utf8_unicode_ci,
  `postLabel` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userID` int(11) NOT NULL,
  PRIMARY KEY (`postID`),
  KEY `FK_User_Post` (`userID`),
  CONSTRAINT `FK_User_Post` FOREIGN KEY (`userID`) REFERENCES `t_user` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_post` */

/*Table structure for table `t_reply` */

DROP TABLE IF EXISTS `t_reply`;

CREATE TABLE `t_reply` (
  `replyID` int(11) NOT NULL AUTO_INCREMENT,
  `commentID` int(11) NOT NULL,
  `replySendName` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `replyReciveName` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `replyTime` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `replyContent` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`replyID`),
  KEY `FK_Comment_Reply` (`commentID`),
  CONSTRAINT `FK_Comment_Reply` FOREIGN KEY (`commentID`) REFERENCES `t_comment` (`commentID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_reply` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `userPassword` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `userEmail` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userGender` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userHeadPortrait` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `userBirth` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userMessageCount` int(11) DEFAULT '0',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
