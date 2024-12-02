package example.hibernate.main;

import java.util.Arrays;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Film;
import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class LinkSongsToFilms {

	public static void main(String[] args) {
		

		
		 try (SessionFactory factory = HibernateConfig.sessionFactory(); 
	             Session session = factory.openSession()) {
			 
			// Loading the films for which songs are linked
			 
			 Film film1 =session.find(Film.class, "F01");
			 Film film2 =session.find(Film.class, "F02");
			 
				// Loading the songs  for which songs are linked with the films
			 
			 Song song1 = session.find(Song.class, "S01");
			 Song song2 = session.find(Song.class, "S02");
			 Song song3 = session.find(Song.class, "S03");
			 Song song4 = session.find(Song.class, "S04");
	             
	         
             //Adding song 1 and song 2 to the film one
	            Transaction tx = session.beginTransaction();
	            Collection<Song>songsCollection= Arrays.asList(song1,song2);
	            film1.setSongs(songsCollection);
	            
	          //Adding song3 and song4 to the film2
	            
	            film2.addSong(song3);
	            film2.addSong(song4);
	                  
	            tx.commit();
	            System.out.println("Song is linked with films");
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

		
	}

}
