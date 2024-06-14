package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CitaDentista
 */
@WebServlet("/Cita")
public class CitaDentista extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CitaDentista() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida= response.getWriter();
		salida.println(UtilidadesServlets.getCabecera("Cita Nueva"));
		
		salida.println("<p>Debe rellenar el formulario</p>");
		salida.println("<a href='cita.html'>ir a alta de Cita</a>");
		salida.println(UtilidadesServlets.getPie());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida= response.getWriter();
		String Dia= request.getParameter("dia");
		String Hora= request.getParameter("hora");
		String Nombre= request.getParameter("nombre");
		String Apellido= request.getParameter("apellido");
		String Centro= request.getParameter("centro");
		String Tipo= request.getParameter("tipo");
		
		salida.println(UtilidadesServlets.getCabecera("resultado del formulario"));
		
			salida.println("<h1>Resultado del formulario");
			salida.println("<p> Dia:"+ Dia + "<p>");
			salida.println("<p>Hora:"+ Hora + "<p>");
			salida.println("<p> Nombre:"+ Nombre + "<p>");
			 salida.println("<p>Apellido:"+  Apellido + "<p>");
			 salida.println("<p>Centro:"+  Centro + "<p>");
			 salida.println("<p>Tipo:"+  Tipo + "<p>");
			
			 
			 
			 
				 
			 
			 
			 
			 
			
			 salida.println(UtilidadesServlets.getPie());
			 
			 
			
	}

}
