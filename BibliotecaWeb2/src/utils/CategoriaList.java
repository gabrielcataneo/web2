package utils;

public class CategoriaList {
    
	public int codcategoria;
	public String descricao;

public CategoriaList (int codcategoria, String descricao)
	{
		this.codcategoria = codcategoria;
		this.descricao = descricao;
	}

public int getCodcategoria() {
	return codcategoria;
}

public void setCodcategoria(int codcategoria) {
	this.codcategoria = codcategoria;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

}