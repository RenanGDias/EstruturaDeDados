package trabalho_grafo;

import java.util.List;

public class MainBuscaEmProfundidade {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(6);

        grafo.adicionarArestaLista(0, 1);
        grafo.adicionarArestaLista(0, 2);
        grafo.adicionarArestaLista(1, 3);
        grafo.adicionarArestaLista(1, 4);
        grafo.adicionarArestaLista(3, 5);

        int inicio = 0;
        int destino = 5;

        List<Integer> caminho = grafo.buscarCaminhoDFS(inicio, destino);

        if (caminho != null) {
            System.out.println("Caminho entre os vértices " + inicio + " e " + destino + ": " + caminho);
        } else {
            System.out.println("Não há caminho entre os vértices " + inicio + " e " + destino);
        }
    }
}
