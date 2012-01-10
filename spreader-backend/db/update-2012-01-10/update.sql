/**
 * 增加分组表，分组类型的默认值为1，简单分组
alter table tb_strategy_group drop column group_type;
alter table tb_strategy_group  add column group_type int default 1;
 */

/**
 * 执行此脚本
 */
create table tb_strategy_group
(
   id                   bigint not null auto_increment,
   group_name           varchar(100),
   group_type           int not null default 1,
   description          varchar(200),
   create_time          timestamp,
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

alter table tb_strategy_group comment '策略分组表';