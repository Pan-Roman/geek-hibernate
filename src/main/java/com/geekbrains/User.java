package com.geekbrains;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//DROP TABLE IF EXISTS `hb_test`.`users`;
//CREATE TABLE `hb_test`.`users` (
//    `id` INT NOT NULL AUTO_INCREMENT,
//    `name` VARCHAR(128) NULL,
//    PRIMARY KEY (`id`))
//    ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;
