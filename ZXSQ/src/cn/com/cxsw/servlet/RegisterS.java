package cn.com.cxsw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterS")
public class RegisterS extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sex=request.getParameter("sex");
		String name=request.getParameter("name");
		System.out.println("sex:"+sex+"，name:"+name);
		/*设置相应的头信息*/
		response.setHeader("Content-Type", "Content-Type=text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.write("注册成功");
		out.flush();
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
