
DROP TABLE IF EXISTS fescar_storage;
CREATE TABLE fescar_storage (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '自增长的主键',
  disabled tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标志,1删除,0正常使用',
  uuid varchar(45) NOT NULL DEFAULT '' COMMENT '系统生成的一个随机码',
  info_desc text COMMENT '描述信息',
  create_user varchar(20) DEFAULT '孤狼' COMMENT '创建者',
  create_time datetime NOT NULL DEFAULT NOW() COMMENT '创建时间',
  update_user varchar(20) DEFAULT '孤狼' COMMENT '更新者',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',

  goods_code varchar(255) DEFAULT NULL COMMENT '商品编号',
  goods_count int(11) DEFAULT 0 COMMENT '商品数量',
  PRIMARY KEY (id),
  UNIQUE KEY (goods_code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8  COMMENT='库存表信息' ;


DROP TABLE IF EXISTS fescar_order;
CREATE TABLE fescar_order (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '自增长的主键',
  disabled tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标志,1删除,0正常使用',
  uuid varchar(45) NOT NULL DEFAULT '' COMMENT '系统生成的一个随机码',
  info_desc text COMMENT '描述信息',
  create_user varchar(20) DEFAULT '孤狼' COMMENT '创建者',
  create_time datetime NOT NULL DEFAULT NOW() COMMENT '创建时间',
  update_user varchar(20) DEFAULT '孤狼' COMMENT '更新者',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',

  user_id varchar(255) DEFAULT NULL COMMENT '用户的主键id',
  goods_code varchar(255) DEFAULT NULL COMMENT '商品编号',
  goods_count int(11) DEFAULT 0 COMMENT '商品数量',
  order_amount int(11) DEFAULT 0 COMMENT '订单金额',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='测试订单表' ;


DROP TABLE IF EXISTS fescar_account;
CREATE TABLE fescar_account (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '自增长的主键',
  disabled tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标志,1删除,0正常使用',
  uuid varchar(45) NOT NULL DEFAULT '' COMMENT '系统生成的一个随机码',
  info_desc text COMMENT '描述信息',
  create_user varchar(20) DEFAULT '孤狼' COMMENT '创建者',
  create_time datetime NOT NULL DEFAULT NOW() COMMENT '创建时间',
  update_user varchar(20) DEFAULT '孤狼' COMMENT '更新者',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  user_id varchar(255) DEFAULT NULL COMMENT '用户的主键id',
  account_amount int(11) DEFAULT 0 COMMENT '账户金额',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='测试账户表' ;


