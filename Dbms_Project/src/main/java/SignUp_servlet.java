import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class SignUp_servlet extends HttpServlet{
		
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		String buttonClicked = req.getParameter("button");

	    if (buttonClicked.equals("SIGN UP")) {
	    	//System.out.print("1");
	        res.sendRedirect("signup.html");
	        
	    } else if(buttonClicked.equals("LOG IN")) {
	        res.sendRedirect("login.html");
	    }
	    else {
	    	;
	    }
	}	
}
