package example.hibernate.main;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Movie;
import example.hibernate.utils.HibernateUtils;



public class RecordInsertionExample2 {

	public RecordInsertionExample2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session session = factory.openSession())
		{
			Movie movieObj = new Movie("M03","Dangal","Inspirational",2015);
			Transaction tx= session.beginTransaction();
			session.persist(movieObj);
			tx.commit();
			System.out.println("Record Inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
