package com.geekbrains;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private Float cost;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}

//DROP TABLE IF EXISTS `hb_test`.`products`;
//CREATE TABLE `hb_test`.`products` (
//    `id` INT NOT NULL AUTO_INCREMENT,
//    `title` VARCHAR(128) NULL DEFAULT NULL,
//    `cost` FLOAT NULL,
//    PRIMARY KEY (`id`))
//    ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;