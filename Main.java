public class Main {
    public static void main(String[] args) {
        Grafo grafoLista = new Grafo(5);

        grafoLista.adicionarArestaLista(0, 1);
        grafoLista.adicionarArestaLista(0, 2);
        grafoLista.adicionarArestaLista(1, 3);
        grafoLista.adicionarArestaLista(2, 4);

        Grafo grafoMatriz = new Grafo(5);

        grafoMatriz.adicionarArestaMatriz(0, 1, 1);
        grafoMatriz.adicionarArestaMatriz(0, 2, 1);
        grafoMatriz.adicionarArestaMatriz(1, 3, 1);
        grafoMatriz.adicionarArestaMatriz(2, 4, 1);

        System.out.println("Lista de Adjacência do Grafo:");
        grafoLista.mostrarListaAdjacencia();
        System.out.println("\n\nMatriz de Adjacência do Grafo:");
        grafoMatriz.mostrarMatrizAdjacencia();
    }
}
