public class FilaEstatica {
    private int[] fila;
    private int tamanho;
    private int inicio;
    private int fim;
    private int quantidadeElementos;

    public FilaEstatica(int tamanho) {
        this.tamanho = tamanho;
        fila = new int[tamanho];
        inicio = 0;
        fim = -1;
        quantidadeElementos = 0;
    }

    // Adiciona um elemento na fila
    public void enfileirar(int elemento) {
        if (estaCheia()) {
            System.out.println("Fila está cheia! Não é possível enfileirar.");
            return;
        }
        fim = (fim + 1) % tamanho;
        fila[fim] = elemento;
        quantidadeElementos++;
    }

    // Remove um elemento da fila
    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila está vazia! Não é possível desenfileirar.");
            return -1;
        }
        int elementoRemovido = fila[inicio];
        inicio = (inicio + 1) % tamanho;
        quantidadeElementos--;
        return elementoRemovido;
    }

    // Verifica se a fila está cheia
    public boolean estaCheia() {
        return quantidadeElementos == tamanho;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return quantidadeElementos == 0;
    }

    // Retorna o elemento que está no início da fila
    public int frente() {
        if (estaVazia()) {
            System.out.println("Fila está vazia!");
            return -1;
        }
        return fila[inicio];
    }

    // Retorna o número de elementos na fila
    public int tamanhoFila() {
        return quantidadeElementos;
    }

    // Exibe todos os elementos da fila
    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("Fila está vazia!");
            return;
        }
        System.out.print("Elementos na fila: ");
        for (int i = 0; i < quantidadeElementos; i++) {
            int indice = (inicio + i) % tamanho;
            System.out.print(fila[indice] + " ");
        }
        System.out.println();
    }
}