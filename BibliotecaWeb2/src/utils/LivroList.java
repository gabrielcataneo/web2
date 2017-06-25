package utils;

public class LivroList {
    
	public int codlivro;
	public String titulo;
	public String editora;
	public String valor;
	public int codcategoria;
	public int codbib;
	public boolean Situacao;
	
	public LivroList (int codlivro, String titulo, String editora, String valor, int codcategoria, int codbib, boolean Situacao)
	{
		this.codlivro = codlivro;
		this.titulo = titulo;
		this.editora = editora;
		this.valor = valor;
		this.codcategoria = codcategoria;
		this.codbib = codbib;
		this.Situacao = Situacao;
	}

	public int getCodlivro() {
		return codlivro;
	}

	public void setCodlivro(int codlivro) {
		this.codlivro = codlivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public int getCodcategoria() {
		return codcategoria;
	}

	public void setCodcategoria(int codcategoria) {
		this.codcategoria = codcategoria;
	}

	public int getCodbib() {
		return codbib;
	}

	public void setCodbib(int codbib) {
		this.codbib = codbib;
	}

	public boolean isSituacao() {
		return Situacao;
	}

	public void setSituacao(boolean situacao) {
		Situacao = situacao;
	}

}
