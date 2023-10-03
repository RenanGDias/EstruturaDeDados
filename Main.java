public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);

        grafo.adicionarAresta(0, 1, 1);
        grafo.adicionarAresta(0, 2, 1);
        grafo.adicionarAresta(1, 3, 1);
        grafo.adicionarAresta(2, 4, 1);

        System.out.println("Matriz de Adjacência do Grafo:");
        grafo.mostrarMatrizAdjacencia();
    }
}
