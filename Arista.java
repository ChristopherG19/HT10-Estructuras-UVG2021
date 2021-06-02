public class Arista {
    private Nodo origen;
    private Nodo destino;
    private double distancia;
 
    public Arista(Nodo origen, Nodo destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }
 
    public Nodo getOrigin() {
        return origen;
    }
 
    public void setOrigin(Nodo origen) {
        this.origen = origen;
    }
 
    public Nodo getDestination() {
        return destino;
    }
 
    public void setDestination(Nodo destino) {
        this.destino = destino;
    }
 
    public double getDistance() {
        return distancia;
    }
 
    public void setDistance(double distancia) {
        this.distancia = distancia;
    }
 
    @Override
    public String toString() {
        return "\n Aristas [Origen=" + origen.getCity() + ", destino=" + destino.getCity() + ", distancia="
                + distancia + "]";
    }
 
}