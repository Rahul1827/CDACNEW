package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordInsertionWithoutXMLExample {

    public static void main(String[] args) {
        try (SessionFactory factory = HibernateUtilities.sessionFactory();
             Session session = factory.openSession()) {

            Actor actorobj = new Actor("A04", "Katrina", "Kaif", 41);

            Transaction tx = session.beginTransaction();
            session.persist(actorobj);
            tx.commit();

            System.out.println("Actor added");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
