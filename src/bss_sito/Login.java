package bss_sito;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/sito/LoginBack")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		response.setContentType("text/html");  
	          
	    String n=request.getParameter("username");  
	    String p=request.getParameter("userpass");  
	          
	    if(n.contentEquals("Vincenzo") && p.contentEquals("admin")){  
	    	//System.out.println("bene : " + n + ":" + p);
	    	request.setAttribute("name", n);
	        RequestDispatcher rd=request.getRequestDispatcher("HomeUtente.jsp?utente="+n);  
	        rd.forward(request,response);  
	    }  
	    else{
	    	//System.out.println("Male : " + n + ":" + p);
	        RequestDispatcher rd=request.getRequestDispatcher("Errore.jsp");  
	        rd.include(request,response);  
	    }  
	          
	      
		
		
		
		
	}

}
