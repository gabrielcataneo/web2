package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DAO;
import utils.FuncionarioList;

@WebServlet("/CadastrarFuncionarioServlet")

public class CadastrarFuncionarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarFuncionarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
}

/**
 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
 */
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub

    int codfunc = Integer.parseInt(request.getParameter("codfunc"));
    String nome = request.getParameter("nome");
    String endereco = request.getParameter("endereco");
    String telefone = request.getParameter("telefone");
    String salario = request.getParameter("salario");
    int codbib = Integer.parseInt(request.getParameter("codbib"));


    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    FuncionarioList funcionario = new FuncionarioList(codfunc, nome, endereco, telefone, salario, codbib);
    funcionarioDAO.cadastrarFuncionario(funcionario);
}
}
