

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for photolist
-- ----------------------------
DROP TABLE IF EXISTS `photolist`;
CREATE TABLE `photolist`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 168 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of photolist
-- ----------------------------
INSERT INTO `photolist` VALUES (1, '吴楷鹏', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/wkp.png');
INSERT INTO `photolist` VALUES (2, '刘柏伟', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/lbw.png');
INSERT INTO `photolist` VALUES (3, '朱俏威', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/zqw.png');
INSERT INTO `photolist` VALUES (4, '软件作者：郑成强', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/zcq.png');
INSERT INTO `photolist` VALUES (5, '黄龙淼', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/hlm.png');
INSERT INTO `photolist` VALUES (6, '陈鑫磊', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxl.png');
INSERT INTO `photolist` VALUES (7, '陈燕旋', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cyx.png');
INSERT INTO `photolist` VALUES (8, '刘根伟', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/lgw.png');
INSERT INTO `photolist` VALUES (9, '林晓莉', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/lxl.png');
INSERT INTO `photolist` VALUES (10, '谢晓雯', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/xxw.png');
INSERT INTO `photolist` VALUES (11, '王锦程', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/wjc.png');
INSERT INTO `photolist` VALUES (12, '刘易键', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/lyj.png');
INSERT INTO `photolist` VALUES (13, '温乔丰', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/wqf.png');
INSERT INTO `photolist` VALUES (14, '谢金', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/xj.png');
INSERT INTO `photolist` VALUES (15, '郑泽生', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/zzs.png');
INSERT INTO `photolist` VALUES (16, '魏镕润', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/wrr.png');
INSERT INTO `photolist` VALUES (17, '古大一', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/gdy.png');
INSERT INTO `photolist` VALUES (18, '邓晓峰', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/dxf.png');
INSERT INTO `photolist` VALUES (19, '王瑞庆', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/wrq.png');
INSERT INTO `photolist` VALUES (20, '肖劲远', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/xjy.png');
INSERT INTO `photolist` VALUES (21, '陈庆斌', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cqb.png');
INSERT INTO `photolist` VALUES (22, '钟光华', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/zgh.png');
INSERT INTO `photolist` VALUES (23, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (24, '陈剑锋', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cjf.png');
INSERT INTO `photolist` VALUES (25, '陈炜', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cw.png');
INSERT INTO `photolist` VALUES (26, '陈志安', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cza.png');
INSERT INTO `photolist` VALUES (27, '郭子贤', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/gzx.png');
INSERT INTO `photolist` VALUES (28, '赖明峰', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/lmf.png');
INSERT INTO `photolist` VALUES (29, '魏镕润', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/wrr.png');
INSERT INTO `photolist` VALUES (30, '吴佑检', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (31, '徐崇斌', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/xcb.png');
INSERT INTO `photolist` VALUES (32, '张惠帆', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/zhf.png');
INSERT INTO `photolist` VALUES (33, '杨惠明', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/yhm.png');
INSERT INTO `photolist` VALUES (34, '叶铭锐', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/ymr.png');
INSERT INTO `photolist` VALUES (35, '欧阳思齐', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/oysq.png');
INSERT INTO `photolist` VALUES (36, '张锴嘉', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/zkj.png');
INSERT INTO `photolist` VALUES (37, '郑泽生', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/zzs.png');
INSERT INTO `photolist` VALUES (38, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (39, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (40, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (41, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (42, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (43, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (44, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');
INSERT INTO `photolist` VALUES (45, '陈昕宇', 'https://studentphoto-1300921589.cos.ap-guangzhou.myqcloud.com/cxy.png');

SET FOREIGN_KEY_CHECKS = 1;
