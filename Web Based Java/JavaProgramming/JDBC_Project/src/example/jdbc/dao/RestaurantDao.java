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
		
		Collection<Restaurant>allRestaurants=new ArrayList<Restaurant>();// Creating an empty arrayList
		String sqlQuery ="select * from restaurant_master";
		
		try(
		 
				//Opening the resources using try with resources so that the get 
			Connection conn =JdbcUtils.geConnection();
			Statement stmt =conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery); )
		{
			while(rs.next())
			{
				int restaurantId = rs.getInt(1);
				String restaurantName = rs.getString(2);
				 int branchCount=rs.getInt(4);
				 String restaurantCuisine=rs.getString(3);
				 
				 
				 //Building Java object (Restaurant) based upon these values
				 Restaurant rst=new Restaurant(restaurantId,restaurantName,restaurantCuisine,branchCount);
				//Adding this object (Restaurant) into the ArrayList.
				 allRestaurants.add(rst);
				}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		return allRestaurants;
	}
		return allRestaurants;

	}
	
	
	public Restaurant retrieveOne(Integer id)
	{
		
		Restaurant foundRestaurant=null;
		
		String sqlQuery= "select * from restaurant_master where rest_id=?";
		
		try(
				Connection conn =JdbcUtils.geConnection();
				PreparedStatement pstmt =conn.prepareStatement(sqlQuery);
				
				)
		{
			pstmt.setInt(1, id);
			ResultSet rs =pstmt.executeQuery();
			
			if(rs.next())
			{
				int restaurantId = rs.getInt(1);
				String restaurantName = rs.getString(2);
				 int branchCount=rs.getInt(4);
				 String restaurantCuisine=rs.getString(3);
				//Building Java object (Restaurant) based upon these values
				 foundRestaurant =new Restaurant(restaurantId,restaurantName,restaurantCuisine,branchCount);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return foundRestaurant;
	}
	}
