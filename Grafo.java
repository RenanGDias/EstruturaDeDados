import java.util.Arrays;

public class Grafo {
    private int numVertices;
    private int[][] matrizAdjacencia;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        matrizAdjacencia = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            Arrays.fill(matrizAdjacencia[i], 0);
        }
    }

    public void adicionarAresta(int origem, int destino, int peso) {
        matrizAdjacencia[origem][destino] = peso;
        matrizAdjacencia[destino][origem] = peso;
    }

    public void mostrarMatrizAdjacencia() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}
