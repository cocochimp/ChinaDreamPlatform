/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : localhost:3306
 Source Schema         : chinesedream

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : 65001

 Date: 19/12/2022 23:33:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'zhangsan', '123');
INSERT INTO `tb_user` VALUES (2, 'lisi', '456');
INSERT INTO `tb_user` VALUES (3, '小东', '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(19) NOT NULL COMMENT '用户id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `pwd` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `perms` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (11, '小明', '123', 'user:add');
INSERT INTO `user` VALUES (111, '小王', '123', 'user:update');
INSERT INTO `user` VALUES (112, '小美', '123', '0');

-- ----------------------------
-- Table structure for userchinese
-- ----------------------------
DROP TABLE IF EXISTS `userchinese`;
CREATE TABLE `userchinese`  (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `password` varchar(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 131 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userchinese
-- ----------------------------
INSERT INTO `userchinese` VALUES (11, '小明', '123', 'https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/专栏444.png');
INSERT INTO `userchinese` VALUES (111, '小王', '1234', 'https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/专栏444.png');
INSERT INTO `userchinese` VALUES (112, '小美', '12345', 'https://cocochimp-markdown-img.oss-cn-beijing.aliyuncs.com/专栏444.png');
INSERT INTO `userchinese` VALUES (130, '小明', '111', NULL);

SET FOREIGN_KEY_CHECKS = 1;
