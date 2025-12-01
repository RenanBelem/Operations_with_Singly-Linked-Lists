public class Header{
	private Celula primeiro;
	private Celula ultimo;
	
	public Header() {
		this.primeiro = null;
		this.ultimo = null;
	}

  public boolean vazia() {
		return this.primeiro == null || this.ultimo == null;
	}
  
  public Celula getPrimeiro() {
		return this.primeiro;
	}

  public Celula getUltimo() {
		return this.ultimo;
	}

  public void inserePrimeiro(Celula novaCelula) {
    if(!this.vazia()){
      novaCelula.setProximo(this.primeiro); 
    }
    this.primeiro = novaCelula;
	}

  public void insereUltimo(Celula novaCelula) {
    if(!this.vazia()){
      this.ultimo.setProximo(novaCelula);
    }
    this.ultimo = novaCelula;
	}

  public void insereDepois(Celula celulaAnterior, Integer conteudo) {
    Celula newDepois = new Celula(conteudo);
    newDepois.setProximo(celulaAnterior.getProximo());
    celulaAnterior.setProximo(newDepois);
	}

  public void insereOrdenado(Integer conteudo) {
    Celula newCelula = new Celula(conteudo);
    if(this.vazia()){
      this.inserePrimeiro(newCelula);
      this.insereUltimo(newCelula);
    } else if(conteudo <= this.primeiro.getConteudo()){
      this.inserePrimeiro(newCelula);
    } else if(conteudo >= this.ultimo.getConteudo()){
      this.insereUltimo(newCelula);
    } else{
      Celula celula = this.primeiro;
      while (celula.getProximo() != null){
        if(conteudo <= celula.getProximo().getConteudo()){
          this.insereDepois(celula, conteudo);
          break;
        }
        celula = celula.getProximo();
      }
    }
	}

  public void mostrarLista() {
    if(this.vazia()){
      System.out.println("Lista vazia!");
    }
    Celula celula = this.primeiro;
    while (celula != null){
        System.out.println(celula.getConteudo());
        celula = celula.getProximo();
      }
	}

  public Integer removePrimeiro() {
    if(this.vazia()){
      System.out.println("Não pode remover. Lista vazia!");
      return null;
    } else if(this.primeiro == this.ultimo){
      this.primeiro = null;
      this.ultimo = null;
      return null;
    } else {
      this.primeiro = this.primeiro.getProximo();
      return this.primeiro.getConteudo();
    }
	}

  public Integer removeUltimo() {
    if(this.vazia()){
      System.out.println("Não pode remover. Lista vazia!");
      return null;
    } else if(this.primeiro == this.ultimo){
      this.primeiro = null;
      this.ultimo = null;
      return null;
    } else {
      Celula celula = this.primeiro;
      Celula celulaAnterior = null;
      while(celula.getProximo() != null){
        celulaAnterior = celula;
        celula = celula.getProximo();
      }
      this.ultimo = celulaAnterior;
      return this.ultimo.getConteudo();
    }
	}

  public Integer removeDepois(Celula celula) {
    Celula proximo = celula.getProximo();
    celula.setProximo(proximo.getProximo() != null? proximo.getProximo(): null);
    return celula.getConteudo();
	}
}
