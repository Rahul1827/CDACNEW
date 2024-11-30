package example.hibernate.main;

import java.security.DomainCombiner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.spi.CurrentSessionContext;

import example.hibernate.entity.Movie;



public class RecordInsertionExample {

	public RecordInsertionExample() {
		// TODO Auto-generated constructor stub
		


	}
	
	public  static void main(String[] args)
	{
		//Configure
	Configuration conf = new Configuration();
	
	conf= conf.configure();

	
SessionFactory factory =conf.buildSessionFactory();

Session currentsession = factory.openSession();

   Movie movieobj = new Movie("M02","Pushpa","Action",2022);
		
   Transaction tx = currentsession.beginTransaction();
   
   currentsession.persist(movieobj);
   tx.commit();
   
	}

}
