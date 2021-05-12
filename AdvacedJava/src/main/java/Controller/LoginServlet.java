package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ListPersonsDao;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }
	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" ashok reddy");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name =request.getParameter("user");
		String upass = request.getParameter("upass");
		ListPersonsDao pdao = new ListPersonsDao();
		if(pdao.validate(name,upass)) {
			response.sendRedirect("/ListPerson");
			
			pw.println("<h1 style = color:green> valid user</h1>");
		}
		else
		{
			pw.println("<h1 style=color:red> Invalid User</h1>");
		}

	}
	}


