package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordDeleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (SessionFactory factory = HibernateUtilities.sessionFactory();
	             Session session = factory.openSession()) {

	         // Loading an entity of type actor against an Id:A03
			 
			Actor foundActor= session.find(Actor.class, "A01");
			Transaction tx = session.beginTransaction();
			session.remove(foundActor);
			tx.commit();
			System.out.println("Record Deleted");
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}

	}

}
