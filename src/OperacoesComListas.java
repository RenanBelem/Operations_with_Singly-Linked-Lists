public class OperacoesComListas{
  
	public Double calculoDeSimilaridadde(Header lista1, Header lista2) {
		Celula celula1 = lista1.getPrimeiro();
    int countLista1 = 0;
    while(celula1 != null){
      countLista1++;
      celula1 = celula1.getProximo();
    }

    Celula celula2 = lista2.getPrimeiro();
    int countLista2 = 0;
    while(celula2 != null){
      countLista2++;
      celula2 = celula2.getProximo();
    }

    if(countLista1 == 0 || countLista2 == 0 || (countLista1 != countLista2)){
      return null;
    }

    int somaParteDeCima = 0;
    int somaParteDeBaixo1 = 0;
    int somaParteDeBaixo2 = 0;
    celula1 = lista1.getPrimeiro();
    celula2 = lista2.getPrimeiro();
    while(celula1 != null){
      somaParteDeCima += celula1.getConteudo() * celula2.getConteudo();
      somaParteDeBaixo1 += celula1.getConteudo() * celula1.getConteudo();
      somaParteDeBaixo2 += celula2.getConteudo() * celula2.getConteudo();
      
      celula1 = celula1.getProximo();
      celula2 = celula2.getProximo();
    }  
    
    return somaParteDeCima / Math.sqrt(somaParteDeBaixo1 * somaParteDeBaixo2);
	}

  public Header interseccao(Header lista1, Header lista2) {
		Header lista3 = new Header();
    
    Celula celula1 = lista1.getPrimeiro();
    int countLista1 = 0;
    while(celula1 != null){
      countLista1++;
      celula1 = celula1.getProximo();
    }

    Celula celula2 = lista2.getPrimeiro();
    int countLista2 = 0;
    while(celula2 != null){
      countLista2++;
      celula2 = celula2.getProximo();
    }

    if(countLista1 == 0 || countLista2 == 0){
      return lista3;
    }

    celula1 = lista1.getPrimeiro();
    while(celula1 != null){
      
      celula2 = lista2.getPrimeiro();
      while(celula2 != null){
        if(celula1.getConteudo() == celula2.getConteudo()){
          lista3.insereOrdenado(celula1.getConteudo());
        }
        celula2 = celula2.getProximo();
      }

      celula1 = celula1.getProximo();
    }
    
    return lista3;
	}
  
}
