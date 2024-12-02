package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import example.hibernate.entity.Actor;
import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class HqlFromClauseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (SessionFactory factory = HibernateConfig.sessionFactory(); 
	             Session session = factory.openSession()) {
	           String hqlQuery ="from Actor act";
	           Query<Actor>queryRef=
	           session.createQuery(hqlQuery,Actor.class);
	           
	           List<Actor>allActors=queryRef.list();
	           for(Actor currentActor:allActors)
	           
	        	   System.out.println(currentActor);
	        	   System.out.println("============================================");
	        	   allActors.stream().
	        	   forEach(currentActor->System.out.println(currentActor));
	           

	           
//	            Transaction tx = session.beginTransaction();
//	                     
//	            tx.commit();
//	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	}

}
