package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.BibliotecaDAO;
import utils.BibliotecaList;


public class CadastrarBibliotecaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarBibliotecaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


/**
 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
 */
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub

    int codbib = Integer.parseInt(request.getParameter("codbib"));
    String nome = request.getParameter("nome");
    String endereco = request.getParameter("endereco");


    BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
    BibliotecaList biblioteca = new BibliotecaList(codbib, nome, endereco);
    bibliotecaDAO.cadastrarBiblioteca(biblioteca);
}
}
