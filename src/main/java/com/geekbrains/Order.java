package com.geekbrains;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "user_id")
    private User user;

}

//DROP TABLE IF EXISTS `hb_test`.`orders`;
//CREATE TABLE `hb_test`.`orders` (
//    `id` INT NOT NULL AUTO_INCREMENT,
//    `date` DATETIME NULL,
//    `user_id` INT NULL,
//    PRIMARY KEY (`id`))
//    ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;