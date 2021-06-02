import java.util.ArrayList;
import java.util.List;
 
/**
 * @author raidentrance
 *
 */
public class Grafo {
 
    private List<Nodo> nodos;
 
    public void addNode(Nodo nodo) {
        if (nodos == null) {
            nodos = new ArrayList<>();
        }
        nodos.add(nodo);
    }
 
    public List<Nodo> getNodes() {
        return nodos;
    }
 
    @Override
    public String toString() {
        return "Grafo [nodos=" + nodos + "]";
    }
}
