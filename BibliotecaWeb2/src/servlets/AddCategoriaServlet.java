package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CategoriaDAO;
import utils.CategoriaList;

public class AddCategoriaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCategoriaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


/**
 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
 */
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub

    int codcategoria = Integer.parseInt(request.getParameter("codcategoria"));
    String descricao = request.getParameter("descricao");


    CategoriaDAO categoriaDAO = new CategoriaDAO();
    CategoriaList categoria = new CategoriaList(codcategoria, descricao);
    categoriaDAO.addCategoria(categoria);
}
}
