package web.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//어떻게 서블릿(자바)을 브라우저에서 호출할 수 있을까?
//어떻게 URL로 요청을 할 수 있나?
@WebServlet(urlPatterns = "/hello")
public class HelloWeb extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException
	{
		PrintWriter out = res.getWriter();
		String mem_id = req.getParameter("mem_id");
		String mem_pw = req.getParameter("mem_pw");
		System.out.println("사용자가 입력한 ID : "+mem_id);
		System.out.println("사용자가 입력한 PW : "+mem_pw);
		out.println("<b>Hello Web Service!!!</b>");;
	}
}
