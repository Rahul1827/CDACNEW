package example.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import example.jdbc.bean.Restaurant;
import example.jdbc.utils.JdbcUtils;

public class RestaurantDao implements DaoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> retrieveAll() {
		/*
		 * This method connects to DB, fetches all records,converts them into java
		 * objects of Restaurant class, puts those objects into some Collections and
		 * returns the Collection
		 */

		Collection<Restaurant> allRestaurants = new ArrayList<Restaurant>();// Creating an empty arrayList
		String sqlQuery = "select * from restaurant_master";

		try (

				// Opening the resources using try with resources so that the get
				Connection conn = JdbcUtils.geConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);) {
			while (rs.next()) {
				int restaurantId = rs.getInt(1);
				String restaurantName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String restaurantCuisine = rs.getString(3);

				// Building Java object (Restaurant) based upon these values
				Restaurant rst = new Restaurant(restaurantId, restaurantName, restaurantCuisine, branchCount);
				// Adding this object (Restaurant) into the ArrayList.
				allRestaurants.add(rst);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return allRestaurants;
		}
		return allRestaurants;

	}

	public Restaurant retrieveOne(Integer id) {

		Restaurant foundRestaurant = null;

		String sqlQuery = "select * from restaurant_master where rest_id=?";

		try (Connection conn = JdbcUtils.geConnection(); PreparedStatement pstmt = conn.prepareStatement(sqlQuery);

		) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int restaurantId = rs.getInt(1);
				String restaurantName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String restaurantCuisine = rs.getString(3);
				// Building Java object (Restaurant) based upon these values
				foundRestaurant = new Restaurant(restaurantId, restaurantName, restaurantCuisine, branchCount);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return foundRestaurant;
	}

	@Override
	public void create(Restaurant newRestaurant) {
//	This method accepts a 'Restaurant' object: newRestaurant and
//	stores it as a record in the DB table
		String sqlQuery = "insert into restaurant_master values (?,?,?,?)";

		try (Connection conn = JdbcUtils.geConnection(); PreparedStatement pstmt = conn.prepareStatement(sqlQuery);

		) {
			// Extracting the values from Restaurant object: newRestaurant
			// Using getter methods.

			int restaurantId = newRestaurant.getRestaurantId();
			String restaurantName = newRestaurant.getName();
			String restaurantCuisine = newRestaurant.getCuisine();
			int restaurantBranchCount = newRestaurant.getBranchCount();

			// Substituting these values in place of '?' using PreparedStatement

			pstmt.setInt(1, restaurantId);
			pstmt.setString(2, restaurantName);
			pstmt.setString(3, restaurantCuisine);
			pstmt.setInt(4, restaurantBranchCount);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + "record inserted");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void update(Restaurant modifiedRestaurant) {
		// This method receives the modified state of the Restaurant
		// object: modifiedRestaurant and reflects that state into DB.

		String sqlQuery = "update restaurant_master set rest_name=? , rest_cuisine=?,rest_branch_count=? where rest_id=?";

		try (Connection conn = JdbcUtils.geConnection(); PreparedStatement pstmt = conn.prepareStatement(sqlQuery);

		) {
			// Capturing the modified state of Restaurant object:modifiedRestaurant
			// using getter method

			int restaurantId = modifiedRestaurant.getRestaurantId();
			String restaurantName = modifiedRestaurant.getName();
			String restaurantCuisine = modifiedRestaurant.getCuisine();
			int restaurantBranchCount = modifiedRestaurant.getBranchCount();

//Substituting these values in place of '?' using PreparedStatement

			pstmt.setInt(4, restaurantId);
			pstmt.setString(1, restaurantName);
			pstmt.setString(2, restaurantCuisine);
			pstmt.setInt(3, restaurantBranchCount);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + "record updated");

		} catch (Exception e) {
			//
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Integer id) {
		// This method performs record deletion against identity.
		String sqlQuery = "delete from restaurant_master where rest_id=?";

		try (Connection conn = JdbcUtils.geConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);

		) {
			
			
			pstmt.setInt(1, id);
			int deleteCount=pstmt.executeUpdate();
			System.out.println(deleteCount + "record deleted" );
			
					
		
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
