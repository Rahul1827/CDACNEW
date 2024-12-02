package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Film;
import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class AddSongsExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 try (SessionFactory factory = HibernateConfig.sessionFactory(); 
	             Session session = factory.openSession()) {
	             
	            Song s1 = new Song("S01","O mere dil k chain");
	            Song s2 = new Song("S02","Ankhon me teri");
	            Song s3 = new Song("S03","Sanu ek pal chain na aawe");
	            Song s4 = new Song("S04","Love is waste of time");
	            

	            Transaction tx = session.beginTransaction();
	            session.persist(s1);
	            session.persist(s2);
	            session.persist(s3);
	            session.persist(s4);            
	            tx.commit();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}
