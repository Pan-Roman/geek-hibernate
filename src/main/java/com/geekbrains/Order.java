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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Product product;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

//DROP TABLE IF EXISTS `hb_test`.`orders`;
//CREATE TABLE `hb_test`.`orders` (
//    `id` INT NOT NULL AUTO_INCREMENT,
//    `date` DATETIME NULL,
//    `user_id` INT NULL,
//    PRIMARY KEY (`id`))
//    ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;