package utils;

public class FuncionarioList {
    
	public int codfunc;
	public String nome;
	public String endereco;
	public String telefone;
	public String salario;
	public int codbib;

	public FuncionarioList(int codfunc, String nome, String endereco, String telefone, String salario, int codbib)
	{
		this.codfunc = codfunc;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
		this.codbib = codbib;
	}

	public int getCodfunc() {
		return codfunc;
	}

	public void setCodfunc(int codfunc) {
		this.codfunc = codfunc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public int getCodbib() {
		return codbib;
	}

	public void setCodbib(int codbib) {
		this.codbib = codbib;
	}
	
	
	
}