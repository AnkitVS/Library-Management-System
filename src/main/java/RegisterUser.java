

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterUser extends HttpServlet {

	private PreparedStatement pstm; private ResultSet rs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = DBConnection.createConnection();
		
		try {
			if(!con.isClosed()) {
				String role = request.getParameter("role");
				
				String userid;
				if(role.equals("Admin")) {
					userid = "Chief"+request.getParameter("firstName").substring(0, 1) + request.getParameter("lastName").substring(0,1)+(int)Math.random()*1000;
				}else if(role.equals("Librarian")) {
					userid = "Guardian"+request.getParameter("firstName").substring(0, 1) + request.getParameter("lastName").substring(0,1)+(int)Math.random()*1000;
				}else if(role.equals("User")) {
					userid = "Explorer"+request.getParameter("firstName").substring(0, 1) + request.getParameter("lastName").substring(0,1)+(int)Math.random()*1000;
				}
				
				
				pstm = con.prepareStatement("Insert into user values(?,?,?,?,?,?)");
				
				pstm.setString(1,userid);
				pstm.setString(2,request.getParameter("firstName"));
				pstm.setString(3,request.getParameter("lastName"));
				pstm.setString(4,request.getParameter("password"));
				pstm.setString(5,request.getParameter("email"));
				pstm.setString(6,role);
				
				if(pstm.executeUpdate()==1) {
					response.setParameter();				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
