-- ----------------------------
-- 1、用户信息表
-- ----------------------------
drop table if exists sys_user;
create table sys_user (
                          user_id           bigint(20)      not null auto_increment    comment '用户ID',
                          user_name         varchar(30)     not null unique            comment '用户账号',
                          nick_name         varchar(30)     not null                   comment '用户昵称',
                          user_type         varchar(2)      default '00'               comment '用户类型（00系统用户）',
                          email             varchar(50)     default ''                 comment '用户邮箱',
                          phone_number       varchar(11)     default ''                comment '手机号码',
                          password          varchar(100)    default ''                 comment '密码',
                          status            char(1)         default '0'                comment '帐号状态（0正常 1停用）',
                          login_ip          varchar(50)     default ''                 comment '最后登录IP',
                          login_date        datetime                                   comment '最后登录时间',
                          create_time       datetime                                   comment '创建时间',
                          update_by         varchar(64)     default ''                 comment '更新者',
                          update_time       datetime                                   comment '更新时间',
                          remark            varchar(500)    default null               comment '备注',
                          primary key (user_id)
) engine=innodb auto_increment=100 comment = '用户信息表';