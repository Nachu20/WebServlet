
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.SQLException;

	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import jakarta.servlet.http.HttpSession;
	@WebServlet("/login")
	public class login1 extends HttpServlet {
		
			public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
				res.setContentType("text/html");
				//res.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//is used to prevent from access the old page from logging out it.
				PrintWriter out=res.getWriter();
				String email=req.getParameter("email1");
				String pass=req.getParameter("password1");
				//req.getSession(true).setAttribute("u_name", req.getParameter("u_name"));
				System.out.println(email);
				System.out.println(pass);
				login d=new login();
				try {
					if(d.DB(email, pass)) {
						System.out.println("success");
						res.sendRedirect("");
					}
					else {
						out.println("Not Successful");
					}
				} catch (ClassNotFoundException | SQLException | IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Not Found");
				}		
			} 
			
	}
