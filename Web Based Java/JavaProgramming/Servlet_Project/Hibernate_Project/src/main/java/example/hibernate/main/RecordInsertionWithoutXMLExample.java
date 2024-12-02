package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordInsertionWithoutXMLExample {

    public static void main(String[] args) {
        try (SessionFactory factory = HibernateConfig.sessionFactory();
             Session session = factory.openSession()) {

            Actor actorobj = new Actor("A06", "Tripti", "Dimri", 35);

            Transaction tx = session.beginTransaction();
            session.persist(actorobj);
            tx.commit();

            System.out.println("Actor added");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
