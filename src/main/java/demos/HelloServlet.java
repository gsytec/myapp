package demos;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloServlet extends HttpServlet {
 

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
   
      response.setContentType("text/html");


      PrintWriter out = response.getWriter();
      out.println("<hr/>");
      out.println("Hello Welcome to the servlet world!!!");
      out.println("<hr/>");
  }
  
}