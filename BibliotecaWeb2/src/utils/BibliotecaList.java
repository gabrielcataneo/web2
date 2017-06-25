package utils;

public class BibliotecaList {
    
	public int codbib;
	public String nome;
	public String endereco;

public BibliotecaList (int codbib, String nome, String endereco)
{
	this.codbib = codbib;
	this.nome = nome;
	this.endereco = endereco;
}

public int getCodbib() {
	return codbib;
}

public void setCodbib(int codbib) {
	this.codbib = codbib;
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

}