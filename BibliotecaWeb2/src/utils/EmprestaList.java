package utils;

public class EmprestaList {
    
	public int codmatricula;
	public int codlivro;
	public boolean retirar;
	public String dtretirada;
	public String dtprevisao;
	public String dtentrega;


public EmprestaList(int codmatricula, int codlivro, boolean retirar, String dtretirada, String dtprevisao, String dtentrega)
{
	this.codmatricula = codmatricula;
	this.codlivro = codlivro;
	this.retirar = retirar;
	this.dtretirada = dtretirada;
	this.dtprevisao = dtprevisao;
	this.dtentrega = dtentrega;
}

public int getCodmatricula() {
	return codmatricula;
}

public void setCodmatricula(int codmatricula) {
	this.codmatricula = codmatricula;
}

public int getCodlivro() {
	return codlivro;
}

public void setCodlivro(int codlivro) {
	this.codlivro = codlivro;
}

public boolean isRetirar() {
	return retirar;
}

public void setRetirar(boolean retirar) {
	this.retirar = retirar;
}

public String getDtretirada() {
	return dtretirada;
}

public void setDtretirada(String dtretirada) {
	this.dtretirada = dtretirada;
}

public String getDtprevisao() {
	return dtprevisao;
}

public void setDtprevisao(String dtprevisao) {
	this.dtprevisao = dtprevisao;
}

public String getDtentrega() {
	return dtentrega;
}

public void setDtentrega(String dtentrega) {
	this.dtentrega = dtentrega;
}

}