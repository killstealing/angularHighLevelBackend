/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : taskmgr

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-06-20 19:43:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article_t
-- ----------------------------
DROP TABLE IF EXISTS `article_t`;
CREATE TABLE `article_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_t
-- ----------------------------
INSERT INTO `article_t` VALUES ('1', 'Java Article 1', 'Java');
INSERT INTO `article_t` VALUES ('2', 'Java Article 2', 'Java');
INSERT INTO `article_t` VALUES ('3', 'Angular Article 1', 'Angular');
INSERT INTO `article_t` VALUES ('4', 'Angular Article 2', 'Angular');
INSERT INTO `article_t` VALUES ('5', 'Java Article 1', 'Favorite');
INSERT INTO `article_t` VALUES ('6', 'Angular Article 2', 'Favorite');

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `desc_t` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('3', '企业协作平台', '这是一个企业内部项目3', './../../../assets/img/covers/2.jpg');
INSERT INTO `project` VALUES ('10', '待办', '111', './../../../assets/img/covers/0.jpg');
INSERT INTO `project` VALUES ('23', 'update', '1231', './../../../assets/img/covers/0.jpg');

-- ----------------------------
-- Table structure for quote_t
-- ----------------------------
DROP TABLE IF EXISTS `quote_t`;
CREATE TABLE `quote_t` (
  `id` varchar(255) DEFAULT NULL,
  `cn` varchar(255) DEFAULT NULL,
  `en` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of quote_t
-- ----------------------------
INSERT INTO `quote_t` VALUES ('0', '我突然就觉得自己像个华丽的木偶,演尽了所有的悲欢离合,可是背上总是有无数闪亮的银色丝线,操纵我哪怕一举手一投足。', 'I suddenly feel myself like a doll,acting all kinds of joys and sorrows.There are lots of shining silvery thread on my back,controlling all my action.', '../../assets/img/quotes/0.jpg');
INSERT INTO `quote_t` VALUES ('1', '被击垮通常只是暂时的，但如果你放弃的话，就会使它成为永恒。（Marilyn vos Savant）', 'Being defeated is often a temporary condition. Giving up is what makes it permanent.', '../../assets/img/quotes/1.jpg');
INSERT INTO `quote_t` VALUES ('2', '不要只因一次挫败，就放弃你原来决心想达到的梦想。（莎士比亚）', 'Do not, for one repulse, forgo the purpose that you resolved to effect.', '../../assets/img/quotes/2.jpg');
INSERT INTO `quote_t` VALUES ('3', '想有发现就要实验，这项实验需要时间。—《神盾局特工》', 'Discovery requires experimentation, and this experiment will take time.', '../../assets/img/quotes/3.jpg');
INSERT INTO `quote_t` VALUES ('4', '这世界并不会在意你的自尊，这世界希望你在自我感觉良好之前先要有所成就。', 'The world won\'t care about your self-esteem. The world will expect you to accomplish something before you feel good about yourself.', '../../assets/img/quotes/4.jpg');
INSERT INTO `quote_t` VALUES ('5', '当你最终放开了过去，更好的事就会到来。', 'When you finally let go of the past, something better comes along.', '../../assets/img/quotes/5.jpg');
INSERT INTO `quote_t` VALUES ('6', '我们学着放开过去伤害我们的人和事，学着只向前看。因为生活本来就是一往直前的。', 'We learn to let go of things and people that hurt us in the past and just move on. For life is all about moving on.', '../../assets/img/quotes/6.jpg');
INSERT INTO `quote_t` VALUES ('7', '绝不要因为怕辛苦而拒绝一个想法、梦想或是目标，成功的路上难免伴随辛苦。（Bob Proctor）', 'Never reject an idea, dream or goal because it will be hard work. Success rarely comes without it.', '../../assets/img/quotes/7.jpg');
INSERT INTO `quote_t` VALUES ('8', '我们在人生中会作出许多选择，带着这些选择继续生活，才是人生中最难的一课。《妙笔生花》', 'We all make our choices in life. The hard thing to do is live with them.', '../../assets/img/quotes/8.jpg');
INSERT INTO `quote_t` VALUES ('9', '我总是对新的一天充满喜悦，这是一次新的尝试、一个新的开始，翘首以待，黎明之后或是惊喜。（约翰·博因顿·普里斯特利）', 'I have always been delighted at the prospect of a new day, a fresh try, one more start, with perhaps a bit of magic waiting somewhere behind the morning.', '../../assets/img/quotes/9.jpg');

-- ----------------------------
-- Table structure for task
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `desc_t` varchar(255) DEFAULT NULL,
  `completed` int(11) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `due_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `reminder` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `remark` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `owner_id` int(11) DEFAULT NULL,
  `task_list_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------
INSERT INTO `task` VALUES ('1', '任务一:去星巴克买杯咖啡', '任务一:去星巴克买杯咖啡', '-1', '3', '2018-04-08 09:02:16', '2018-04-08 09:02:16', null, '2018-04-08 09:02:16', '1', '1');
INSERT INTO `task` VALUES ('2', '任务二：完成老师布置的', '任务二：完成老师布置的作业', '-1', '2', '2018-04-09 20:57:03', '2018-04-09 20:57:03', null, '2018-04-09 20:57:03', '1', '1');
INSERT INTO `task` VALUES ('3', '任务三任务三任务三任务', '任务三任务三任务三任务三', '0', '1', '2018-04-09 21:02:48', '2018-04-09 21:02:48', null, '2018-04-09 21:02:48', '2', '2');
INSERT INTO `task` VALUES ('4', '任务四任务四任务四任务', '任务四任务四任务四任务四', '0', '3', '2018-04-09 21:31:57', '2018-04-09 21:31:57', null, '2018-04-09 21:31:57', '2', '2');
INSERT INTO `task` VALUES ('5', '任务五任务五任务五任务', '任务五任务五任务五任务五', '1', '1', '2018-04-09 21:31:58', '2018-04-09 21:31:58', null, '2018-04-09 21:31:58', '3', '3');
INSERT INTO `task` VALUES ('6', '任务六任务六任务六任务任务六任务六任务六任务', '任务六任务六任务六任务六', '1', '2', '2018-04-09 21:33:11', '2018-04-09 21:33:11', null, '2018-04-09 21:33:11', '3', '3');
INSERT INTO `task` VALUES ('7', '任务test', null, '-1', '1', '2018-04-08 09:02:16', '2018-04-08 09:02:16', null, null, '1', '1');
INSERT INTO `task` VALUES ('8', 'test', null, '-1', '1', '2018-04-12 00:00:00', '2018-04-19 00:00:00', null, null, '1', '1');
INSERT INTO `task` VALUES ('9', 'test1', null, '-1', '2', '2018-04-13 00:00:00', '2018-04-24 00:00:00', null, null, '4', '1');
INSERT INTO `task` VALUES ('10', 'test4', null, '-1', '1', '2018-04-11 00:00:00', '2018-04-25 00:00:00', null, null, '1', '1');
INSERT INTO `task` VALUES ('11', 'test5', null, '-1', '1', '2018-04-12 00:00:00', '2018-04-13 00:00:00', null, null, '1', '1');
INSERT INTO `task` VALUES ('12', 'test6', null, '-1', '1', '2018-04-10 00:00:00', '2018-04-12 00:00:00', null, null, '4', '1');
INSERT INTO `task` VALUES ('13', 'test7', null, '-1', '1', '2018-04-11 00:00:00', '2018-04-12 00:00:00', null, null, '1', '1');
INSERT INTO `task` VALUES ('14', 'test7', null, '-1', '1', '2018-04-11 00:00:00', '2018-04-12 00:00:00', null, null, '1', '1');
INSERT INTO `task` VALUES ('15', 'test7', null, '-1', '1', '2018-04-11 00:00:00', '2018-04-12 00:00:00', null, null, '1', '1');
INSERT INTO `task` VALUES ('16', 'test1', null, '-1', '1', '2018-04-10 00:00:00', '2018-04-27 00:00:00', null, null, '1', '8');
INSERT INTO `task` VALUES ('17', 'aaa', 'aaa', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '8');
INSERT INTO `task` VALUES ('18', 'aaa', 'aaa', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '2');
INSERT INTO `task` VALUES ('19', 'dddfdasf', 'dddfdasf', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '3');
INSERT INTO `task` VALUES ('20', 'aa11', 'aa11', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '8');
INSERT INTO `task` VALUES ('21', '12321321', '12321321', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '8');
INSERT INTO `task` VALUES ('22', 'aaa', 'aaa', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '8');
INSERT INTO `task` VALUES ('23', '1111', '1111', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '8');
INSERT INTO `task` VALUES ('24', '1111', '1111', '-1', '1', '2018-04-18 00:00:00', '2018-04-18 00:00:00', null, '2018-04-18 00:00:00', '1', '8');
INSERT INTO `task` VALUES ('25', '321312', null, '-1', '1', '2018-06-04 00:00:00', '2018-06-30 00:00:00', null, null, '3', '9');
INSERT INTO `task` VALUES ('26', 'aa', 'aa', '-1', '1', '2018-06-20 00:00:00', '2018-06-20 00:00:00', null, '2018-06-20 00:00:00', '1', '2');
INSERT INTO `task` VALUES ('27', 'bbbb', 'bbbb', '-1', '1', '2018-06-20 00:00:00', '2018-06-20 00:00:00', null, '2018-06-20 00:00:00', '1', '2');
INSERT INTO `task` VALUES ('28', 'bbbb', 'bbbb', '-1', '1', '2018-06-20 00:00:00', '2018-06-20 00:00:00', null, '2018-06-20 00:00:00', '1', '2');

-- ----------------------------
-- Table structure for task_list
-- ----------------------------
DROP TABLE IF EXISTS `task_list`;
CREATE TABLE `task_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `project_id` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_list
-- ----------------------------
INSERT INTO `task_list` VALUES ('2', '进行中12223', '3', '2');
INSERT INTO `task_list` VALUES ('3', '已完成11', '7', '3');
INSERT INTO `task_list` VALUES ('8', '待办', '2', '3');
INSERT INTO `task_list` VALUES ('9', 'dfasfsa', '8', '3');

-- ----------------------------
-- Table structure for user_t
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_t
-- ----------------------------
INSERT INTO `user_t` VALUES ('1', 'zhangsan@gmail.com', 'zhangsan', 'zhangsan', 'avatars:svg-1');
INSERT INTO `user_t` VALUES ('2', 'lisi@gmail.com', 'lisi', 'lisi', 'avatars:svg-2');
INSERT INTO `user_t` VALUES ('3', 'wangwu@gmail.com', 'wangwu', 'wangwu', 'avatars:svg-3');
INSERT INTO `user_t` VALUES ('4', 'zhaoliu@gmail.com', 'zhaoliu', 'zhaoliu', 'avatars:svg-4');
