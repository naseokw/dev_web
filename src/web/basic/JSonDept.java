package web.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

//어떻게 서블릿(자바)을 브라우저에서 호출할 수 있을까?
//어떻게 URL로 요청을 할 수 있나?
@WebServlet(urlPatterns = "/dept.nhn")
public class JSonDept extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json;charset=utf-8");
		PrintWriter out      = res.getWriter();
		List<Map<String, Object>> dname = new ArrayList<>();
		int i = 0;
		Map<String, Object> rmap = new HashMap<>();
		rmap.put("deptno", 11);
		rmap.put("dname", "개발1팀");
		rmap.put("loc", "제주");
		dname.add(i++, rmap);

		rmap = null;
		rmap = new HashMap<>();
		rmap.put("deptno", 21);
		rmap.put("dname", "운영팀");
		rmap.put("loc", "괌");
		dname.add(i++, rmap);

		rmap = null;
		rmap = new HashMap<>();
		rmap.put("deptno", 31);
		rmap.put("dname", "형상관리팀");
		rmap.put("loc", "서울");
		dname.add(i++, rmap);
		Gson g = new Gson();
		String imsi = g.toJson(dname);
		System.out.println(imsi);
		out.println(imsi);
	}
}
