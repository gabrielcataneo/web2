package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.AlunoDAO;
import utils.AlunoList;

@WebServlet("/CadastrarAlunoServlet")

public class CadastrarAlunoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarAlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
}

/**
 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
 */
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub

    int codmatricula = Integer.parseInt(request.getParameter("codmatricula"));
    String nome = request.getParameter("nome");
    String endereco = request.getParameter("endereco");


    AlunoDAO alunoDAO = new AlunoDAO();
    AlunoList aluno = new AlunoList(codmatricula, nome, endereco, true);
    alunoDAO.cadastrarAluno(aluno);
}
}
