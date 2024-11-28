package example.jdbc.dao;

import java.util.Collection;

import example.jdbc.bean.Restaurant;

public interface DaoInterface<T, K> {
     //A method to retrieve all records

	Collection<T> retrieveAll();

	// A method to retrieve a single record based on it's identity
	T retrieveOne(K key);
	
	
  //A method to insert a new record
	void create (T t);
	//A method to update an existing record
	void update (T t);
	
	//A method to delete an existing record
	void delete (K Key);

	
	

}
