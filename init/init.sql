drop table if exists sys_dic;

drop table if exists sys_group;

drop table if exists sys_log;

drop table if exists sys_permission;

drop table if exists sys_permisson_resource;

drop table if exists sys_resource_element;

drop table if exists sys_resource_navigation;

drop table if exists sys_role;

drop table if exists sys_role_permisson;

drop table if exists sys_user;

drop table if exists sys_user_group;

drop table if exists sys_user_group_role;

drop table if exists sys_user_permisson;

drop table if exists sys_user_role;

/*==============================================================*/
/* Table: sys_dic                                               */
/*==============================================================*/
create table sys_dic
(
   
)
comment = "数据词典";

/*==============================================================*/
/* Table: sys_group                                             */
/*==============================================================*/
create table sys_group
(
   id                   bigint not null auto_increment,
   name                 varchar(20),
   comment              varchar(50),
   create_time          datetime,
   create_user          bigint,
   update_time          datetime,
   update_user          bigint,
   enable               int,
   primary key (id)
)
comment = "系统分组";

/*==============================================================*/
/* Table: sys_log                                               */
/*==============================================================*/
create table sys_log
(
   id                   bigint not null auto_increment,
   comment              varchar(50),
   log_time             datetime,
   log_user_id          bigint,
   log_user_name        varchar(20),
   primary key (id)
)
comment = "系统日志";

/*==============================================================*/
/* Table: sys_permission                                        */
/*==============================================================*/
create table sys_permission
(
   id                   bigint not null auto_increment,
   name                 varchar(20),
   comment              varchar(50),
   create_time          datetime,
   create_user          bigint,
   update_time          datetime,
   update_user          bigint,
   enable               int,
   primary key (id)
)
comment = "系统角色";

/*==============================================================*/
/* Table: sys_permisson_resource                                */
/*==============================================================*/
create table sys_permisson_resource
(
   id                   bigint not null auto_increment,
   resource_id          bigint,
   resource_type        varchar(10),
   permission_id        bigint,
   primary key (id)
)
comment = "系统权限资源";

/*==============================================================*/
/* Table: sys_resource_element                                  */
/*==============================================================*/
create table sys_resource_element
(
   id                   bigint not null auto_increment,
   code                 varchar(50),
   name                 varchar(20),
   value                varchar(20),
   comment              varchar(50),
   primary key (id)
)
comment = "系统元素资源";

/*==============================================================*/
/* Table: sys_resource_navigation                               */
/*==============================================================*/
create table sys_resource_navigation
(
   id                   bigint not null auto_increment,
   code                 varchar(20),
   name                 varchar(20),
   img                  varchar(30),
   url                  varchar(50),
   comment              varchar(50),
   leve                 int,
   parent_id            bigint,
   primary key (id)
)
comment = "系统菜单资源";

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   id                   bigint not null auto_increment,
   name                 varchar(20),
   comment              varchar(50),
   create_time          datetime,
   create_user          bigint,
   update_time          datetime,
   update_user          bigint,
   enable               int,
   primary key (id)
)
comment = "系统角色";

/*==============================================================*/
/* Table: sys_role_permisson                                    */
/*==============================================================*/
create table sys_role_permisson
(
   id                   bigint not null,
   role_id              bigint,
   permission_id        bigint,
   primary key (id)
)
comment = "系统角色权限";

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   id                   bigint not null auto_increment,
   user_name            varchar(30),
   password             varchar(50),
   first_name           varchar(50),
   last_name            varchar(50),
   gender               varchar(6),
   mobile               varchar(20),
   birthdate            date,
   create_time          datetime,
   create_user          bigint,
   update_time          datetime,
   update_user          bigint,
   enable               int,
   primary key (id)
)
comment = "系统用户";

/*==============================================================*/
/* Table: sys_user_group                                        */
/*==============================================================*/
create table sys_user_group
(
   id                   bigint not null auto_increment,
   user_id              bigint,
   group_id             bigint,
   primary key (id)
)
comment = "系统用户分组";

/*==============================================================*/
/* Table: sys_user_group_role                                   */
/*==============================================================*/
create table sys_user_group_role
(
   id                   bigint not null auto_increment,
   role_id              bigint,
   group_id             bigint,
   primary key (id)
)
comment = "系统用户分组角色";

/*==============================================================*/
/* Table: sys_user_permisson                                    */
/*==============================================================*/
create table sys_user_permisson
(
   id                   bigint not null,
   user_id              bigint,
   permission_id        bigint,
   primary key (id)
)
comment = "系统用户权限";

/*==============================================================*/
/* Table: sys_user_role                                         */
/*==============================================================*/
create table sys_user_role
(
   id                   bigint not null,
   user_id              bigint,
   role_id              bigint,
   primary key (id)
)
comment = "系统用户角色";
