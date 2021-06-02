/*
 *
 * Referencias obtenidas de https://devs4j.com/2017/11/24/implementa-un-grafo-de-ciudades-en-java/ 
 */

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private String ciudad;
    private List<Arista> aristas;
 
    public Nodo(String ciudad) {
        this.ciudad = ciudad;
    }
 
    public String getCity() {
        return ciudad;
    }
 
    public void setCity(String ciudad) {
        this.ciudad = ciudad;
    }
 
    public List<Arista> getEdges() {
        return aristas;
    }
 
    public void addEdge(Arista edge) {
        if (aristas == null) {
            aristas = new ArrayList<>();
        }
        aristas.add(edge);
    }
 
    @Override
    public String toString() {
        return "\n \tNodo [Ciudad=" + ciudad + ", aristas=" + aristas + "]";
    }
}