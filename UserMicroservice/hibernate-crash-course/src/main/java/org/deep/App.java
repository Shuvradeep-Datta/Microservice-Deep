package org.deep;

import org.deep.entity.Certificate;
import org.deep.entity.Student;
import org.deep.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<Certificate> certificates = Arrays.asList(
                new Certificate("C001","Java Basics"),
                new Certificate("C002","Hibernate Fundamentals"),
                new Certificate("C003","Spring Boot Essentials")
        );

        Student st = new Student();
        st.setStudentId("S001");
        st.setStudentName("John Doe");
        st.setStudentEmail("johndoe@gmail.com");
        st.setStudentPhone("1234567890");
        st.setStudentAddress("123 Main St, City, Country");
        st.setActive(true);
        st.setCertificates(certificates);


        for (Certificate c:certificates){
                c.setStudent(st);
        }

        st.setCertificates(certificates);






        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();




        Session session = sessionFactory.openSession();
        Transaction transaction =null;
        try{
            session = sessionFactory.openSession();
            transaction= session.beginTransaction();
            session.persist(st);
            transaction.commit();
        }catch (Exception e){
            if (transaction !=null){
                transaction.rollback();
                System.out.println("Transaction rolled back due to duplicate entry...");
            }else {
                e.printStackTrace();
            }
        }finally {
            session.close();
        }
//        try{
//            session = sessionFactory.openSession();
//            transaction= session.beginTransaction();
//            session.persist(ct);
//            transaction.commit();
//        }catch (Exception e){
//            if (transaction !=null){
//                transaction.rollback();
//                System.out.println("Transaction rolled back due to duplicate entry...");
//            }else {
//                e.printStackTrace();
//            }
//        }finally {
//            session.close();
//        }
    }
}
