package test;

import java.io.PrintStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="myservlet"
	,value={"/myservlet"})
public class MyServlet extends HttpServlet{
	public void service(HttpServletRequest request,
		HttpServletResponse response)
	throws ServletException,java.io.IOException{
		request.setCharacterEncoding("utf8");
		response.setContentType("text/html;charset=utf8");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String room=request.getParameter("room");
		PrintStream out=new PrintStream(response.getOutputStream());
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet test page!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("your name:"+name+"<hr />");
		out.println("your sex :"+sex+"<hr />");
		out.println("your room:"+room+"<hr />");
		out.println("</body>");
		out.println("</html>");
	}
}