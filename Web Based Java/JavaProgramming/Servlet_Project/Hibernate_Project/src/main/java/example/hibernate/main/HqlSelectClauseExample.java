package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.utils.HibernateConfig;

public class HqlSelectClauseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 try (SessionFactory factory = HibernateConfig.sessionFactory(); 
	             Session session = factory.openSession()) {
	           String hqlQuery ="select act.firstName,act.age from  Actor act";
	           Query<Object[]>queryRef=session.createQuery(hqlQuery,Object[].class);
	           List<Object[]>actorList= queryRef.list();
	           for(Object[] actorData:actorList)
	           {
	        	   System.out.println("First Name:" +actorData[0]);
	        	   
	        	   System.out.println("==================================");
	        	   System.out.println("Age "+ actorData[1]);
	           }
	                
	           
		 }

	}

}
