

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        String email = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(Validate.checkUser(email, pass)){
            RequestDispatcher rs = request.getRequestDispatcher("welcome.html");
            rs.forward(request, response);
        }
        else{
           out.println("Username or Password incorrect");
//           
        }
    }  
}
