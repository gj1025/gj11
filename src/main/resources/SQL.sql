-- 建表语句
CREATE TABLE `d_img_info` (
  `img_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `upload_user_id` varchar(32) NOT NULL COMMENT '上传人ID',
  `img_title` varchar(100) DEFAULT NULL COMMENT '图片主题',
  `system_type` int(1) DEFAULT NULL COMMENT '所属系统:0管理系统,1PC,2APP,3WAP',
  `img_type` int(1) DEFAULT NULL COMMENT '图片类型:1浮动图片,2Banner,3启动页,4宣传页',
  `img_url` varchar(150) DEFAULT NULL COMMENT '图片地址',
  `link_url` varchar(150) DEFAULT NULL COMMENT '图片指向地址',
  `show_state` int(1) DEFAULT NULL COMMENT '是否展示：0不展示,1展示',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '图片备注',
  `b_enable` char(1) DEFAULT '1' COMMENT '是否可用,0-不可用,1-可用',
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片管理表';

-- 测试数据录入
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('1', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-17 22:10:39', '2019-06-17 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('2', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-18 22:10:39', '2019-06-18 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('3', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-19 22:10:39', '2019-06-19 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('4', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-20 22:10:39', '2019-06-20 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('5', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-21 22:10:39', '2019-06-21 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('6', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-22 22:10:39', '2019-06-22 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('7', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-23 22:10:39', '2019-06-23 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('8', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-24 22:10:39', '2019-06-24 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('9', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-25 22:10:39', '2019-06-25 22:10:42', 'remark', '1');
INSERT INTO `d_img_info` (`img_id`, `upload_user_id`, `img_title`, `system_type`, `img_type`, `img_url`, `link_url`, `show_state`, `create_date`, `update_date`, `remark`, `b_enable`) VALUES ('10', '123456', '博客图片', '1', '2', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', 'https://avatars0.githubusercontent.com/u/50793885?s=460&v=4', '1', '2019-06-26 22:10:39', '2019-06-26 22:10:42', 'remark', '1');
