-- ----------------------------
-- 1、用户信息表
-- ----------------------------
drop table if exists sys_user;
create table sys_user
(
    user_id      bigint(20)  not null auto_increment comment '用户ID',
    user_name    varchar(30) not null unique comment '用户账号',
    nick_name    varchar(30) not null comment '用户昵称',
    user_type    varchar(2)   default '00' comment '用户类型（00系统用户）',
    email        varchar(50)  default '' comment '用户邮箱',
    phone_number varchar(11)  default '' comment '手机号码',
    password     varchar(100) default '' comment '密码',
    status       char(1)      default '0' comment '帐号状态（0正常 1停用）',
    login_ip     varchar(50)  default '' comment '最后登录IP',
    login_date   datetime comment '最后登录时间',
    create_time  datetime comment '创建时间',
    update_by    varchar(64)  default '' comment '更新者',
    update_time  datetime comment '更新时间',
    remark       varchar(500) default null comment '备注',
    primary key (user_id)
) engine = innodb
  auto_increment = 100 comment = '用户信息表';


-- ----------------------------
-- 2、角色信息表
-- ----------------------------
drop table if exists sys_role;
create table sys_role
(
    role_id     bigint(20)   not null auto_increment comment '角色ID',
    role_name   varchar(30)  not null comment '角色名称',
    role_key    varchar(100) not null comment '角色权限字符串',
    role_sort   int(4)       not null comment '显示顺序',
    status      char(1)      not null comment '角色状态（0正常 1停用）',
    del_flag    char(1)      default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64)  default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64)  default '' comment '更新者',
    update_time datetime comment '更新时间',
    remark      varchar(500) default null comment '备注',
    primary key (role_id)
) engine = innodb
  auto_increment = 100 comment = '角色信息表';


-- ----------------------------
-- 初始化-角色信息表数据
-- ----------------------------
insert into sys_role
values ('1', '超级管理员', 'admin', 1, '0', '0', 'admin', sysdate(), '', null, '超级管理员');
insert into sys_role
values ('2', '项目经理', 'common', 2, '0', '0', 'admin', sysdate(), '', null, '项目经理');
insert into sys_role
values ('3', '开发人员', 'common', 3, '0', '0', 'admin', sysdate(), '', null, '开发人员');
insert into sys_role
values ('4', '测试人员', 'common', 4, '0', '0', 'admin', sysdate(), '', null, '测试人员');


-- ----------------------------
-- 3、菜单权限表
-- ----------------------------
drop table if exists sys_menu;
create table sys_menu
(
    menu_id     bigint(20)  not null auto_increment comment '菜单ID',
    menu_name   varchar(50) not null comment '菜单名称',
    parent_id   bigint(20)   default 0 comment '父菜单ID',
    order_num   int(4)       default 0 comment '显示顺序',
    path        varchar(200) default '' comment '路由地址',
    component   varchar(255) default null comment '组件路径',
    menu_type   char(1)      default '' comment '菜单类型（M目录 C菜单 F按钮）',
    visible     char(1)      default 0 comment '菜单状态（0显示 1隐藏）',
    status      char(1)      default 0 comment '菜单状态（0正常 1停用）',
    perms       varchar(100) default null comment '权限标识',
    icon        varchar(100) default '#' comment '菜单图标',
    create_by   varchar(64)  default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64)  default '' comment '更新者',
    update_time datetime comment '更新时间',
    remark      varchar(500) default '' comment '备注',
    primary key (menu_id)
) engine = innodb
  auto_increment = 2000 comment = '菜单权限表';


-- ----------------------------
-- 初始化-菜单信息表数据
-- ----------------------------
-- 一级菜单
insert into sys_menu
values ('1', '需求管理', '0', '1', 'requirement', null, 'M', '0', '0', '', 'requirement', 'admin', sysdate(), '', null,
        '需求管理');
insert into sys_menu
values ('2', '组件管理', '0', '2', 'component', null, 'M', '0', '0', '', 'component', 'admin', sysdate(), '', null,
        '组件管理');
insert into sys_menu
values ('3', '测试集', '0', '3', 'set', null, 'M', '0', '0', '', 'set', 'admin', sysdate(), '', null, '测试集');
insert into sys_menu
values ('4', '日志', '0', '4', 'log', null, 'M', '0', '0', '', 'log', 'admin', sysdate(), '', null, '测试集');


-- ----------------------------
-- 4、项目信息表
-- ----------------------------
drop table if exists sys_project;
create table sys_project
(
    project_id   int(10) not null auto_increment comment '项目ID',
    project_name varchar(128) default null comment '项目名称',
    description  mediumtext   default null comment '描述',
    create_user  varchar(32)  default null comment '创建者',
    primary key (project_id)
) engine = innodb
  auto_increment = 2000 comment = '项目信息表';


-- ----------------------------
-- 5、用户和角色关联表  用户N-1角色
-- ----------------------------
drop table if exists sys_user_project_role;
create table sys_user_project_role
(
    project_id bigint(20) not null comment '项目ID',
    user_id    bigint(20) not null comment '用户ID',
    role_id    bigint(20) not null comment '角色ID',
    primary key (project_id, user_id, role_id)
) engine = innodb comment = '用户和角色关联表';

-- ----------------------------
-- 初始化-用户和角色关联表数据
-- ----------------------------
insert into sys_user_project_role
values ('1', '1', '1');
insert into sys_user_project_role
values ('2', '1', '1');


-- ----------------------------
-- 6、角色和菜单关联表  角色1-N菜单
-- ----------------------------
drop table if exists sys_role_menu;
create table sys_role_menu
(
    role_id bigint(20) not null comment '角色ID',
    menu_id bigint(20) not null comment '菜单ID',
    primary key (role_id, menu_id)
) engine = innodb comment = '角色和菜单关联表';