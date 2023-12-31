package trabalho_grafo;

import java.util.*;

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

    public List<Integer> buscarCaminhoBFS(int inicio, int destino) {
        boolean[] visitado = new boolean[numVertices];
        int[] pai = new int[numVertices];
        Arrays.fill(pai, -1);

        Queue<Integer> fila = new LinkedList<>();
        fila.add(inicio);
        visitado[inicio] = true;

        while (!fila.isEmpty()) {
            int vertice = fila.poll();

            for (int adjacente : listaAdjacencia[vertice]) {
                if (!visitado[adjacente]) {
                    fila.add(adjacente);
                    visitado[adjacente] = true;
                    pai[adjacente] = vertice;

                    if (adjacente == destino) {
                        // Encontrou o destino, construa e retorne o caminho
                        List<Integer> caminho = new ArrayList<>();
                        while (adjacente != -1) {
                            caminho.add(adjacente);
                            adjacente = pai[adjacente];
                        }
                        Collections.reverse(caminho);
                        return caminho;
                    }
                }
            }
        }

        // Não há caminho entre os vértices
        return null;
    }

    public List<Integer> buscarCaminhoDFS(int inicio, int destino) {
        boolean[] visitado = new boolean[numVertices];
        int[] pai = new int[numVertices];
        Arrays.fill(pai, -1);

        Stack<Integer> pilha = new Stack<>();
        pilha.push(inicio);
        visitado[inicio] = true;

        while (!pilha.isEmpty()) {
            int vertice = pilha.pop();

            for (int adjacente : listaAdjacencia[vertice]) {
                if (!visitado[adjacente]) {
                    pilha.push(adjacente);
                    visitado[adjacente] = true;
                    pai[adjacente] = vertice;

                    if (adjacente == destino) {
                        // Encontrou o destino, construa e retorne o caminho
                        List<Integer> caminho = new ArrayList<>();
                        while (adjacente != -1) {
                            caminho.add(adjacente);
                            adjacente = pai[adjacente];
                        }
                        Collections.reverse(caminho);
                        return caminho;
                    }
                }
            }
        }

        // Não há caminho entre os vértices
        return null;
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