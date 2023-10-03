import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grafo {
    private int numVertices;
    private int[][] matrizAdjacencia;
    private List<Integer>[] listaAdjacencia;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        //Código da matrizAdjacencia
        matrizAdjacencia = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            Arrays.fill(matrizAdjacencia[i], 0);
        }
        //Código da listaAdjacencia
        listaAdjacencia = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; ++i) {
            listaAdjacencia[i] = new ArrayList<>();
        }

    }

    public void adicionarArestaLista(int origem, int destino) {
        listaAdjacencia[origem].add(destino);
        listaAdjacencia[destino].add(origem); // Se o grafo for não direcionado
    }

    public void mostrarListaAdjacencia() {
        for (int i = 0; i < numVertices; ++i) {
            System.out.print("Vértice " + i + " está conectado a: ");
            for (Integer adjacente : listaAdjacencia[i]) {
                System.out.print(adjacente + " ");
            }
            System.out.println();
        }
    }


    public void adicionarArestaMatriz(int origem, int destino, int peso) {
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
