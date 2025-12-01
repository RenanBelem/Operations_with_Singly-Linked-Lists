import java.util.Scanner;

class Main {
  public static void main(String[] args) {  
    OperacoesComListas operacoesComListas = new OperacoesComListas();
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantas listas você deseja informar? ");
    Integer numListas = scanner.nextInt();
    Header[] headerList = new Header[numListas];

    Integer valor;
    
    for(int i = 0; i < numListas; i++){    
      System.out.println("=======");
      System.out.println("Começando lista " + (i + 1));

      Header header = new Header();
      
      while(true){
        System.out.println("Insira um valor para adicionar na lista: ");
        valor = scanner.nextInt();
  
        header.insereOrdenado(valor);
  
        System.out.println("Deseja continuar? 1 - Sim, 0 - Não ");
        if(scanner.nextInt() == 0){
          break;
        }
      }

      headerList[i] = header;    
    }

    System.out.println("=======");
    System.out.println("Exibindo dados das listas: ");
    for(int i = 0; i < headerList.length; i++){
      System.out.println("Lista " + (i + 1));
      headerList[i].mostrarLista();
    }

    // calculando a similaridade
    if(headerList.length >= 2){
      System.out.println("Você deseja calcular a similaridade entre as listas? 1 - Sim, 0 - Não");
      if(scanner.nextInt() == 1){
        for(int i = 0; i < (headerList.length - 1); i++){
          System.out.println("=======");
          System.out.println("O calculo de similaridade entre as listas (" + (i + 1) + ") e (" + (i + 2) + ") é:" );
          System.out.println(
             operacoesComListas.calculoDeSimilaridadde(
               headerList[i], headerList[i+1]
             )
           );
        }
      }

      System.out.println("Você deseja fazer a intersecção entre as listas? 1 - Sim, 0 - Não");
      if(scanner.nextInt() == 1){
        for(int i = 0; i < (headerList.length - 1); i++){
           Header interseccao = operacoesComListas.interseccao(
               headerList[i], headerList[i+1]
             );
          
          System.out.println("=======");
          System.out.println("A intersecção entre as listas (" + (i + 1) + ") e (" + (i + 2) + ") é:" );
          interseccao.mostrarLista();
        }
      }
    }

  }
}