import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class login {
public boolean DB(String email,String pass) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");  
	//step2 create  the connection object  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/mysql1","root","Nachu2003");   
		  
		//step3 create the statement object  
		//Statement stmt=con.createStatement();  
		//step4 execute query  
		PreparedStatement ps=con.prepareStatement(  
				"select * from usesrlogin where EMAIL=? and PASSWORD=?");  
				ps.setString(1,email);  
				ps.setString(2,pass);  
				      
				ResultSet rs=ps.executeQuery();  
		if(rs.next()){
			return true;
		}
		else {
			return false;	
		}	
	}	

}
