public class Celula {
	private Integer conteudo;
	private Celula proximo;
	
	public Celula(Integer conteudo) {
		this.conteudo = conteudo;
		this.proximo = null;
	}
  
  public Integer getConteudo() {
		return this.conteudo;
	}

  public void setConteudo(Integer conteudo) {
		this.conteudo = conteudo;
	}
	
	public Celula getProximo() {
		return this.proximo;
	}

  public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}
