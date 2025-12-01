## Operações com Listas Simplesmente Encadeadas em Java

Este conjunto de arquivos Java implementa uma **Lista Simplesmente Encadeada** e fornece classes para realizar operações avançadas, como **cálculo de similaridade** e **intersecção** de listas.


---

## 🔗 Estruturas de Dados

### `Celula.java` (Nó da Lista)

Esta classe representa um único elemento (ou nó) da Lista Simplesmente Encadeada.

* **Atributos:**
    * `conteudo`: Armazena o valor inteiro (`Integer`) do nó.
    * `proximo`: Uma referência para a próxima `Celula` na sequência.
* **Funcionalidade:**
    * Define o construtor, além dos métodos *getters* e *setters* para `conteudo` e `proximo`.

### `Header.java` (Cabeçalho da Lista)

Esta classe gerencia a lista encadeada, mantendo o controle das extremidades e fornecendo métodos para manipulação da estrutura.

* **Atributos:**
    * `primeiro`: Referência para o primeiro nó da lista.
    * `ultimo`: Referência para o último nó da lista.
* **Métodos Principais:**
    * `vazia()`: Verifica se a lista não contém elementos.
    * `inserePrimeiro()`, `insereUltimo()`, `insereDepois()`: Métodos auxiliares para inserção em posições específicas.
    * `insereOrdenado(Integer conteudo)`: Insere um novo valor na lista mantendo a ordem crescente.
    * `mostrarLista()`: Imprime todos os elementos da lista.
    * `removePrimeiro()`, `removeUltimo()`, `removeDepois()`: Métodos para remoção de elementos.

---

## 🔢 Operações Avançadas

### `OperacoesComListas.java`

Esta classe contém a lógica para executar operações matemáticas e de conjuntos em duas listas encadeadas (`lista1` e `lista2`) do tipo `Header`.

#### **1. Cálculo de Similaridade (Cosseno)**

O método `calculoDeSimilaridadde(Header lista1, Header lista2)` calcula a **Similaridade de Cosseno (Cosine Similarity)** entre duas listas, tratando-as como vetores.

* **Pré-requisitos:** O cálculo só é realizado se ambas as listas tiverem o mesmo número de elementos e não estiverem vazias. Se as contagens forem diferentes ou zero, retorna `null`.
* **Fórmula:** A similaridade de cosseno $S$ é calculada como:
    $$S = \frac{\sum_{i=1}^{n} (A_i \cdot B_i)}{\sqrt{\sum_{i=1}^{n} A_i^2} \cdot \sqrt{\sum_{i=1}^{n} B_i^2}}$$
    Onde $A_i$ e $B_i$ são os elementos correspondentes nas listas.

#### **2. Intersecção de Listas**

O método `interseccao(Header lista1, Header lista2)` cria uma nova lista (`lista3`) contendo apenas os elementos que estão presentes **em ambas** as listas de entrada.

* **Funcionamento:** Percorre `lista1` e, para cada elemento, percorre inteiramente a `lista2` para verificar a existência de uma correspondência. Os valores encontrados são inseridos de forma ordenada na lista resultante (`lista3`).

---

## ▶️ Execução

### `Main.java` (Classe Principal)

Esta classe é o ponto de entrada do programa, responsável por interagir com o usuário e demonstrar as funcionalidades.

* **Criação de Listas:** Solicita ao usuário o número de listas que ele deseja criar e, em seguida, permite a inserção interativa de valores para cada lista, garantindo que os valores sejam inseridos de forma ordenada.
* **Exibição:** Exibe os dados de todas as listas criadas.
* **Cálculo e Intersecção:** Se houver duas ou mais listas, o programa solicita ao usuário se ele deseja:
    1.  Calcular a similaridade entre pares de listas consecutivas (Lista 1 e 2, Lista 2 e 3, etc.).
    2.  Calcular a intersecção entre pares de listas consecutivas.

---
