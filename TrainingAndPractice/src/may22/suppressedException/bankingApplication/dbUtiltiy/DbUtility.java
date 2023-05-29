package may22.suppressedException.bankingApplication.dbUtiltiy;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtility {

	public static Connection provideConnection(String url, String username, String password) throws Exception {
		try (Connection connection =  DriverManager.getConnection(url,username,password);){
			return connection;
		} catch (Exception e) {
			throw new Exception("i am facing problem in connection...");
		}
	}
}
