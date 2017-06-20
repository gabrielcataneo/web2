package modeloUsuario;

public class Usuario {
	
	private int codmatricula;
	private String nome;
	private String endereco;
	private String Situacao;
	public int getCodmatricula()
	
	{
		return codmatricula;
	}
	public void setCodmatricula(int codmatricula) {
		this.codmatricula = codmatricula;
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
	public String getSituacao() {
		return Situacao;
	}
	public void setSituacao(String situacao) {
		Situacao = situacao;
	}

}

