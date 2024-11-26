package example.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

	// This is a utility class for obtaining a Connection and returning the same .
	public static Connection geConnection() throws Exception {
		// Here, 'Class.forName()' is not used because it is not needed.
		// The driver gets loaded automatically.

		String url = "jdbc:mysql://localhost:3306/zomato";
		String uid = "root";
		String pwd = "password";
		Connection dbConnection = DriverManager.getConnection(url, uid, pwd);

		return dbConnection;

	}

	public static void main(String[] args) {

	}

}