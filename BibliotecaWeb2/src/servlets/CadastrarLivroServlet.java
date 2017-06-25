package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.LivroDAO;
import utils.LivroList;

public class CadastrarLivroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarLivroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


/**
 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
 */
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub

    int codlivro = Integer.parseInt(request.getParameter("codlivro"));
    String titulo = request.getParameter("titulo");
    String editora = request.getParameter("editora");
    String valor = request.getParameter("valor");
    int codcategoria = Integer.parseInt(request.getParameter("codcategoria"));
    int codbib = Integer.parseInt(request.getParameter("codbib"));

    LivroDAO livroDAO = new LivroDAO();
    LivroList livro = new LivroList(codlivro, titulo, editora, valor, codcategoria, codbib, true);
    livroDAO.cadastrarLivro(livro);
}
}
