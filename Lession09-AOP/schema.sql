create table article(
                        id int(11) primary key auto_increment,
                        user_id int(11) not null ,
                        title varchar(100) not null ,
                        summary varchar(200) default not null,
                        read_count int(11) unsigned zerofill not null ,
                        create_time datetime not null ,
                        update_time datetime not null
)