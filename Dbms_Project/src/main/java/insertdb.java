import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/insert")
public class insertdb extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	res.setContentType("text/html");
	//res.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//is used to prevent from access the old page from logging out it.
	PrintWriter out=res.getWriter();
	String u_name=req.getParameter("USERNAME");
	String email=req.getParameter("EMAIL");
	String Password=req.getParameter("PASSWORD");
	System.out.println(u_name);
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		//step2 create  the connection object  
		System.out.print("hgh");
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/mysql1","root","Nachu2003");  
		  
		//step3 create the statement object  
		//Statement stmt=con.createStatement();
		  PreparedStatement st = con.prepareStatement("insert into usesrlogin values(?,?,?)");

          st.setString(1, u_name);

          st.setString(2, email);

          st.setString(3, Password);
          
          int i = st.executeUpdate();
          if (i > 0) {

              out.println("You are successfully registered.....");

          }

      } catch (Exception ey) {

          System.out.println(ey);

      }

      out.close();

  }
}
