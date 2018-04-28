

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Eight
 */
@WebServlet("/Eight")
public class Eight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean bool=false;
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String salary=request.getParameter("salary");
        String tax=request.getParameter("tax");
        PrintWriter out=response.getWriter();
        File file = new File("G:/Songs/1.txt");
       bool = file.createNewFile();
        FileOutputStream fout = new FileOutputStream(file);
        out.println(""+name+gender+salary+tax+bool);
        fout.write(("hello"+name+gender+salary+tax).getBytes());
        fout.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
