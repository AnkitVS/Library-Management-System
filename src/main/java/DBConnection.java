import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnection {
	static Connection createConnection() {
		Connection connection = null;
		try {
			//Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymgmtsys","root","MyNewPass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
