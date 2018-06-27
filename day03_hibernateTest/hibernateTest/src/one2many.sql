

-- ----------------------------
-- Table structure for t_classes
-- ----------------------------
CREATE TABLE `t_classes` (
  `id` varchar(255) NOT NULL,
  `className` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
CREATE TABLE `t_student` (
  `id` varchar(255) NOT NULL,
  `studentName` varchar(255) DEFAULT NULL,
  `pid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4B9075707726D3F6` (`pid`),
  CONSTRAINT `FK4B9075707726D3F6` FOREIGN KEY (`pid`) REFERENCES `t_classes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

