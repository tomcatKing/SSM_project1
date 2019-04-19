# Host: localhost  (Version: 5.5.36-log)
# Date: 2019-04-19 13:54:43
# Generator: MySQL-Front 5.3  (Build 4.214)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "cart"
#

DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(100) DEFAULT NULL,
  `food_id` int(11) DEFAULT NULL COMMENT '商品id',
  `food_num` int(11) DEFAULT NULL COMMENT '商品数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`cart_id`),
  KEY `open_id_index` (`open_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8;

#
# Data for table "cart"
#

INSERT INTO `cart` VALUES (137,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',31,1,'2019-04-15 15:20:40','2019-04-15 15:20:40'),(138,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',32,1,'2019-04-15 15:20:41','2019-04-15 15:22:46');

#
# Structure for table "food"
#

DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `food_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '美食主键',
  `food_type` int(11) NOT NULL COMMENT '分类id,对应美食分类:1-甜食,2-瓜果,3-蛋糕,4-饮料',
  `food_name` varchar(100) NOT NULL COMMENT '美食名称',
  `food_img` varchar(500) NOT NULL COMMENT '美食图片',
  `food_detail` varchar(300) DEFAULT '该美味无法用言语来表达' COMMENT '商品详情',
  `food_price` decimal(20,2) unsigned DEFAULT '20.00' COMMENT '美食标价',
  `food_count` int(11) unsigned NOT NULL DEFAULT '100' COMMENT '食物销量',
  `food_status` int(6) DEFAULT '1' COMMENT '商品状态:1-在售,2-下架,3-删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

#
# Data for table "food"
#

INSERT INTO `food` VALUES (26,1,'大果冻','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554813560&di=cbacf0f665f50a309a77ab74ee662bbd&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F01%2F68%2F01%2F595812ca31b22_610.jpg','该美味无法用言语来表达',20.00,124,1,'2019-04-02 20:42:21','2019-04-19 13:46:16'),(27,1,'甜甜圈','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554219139476&di=5f6fbb5912e540a5e6f967901417b8c1&imgtype=0&src=http%3A%2F%2Fku.90sjimg.com%2Felement_origin_min_pic%2F17%2F06%2F30%2Fb84270a5b8009176f6f22a5443017453.jpg%2521%2Ffwfh%2F804x697%2Fquality%2F90%2Funsharp%2Ftrue%2Fcompress%2Ftrue','该美味无法用言语来表达',40.00,171,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(28,1,'巧克力','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554219288524&di=e7966f9e039232949ce39ba349ba85e2&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic2%2Fcover%2F00%2F55%2F18%2F581e8a0b5b6f4_610.jpg','该美味无法用言语来表达',60.00,216,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(29,1,'冰糖葫芦','https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3750258313,1984525947&fm=26&gp=0.jpg','该美味无法用言语来表达',80.00,259,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(30,1,'蛋挞','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554814531&di=347763778ddab3e1bbbd7d08813a1ee1&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F01%2F64%2F46%2F5956525b77a97_610.jpg','该美味无法用言语来表达',100.00,0,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(31,1,'汤圆','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554219987882&di=a90891158b17b9dbcb81b685313b1d21&imgtype=0&src=http%3A%2F%2Fimages.669pic.com%2Felement_pic%2F92%2F33%2F69%2F50%2F02878a3716a90ebc7cc579b02ebeaea9.jpg','该美味无法用言语来表达',120.00,39,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(32,1,'冰淇淋','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554220075669&di=ffa2b9117312c4823ffb9ebd9e368ea1&imgtype=0&src=http%3A%2F%2Fpic.90sjimg.com%2Fdesign%2F00%2F93%2F88%2F11%2F590709134e5ac.png','该美味无法用言语来表达',140.00,76,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(33,1,'棉花糖','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554220232158&di=c3457b20ac789a87aac154a62ea4beff&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F03%2F15%2F64%2F5b5825ad3de43_610.jpg','该美味无法用言语来表达',160.00,111,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(34,2,'西瓜','https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3898934369,1234217395&fm=26&gp=0.jpg','该美味无法用言语来表达',90.00,144,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(35,2,'柠檬','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554220612651&di=be2d6a6656a4e3cac9155be6ad1b9514&imgtype=0&src=http%3A%2F%2Fpic.90sjimg.com%2Fdesign%2F00%2F75%2F92%2F97%2F59379c77ac16b.png','该美味无法用言语来表达',100.00,175,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(36,2,'水蜜桃','https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1773973920,3450983547&fm=26&gp=0.jpg','该美味无法用言语来表达',110.00,204,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(37,2,'猕猴桃','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554220723973&di=651d70d716c061528344acf335224312&imgtype=0&src=http%3A%2F%2Fpic.qiantucdn.com%2F58pic%2F28%2F87%2F69%2F37258PIC6e0hr58PICr58PICukWbD_PIC2018.jpg%2521%2Ffw%2F1024%2Fwatermark%2Furl%2FL2ltYWdlcy93YXRlcm1hcmsvZGF0dS5wbmc%3D%2Frepeat%2Ftrue%2Fcrop%2F0x1745a0a0','该美味无法用言语来表达',120.00,231,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(38,2,'梨','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554220821344&di=6e4f0f9e3a2cfb85c65b95e0b4964899&imgtype=0&src=http%3A%2F%2Fpic.90sjimg.com%2Fdesign%2F00%2F40%2F08%2F34%2F5938aefa5081b.png','该美味无法用言语来表达',130.00,256,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(39,2,'菠萝','https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3303116614,401404243&fm=26&gp=0.jpg','该美味无法用言语来表达',140.00,279,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(40,2,'苹果','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554220975081&di=20816c4195b4c9a8bae9ce8889397152&imgtype=0&src=http%3A%2F%2Fpic142.nipic.com%2Ffile%2F20171005%2F10673188_155533792000_2.jpg','该美味无法用言语来表达',150.00,221,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(41,2,'芒果','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221021340&di=5c3ee352308c9dcb908e82ea999c5d7b&imgtype=0&src=http%3A%2F%2Fpic.90sjimg.com%2Fdesign%2F00%2F21%2F84%2F57%2Fs_1024_58cf88781d114.png','该美味无法用言语来表达',10.00,19,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(42,2,'香蕉','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221092943&di=00f0deb439c1d338f392906b15241b57&imgtype=0&src=http%3A%2F%2Fimg02.tooopen.com%2Fimages%2F20150720%2Ftooopen_sy_134679756959.jpg','该美味无法用言语来表达',20.00,36,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(43,2,'葡萄','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221168595&di=b1ed36c5be6fba234f9985f829250061&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F03%2F06%2F07%2F5b2dd1b70559d_610.jpg','该美味无法用言语来表达',30.00,51,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(44,2,'哈密瓜','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221215199&di=be439bcf7ce8d4de434ca8d32b5bdae9&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F03%2F31%2F28%2F5b80e5e45880b_610.jpg','该美味无法用言语来表达',40.00,64,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(45,2,'石榴','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221259391&di=59c5031dd1689fbd20cdb97b3162e08e&imgtype=0&src=http%3A%2F%2Fbpic.588ku.com%2Felement_origin_min_pic%2F17%2F06%2F14%2F57a0c6c4d43dbd9e43c6f209e2985526.jpg%2521%2Ffwfh%2F804x804%2Fquality%2F90%2Funsharp%2Ftrue%2Fcompress%2Ftrue','该美味无法用言语来表达',50.00,75,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(46,2,'木瓜','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221355374&di=7642fa876cc769cdd19e6e536e80e08d&imgtype=0&src=http%3A%2F%2Fku.90sjimg.com%2Felement_origin_min_pic%2F18%2F03%2F24%2F004eb252826341ce9b6e1b2e43fcbbc6.jpg','该美味无法用言语来表达',60.00,84,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(47,3,'小蛋糕','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221529496&di=f00363038c755d54463a74a8fcfa129c&imgtype=0&src=http%3A%2F%2Fpic.90sjimg.com%2Fdesign%2F00%2F07%2F85%2F23%2Fs_1024_58d0d7189a627.png','该美味无法用言语来表达',46.67,91,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(48,3,'奶油蛋糕','https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=384947673,3583707653&fm=26&gp=0.jpg','该美味无法用言语来表达',53.33,96,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(49,3,'水果蛋糕','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221714359&di=b505d1d76de2820f5f53abc66297c628&imgtype=0&src=http%3A%2F%2Fbpic.588ku.com%2Felement_water_img%2F19%2F02%2F21%2F446dddafcd575bc89631f0394fca2a99.jpg','该美味无法用言语来表达',60.00,99,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(50,3,'巧克力蛋糕','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554221838538&di=9eb7b4bc6279d1019efe8c7030706a11&imgtype=0&src=http%3A%2F%2Fpic.16pic.com%2F00%2F51%2F54%2F16pic_5154021_b.jpg','该美味无法用言语来表达',66.67,100,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(51,4,'可口可乐','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554222091922&di=2a709da8e670ba694d6b584700df95bc&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F01%2F10%2F45%2F5903689e72e49_610.jpg','该美味无法用言语来表达',5.00,99,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(52,4,'百事可乐','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554222234500&di=84dc55d4eb1ef93d39f9e251c3492403&imgtype=0&src=http%3A%2F%2Fwenwen.soso.com%2Fp%2F20101026%2F20101026183116-967935744.jpg','该美味无法用言语来表达',10.00,96,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(53,4,'雪碧','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554222405757&di=b26982f553087f8aaf6252e27fa06069&imgtype=0&src=http%3A%2F%2Fimage.sonhoo.com%2Fserver14%2Fphotos%2Fphoto%2Fm1506291726245%2F811305e152651b3283aa409f2b857232.jpg','该美味无法用言语来表达',15.00,91,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(54,4,'脉动','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554222454986&di=287418a0d6f5daaf602e96ed167772b9&imgtype=0&src=http%3A%2F%2Fwww.pohu.xin%2Fimages%2F201711%2Fgoods_img%2F967_P_1511694223599.jpg','该美味无法用言语来表达',20.00,84,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(55,4,'咖啡','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554222786316&di=bd73fc1c96686f46908436b4a5678e0f&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fd788d43f8794a4c23475ac0c04f41bd5ad6e3946.jpg','该美味无法用言语来表达',25.00,75,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(56,4,'茶','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554222901967&di=33cfc527aa30babbe6577406ce627364&imgtype=0&src=http%3A%2F%2Fwww.jituwang.com%2Fuploads%2Fallimg%2F150611%2F258634-15061109224210.jpg','该美味无法用言语来表达',30.00,64,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(57,1,'糯米丸子','http://5b0988e595225.cdn.sohucs.com/q_70,c_zoom,w_640/images/20171227/922ee2c80ed647e48944a9029e27730f.jpg','该美味无法用言语来表达',140.00,51,1,'2019-04-02 20:42:21','2019-04-02 20:42:21'),(58,1,'绿果果','http://bpic.588ku.com/element_origin_min_pic/18/06/10/1b6586909ac80eca4903f703bcf9e1f7.jpg','该美食无法用语言描述',100.00,100,1,'2019-04-18 10:09:13','2019-04-18 10:13:08'),(59,2,'火龙果,火龙果','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555655827678&di=095903bdf815d0cb223bb236f9064d71&imgtype=0&src=http%3A%2F%2Fimage.huahuibk.com%2Fuploads%2F20190228%2F21%2F1551361361-iegovHhAbp.jpg,https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555655827678&di=095903bdf815d0cb223bb236f9064d71&imgtype=0&src=http%3A%2F%2Fimage.huahuibk.com%2Fuploads%2F20190228%2F21%2F1551361361-iegovHhAbp.jpg','该美食无法用语言描述,该美食无法用语言描述',100.00,100,1,'2019-04-19 13:05:22','2019-04-19 13:05:22'),(60,2,'恶魔果实','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555660483594&di=f60954307356bc7767536d61323f1204&imgtype=0&src=http%3A%2F%2Fcbu01.alicdn.com%2Fimg%2Fibank%2F2018%2F022%2F806%2F8612608220_1997765352.jpg','该美食无法用语言描述',100.00,100,1,'2019-04-19 13:07:07','2019-04-19 13:07:07');

#
# Structure for table "order"
#

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_no` bigint(20) DEFAULT NULL COMMENT '订单号',
  `open_id` varchar(100) DEFAULT NULL COMMENT '用户id',
  `shipping_id` int(11) DEFAULT NULL COMMENT '消费id',
  `payment` decimal(20,2) DEFAULT NULL COMMENT '实际支付金额,单位元',
  `payment_type` int(4) DEFAULT NULL COMMENT '支付类型,1-在线支付',
  `status` int(10) DEFAULT NULL COMMENT '订单状态:0-已取消,10-未付款,20-已支付,30-交易成功,40-已发货,50-已收货',
  `order_desc` varchar(255) DEFAULT NULL COMMENT '用户创建订单时,发送给商家的描述信息',
  `payment_time` datetime DEFAULT NULL COMMENT '支付时间',
  `send_time` datetime DEFAULT NULL COMMENT '发货时间',
  `end_time` datetime DEFAULT NULL COMMENT '交易完成时间',
  `close_time` datetime DEFAULT NULL COMMENT '交易关闭时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `order_no_index` (`order_no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

#
# Data for table "order"
#

INSERT INTO `order` VALUES (12,1555312960505,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',32,80.00,1,0,'轻点送,这个东西容易碎',NULL,NULL,NULL,NULL,'2019-04-15 15:21:29','2019-04-16 10:43:12'),(13,1555313070188,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',32,180.00,1,10,'希望您可以送快点',NULL,NULL,NULL,NULL,'2019-04-15 15:22:51','2019-04-15 15:22:51');

#
# Structure for table "order_item"
#

DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `order_item_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单字表id',
  `open_id` varchar(100) DEFAULT NULL,
  `order_no` bigint(20) DEFAULT NULL COMMENT '订单编号',
  `food_id` int(11) DEFAULT NULL COMMENT '美食id',
  `food_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `food_img` varchar(500) DEFAULT NULL COMMENT '商品图片名称',
  `food_price` decimal(20,2) DEFAULT NULL COMMENT '商品单价',
  `food_num` int(10) DEFAULT NULL COMMENT '商品数量',
  `total_price` decimal(20,2) DEFAULT NULL COMMENT '商品总价,单位是元,保留2位小数',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_item_id`),
  KEY `order_no_index` (`order_no`) USING BTREE,
  KEY `order_no_user_id_index` (`open_id`,`order_no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

#
# Data for table "order_item"
#

INSERT INTO `order_item` VALUES (12,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',1555312960505,26,'果冻','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554813560&di=cbacf0f665f50a309a77ab74ee662bbd&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F01%2F68%2F01%2F595812ca31b22_610.jpg',20.00,1,20.00,'2019-04-15 15:21:29','2019-04-15 15:21:29'),(13,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',1555312960505,28,'巧克力','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554219288524&di=e7966f9e039232949ce39ba349ba85e2&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic2%2Fcover%2F00%2F55%2F18%2F581e8a0b5b6f4_610.jpg',60.00,1,60.00,'2019-04-15 15:21:29','2019-04-15 15:21:29'),(14,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',1555313070188,29,'冰糖葫芦','https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3750258313,1984525947&fm=26&gp=0.jpg',80.00,1,80.00,'2019-04-15 15:22:51','2019-04-15 15:22:51'),(15,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE',1555313070188,30,'蛋挞','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554814531&di=347763778ddab3e1bbbd7d08813a1ee1&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F01%2F64%2F46%2F5956525b77a97_610.jpg',100.00,1,100.00,'2019-04-15 15:22:51','2019-04-15 15:22:51');

#
# Structure for table "pay_info"
#

DROP TABLE IF EXISTS `pay_info`;
CREATE TABLE `pay_info` (
  `pay_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '支付主键',
  `open_id` varchar(100) DEFAULT NULL COMMENT '用户id',
  `order_no` bigint(20) DEFAULT NULL COMMENT '订单号',
  `pay_platform` int(10) DEFAULT NULL COMMENT '支付平台:1-微信',
  `platform_number` varchar(200) DEFAULT NULL COMMENT '支付宝支付流水号',
  `platform_status` varchar(20) DEFAULT NULL COMMENT '支付状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "pay_info"
#


#
# Structure for table "shipping"
#

DROP TABLE IF EXISTS `shipping`;
CREATE TABLE `shipping` (
  `shipping_id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(100) DEFAULT NULL COMMENT '用户id',
  `receiver_name` varchar(20) DEFAULT NULL COMMENT '收货人性名',
  `receiver_phone` varchar(20) DEFAULT NULL COMMENT '收货人电话',
  `receiver_province` varchar(20) DEFAULT NULL COMMENT '省份',
  `receiver_city` varchar(20) DEFAULT NULL COMMENT '城市',
  `receiver_district` varchar(20) DEFAULT NULL COMMENT '区/县',
  `receiver_address` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`shipping_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

#
# Data for table "shipping"
#

INSERT INTO `shipping` VALUES (32,'o3KhW45OPn-_rcgdRXMUZ0-7eXvE','tomcatBbzzzs','15113437287','广东','韶关','曲江','大宝山中心区','2019-02-02 02:02:02','2019-02-02 02:02:02');

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `open_id` varchar(100) NOT NULL DEFAULT '' COMMENT '微信用户的open_id',
  `user_img` varchar(500) NOT NULL COMMENT '微信用户的头像',
  PRIMARY KEY (`open_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES ('o3KhW45OPn-_rcgdRXMUZ0-7eXvE','https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83erIRsH6scy9VzdpNh6dBLmiaRsiamuosHicP0vrQYDlsPibjiaSicGjtcx3aLaM9euaSAmic6nkqtibxicU0Tg/132');
