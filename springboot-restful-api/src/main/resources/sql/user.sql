CREATE TABLE user(
    id int (11) NOT NULL AUTO_INCREMENT,
		username varchar(64) NOT NULL,
		tel VARCHAR(16) NOT NULL,
		password VARCHAR(250) NOT NULL,
		status TINYINT NOT NULL default 1,
    created_at timestamp not null default CURRENT_TIMESTAMP ,
    updated_at timestamp not null default CURRENT_TIMESTAMP ,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;