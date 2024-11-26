package example.jdbc;

import java.util.Collection;

import example.jdbc.bean.Restaurant;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurantDao;

public class RetrieveAllUsingDaoExample {

	public static void main(String[] args) {
	
		DaoInterface<Restaurant, Integer> daoRef=
				new RestaurantDao();
		daoRef.retrieveAll();
		Collection<Restaurant>allAvailaRestaurants=daoRef.retrieveAll();
		for(Restaurant currentRestaurant :allAvailaRestaurants )
		System.out.println(currentRestaurant);
		System.out.println("************************************************************");
		allAvailaRestaurants.stream().
	   forEach(rst -> System.out.println(rst)); 

	}

}
