package utils;

public class AlunoList {
    
	public int codmatricula;
	public String nome;
	public String endereco;
    public boolean Situacao;

public AlunoList (int codmatricula, String nome, String endereco, boolean Situacao)
{
	this.codmatricula = codmatricula;
	this.nome = nome;
	this.endereco = endereco;
	this.Situacao = Situacao;
}

public int getCodmatricula() {
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

public boolean isSituacao() {
	return Situacao;
}

public void setSituacao(boolean situacao) {
	Situacao = situacao;
}
}