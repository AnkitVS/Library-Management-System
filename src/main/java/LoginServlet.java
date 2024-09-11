

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private String password,userid;
	private PreparedStatement pstm; 
	private ResultSet rs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		password = request.getParameter("password");
		userid = request.getParameter("userId");
		
		response.setContentType("text/html");
		PrintWriter write = response.getWriter();
		Connection con = DBConnection.createConnection();
		
		if(con == null) {
			write.print("Connection Failed");
			return;
		}
		
		try {
			if(!con.isClosed()) {
				pstm = con.prepareStatement("Select * from user where userid=? and password=?");
				
				pstm.setString(1,userid);
				pstm.setString(2, password);
				
				rs=pstm.executeQuery();
				if(rs.next()) {
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		write.print("Password:"+password+"\nUuserid:"+userid);
	}
	}
