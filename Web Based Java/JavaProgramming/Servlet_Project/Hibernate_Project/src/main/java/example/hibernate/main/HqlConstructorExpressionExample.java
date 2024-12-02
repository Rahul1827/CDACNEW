package example.hibernate.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import example.hibernate.bean.ActorData;
import example.hibernate.entity.Film;
import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class HqlConstructorExpressionExample {

	public HqlConstructorExpressionExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		
		
		 try (SessionFactory factory = HibernateConfig.sessionFactory(); 
	             Session session = factory.openSession()) {
			 
			String hqlQuery=" select new example.hibernate.bean.ActorData(act.firstName,act.age) from Actor act";
	Query<ActorData>queryRef=	session.createQuery(hqlQuery,ActorData.class);
		List<ActorData>actorList = queryRef.list();
		actorList.stream().forEach(actor -> System.out.println(actor));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
