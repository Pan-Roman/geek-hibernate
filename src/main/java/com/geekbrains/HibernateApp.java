package com.geekbrains;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        Session session = null;



        try{
            session = factory.getCurrentSession();

            Product product = new Product();
            product.setTitle("Bread");

            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }



    }
}
