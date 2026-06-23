package org.deep.util;

import org.hibernate.SessionFactory;

public  class HibernateUtils {

    private static SessionFactory sessionFactory;



    static {
        if (sessionFactory == null) {
            try {
                sessionFactory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
