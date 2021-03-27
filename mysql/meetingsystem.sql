/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : meetingsystem

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2021-03-27 14:41:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `chairman`
-- ----------------------------
DROP TABLE IF EXISTS `chairman`;
CREATE TABLE `chairman` (
  `id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of chairman
-- ----------------------------

-- ----------------------------
-- Table structure for `participants`
-- ----------------------------
DROP TABLE IF EXISTS `participants`;
CREATE TABLE `participants` (
  `id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of participants
-- ----------------------------

-- ----------------------------
-- Table structure for `secretary`
-- ----------------------------
DROP TABLE IF EXISTS `secretary`;
CREATE TABLE `secretary` (
  `id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of secretary
-- ----------------------------

-- ----------------------------
-- Table structure for `sub_chairman`
-- ----------------------------
DROP TABLE IF EXISTS `sub_chairman`;
CREATE TABLE `sub_chairman` (
  `id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sub_chairman
-- ----------------------------
