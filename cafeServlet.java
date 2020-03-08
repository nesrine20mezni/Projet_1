package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cafeServlet
 */
@WebServlet("/cafeServlet")
public class cafeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cafeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String r1=request.getParameter("r1");
		String texta=request.getParameter("texta");
		PrintWriter out=response.getWriter();
		
		out.println("<html><head>");
		out.println("<title>coffe</title>");
		out.println("<body><img src='img.jpg' height='100px' width='100px' </br> ");
		out.println("<p>merci de nous avoir fait parvenir la remarque suivante concernant</p> ");
		out.println("<b>"+r1+"</b>");
		out.println("<p>"+texta);
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
