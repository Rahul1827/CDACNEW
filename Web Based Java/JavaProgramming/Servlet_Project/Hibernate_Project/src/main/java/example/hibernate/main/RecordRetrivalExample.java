package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordRetrivalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 try (SessionFactory factory = HibernateUtilities.sessionFactory();
	             Session session = factory.openSession()) {

	         // Loading an entity of type actor against an Id:A03
			 
			Actor foundActor= session.find(Actor.class, "A01");
			
			if(foundActor!=null) {
			System.out.println("Found "+foundActor);
			System.out.println("First Name :"+foundActor.getFirstName());
			System.out.println("First Name :"+foundActor.getLastName());
			System.out.println("First Name :"+foundActor.getAge());

			}
			else
			{
				
				System.out.println("Actor with given Id does not exists.");
			}
			
			
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	}

}
