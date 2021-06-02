/*
 * Universidad del Valle de Guatemala
 * Estructura de datos - Sección 10
 * Christopher García - 20541
 * HT10: Algoritmo de Floyd y grafos
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnitGrafos {
    
    /*
     * Test#1: Se agregan nodos al grafo y se comprueba que este no se encuentre vacío
     * Se espera que al principio este grafo este vacío y al final se imprime el grafo con las
     * ciudades agregadas y si en dado caso pasa esto es porque el test si funcionó correctamente
     * 
     * Debido a que el grafo no tiene más métodos, este método de agregar es el único que se puede verificar
     */
    @Test
    public void AddNodes(){
        Grafo grafo = new Grafo();
        System.out.println("Inicio de la prueba");
        System.out.println(grafo);

        assertEquals(grafo.isEmpty(), true);

        System.out.println("-----------------");
        System.out.println("Se agregaran algunos nodos");
        Nodo Mixco = new Nodo("Mixco");
        Nodo Antigua = new Nodo("Antigua");
        Nodo Escuintla = new Nodo("Escuintla");

        Mixco.addEdge(new Arista(Mixco, Antigua, 30));
        Antigua.addEdge(new Arista(Antigua, Escuintla, 25));

        grafo.addNode(Mixco);
        grafo.addNode(Antigua);
        grafo.addNode(Escuintla);

        assertEquals(grafo.isEmpty(), false);
        System.out.println(grafo);

    }

}
