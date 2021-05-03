/*
 Navicat Premium Data Transfer

 Source Server         : MySQL5.7
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3306
 Source Schema         : sugw

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 24/03/2021 20:56:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'root', '6e14552f3ebb1701f95f662ece84cf83', 'admin');

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major`  (
  `majorId` int(3) NOT NULL,
  `majorName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`majorId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES (1, '计算机科学与技术');
INSERT INTO `major` VALUES (2, '信息安全');
INSERT INTO `major` VALUES (3, '物联网');
INSERT INTO `major` VALUES (4, '数据科学与大数据技术');
INSERT INTO `major` VALUES (5, '计算机科学与技术(中外合作)');

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization`  (
  `orgId` int(3) NOT NULL,
  `orgName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `branchName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`orgId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of organization
-- ----------------------------
INSERT INTO `organization` VALUES (1, '团委', '组织部');
INSERT INTO `organization` VALUES (2, '团委', '宣传部');
INSERT INTO `organization` VALUES (3, '团委', '心协');
INSERT INTO `organization` VALUES (4, '团委', '青协');
INSERT INTO `organization` VALUES (5, '学生会', '办公室');
INSERT INTO `organization` VALUES (6, '学生会', '学习部');
INSERT INTO `organization` VALUES (7, '学生会', '宣传部');
INSERT INTO `organization` VALUES (8, '学生会', '文艺部');
INSERT INTO `organization` VALUES (9, '学生会', '体育部');
INSERT INTO `organization` VALUES (10, '学生会', '外联部');
INSERT INTO `organization` VALUES (11, '学生会', '自营会');
INSERT INTO `organization` VALUES (12, '科技协会', '科技协会');
INSERT INTO `organization` VALUES (13, '勤工俭学中心', '管理部');
INSERT INTO `organization` VALUES (14, '勤工俭学中心', '活动部');
INSERT INTO `organization` VALUES (15, '勤工俭学中心', '助贷部');
INSERT INTO `organization` VALUES (16, '勤工俭学中心', '外联部');
INSERT INTO `organization` VALUES (17, '新闻中心', '摄影协会');
INSERT INTO `organization` VALUES (18, '新闻中心', '新媒体部');
INSERT INTO `organization` VALUES (19, '新闻中心', '记者团');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stdId` int(8) NOT NULL,
  `stdName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `major` int(2) NOT NULL,
  `classNum` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stdQQ` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stdPhone` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `willFirst` int(2) NOT NULL,
  `reasonFirst` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `willSecond` int(2) NULL DEFAULT NULL,
  `reasonSecond` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `isDispensing` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stdId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (12345678, '测试者', 1, '二班', '12345678910', '18600000000', 12, '非常想加入', 12, '我来啦', 'false');
INSERT INTO `student` VALUES (20200000, '测试者', 1, '二班', '1234567891', '18600000000', 12, '非常想加入', 12, '我来啦', 'false');
INSERT INTO `student` VALUES (20200001, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'a', 12, '1', 'false');
INSERT INTO `student` VALUES (20200002, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'b', 12, '2', 'true');
INSERT INTO `student` VALUES (20200003, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'c', 12, '3', 'false');
INSERT INTO `student` VALUES (20200004, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'd', 12, '4', 'true');
INSERT INTO `student` VALUES (20200005, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'e', 12, '5', 'false');
INSERT INTO `student` VALUES (20200006, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'f', 12, '6', 'true');
INSERT INTO `student` VALUES (20200007, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'g', 12, '7', 'false');
INSERT INTO `student` VALUES (20200008, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'h', 12, '8', 'true');
INSERT INTO `student` VALUES (20200009, '测试者', 1, '二班', '12345678910', '18600000000', 6, 'i', 9, '9', 'false');
INSERT INTO `student` VALUES (20200010, '测试者', 1, '二班', '12345678910', '18600000000', 12, 'k', 12, '10', 'false');
INSERT INTO `student` VALUES (20200020, '测试者', 1, '二班', '1234567891', '18600000000', 12, '非常想加入', 12, '我来啦', 'false');
INSERT INTO `student` VALUES (202000008, '测试者', 1, '二班', '12345678910', '18600000000', 12, '非常想加入', 12, '我来啦', 'false');

SET FOREIGN_KEY_CHECKS = 1;
