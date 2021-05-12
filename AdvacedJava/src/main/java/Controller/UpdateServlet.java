package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ListPersonsDao;
import model.Persons;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */ListPersonsDao pdao;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 pdao = new ListPersonsDao ();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        List<Persons> list = pdao.listPersons();
        pw.println("<html><head><style type=text/css>");
        pw.println("table{ width:50%;border-collapse:collapse;");
        pw.println("background-color:wheat;border-spacing:10px;}");
        pw.println("table,tr,td { border:1px solid blue;}");
        pw.println("th,td {padding:20px;}");
        pw.println("</style></head><body>");
        pw.println("<form action=#>");
        
        pw.println("<h1 style= background-color:maroon;color:white;");
        pw.println("text-align:center;>List Persons</h1>");
        pw.println("<table align=center>");
        pw.println("<tr>");
        for(Persons p : list) {
            int num = p.getPid();
            pw.println("<td>" +num+"</td>");
            pw.println("<td>" +p.getEname()+"</td>");
            pw.println("<td>" +p.getContactno()+"</td>");
            pw.println("<td>" +p.getEmail()+"</td>");
            pw.println("<td>" +p.getGender()+"</td>");
            pw.println("<td>" +p.getAddress()+"</td>");
            pw.println("<td><a href=DelServlet?n0="+num+">Update</a>/td>");
            pw.println("</tr>");
        }
        pw.println("</table></form></body></html>");
    }

 
		
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
