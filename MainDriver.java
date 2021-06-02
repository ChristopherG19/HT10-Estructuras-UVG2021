/*

*/
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver{
    public static Grafo getCiudades() {

        //ArrayList<String> Archivo = leerArchivo("guategrafo.txt");
        //String oraciones = ArchivoToString(Archivo);
        //String[] Palabras = oraciones.split("\n");

        Nodo Mixco = new Nodo("Mixco");
        Nodo Antigua = new Nodo("Antigua");
        Nodo Escuintla = new Nodo("Escuintla");
        Nodo SantaL = new Nodo("Santa Lucia");
        Nodo Peten = new Nodo("Peten");
        Nodo Izabal = new Nodo("Izabal");
        Nodo Guatemala = new Nodo("Guatemala");
 
        Mixco.addEdge(new Arista(Mixco, Antigua, 30));
        Antigua.addEdge(new Arista(Antigua, Escuintla, 25));
        Antigua.addEdge(new Arista(Antigua, SantaL, 50));
        Escuintla.addEdge(new Arista(Escuintla, SantaL, 15));
        Guatemala.addEdge(new Arista(Guatemala, SantaL, 25));
        Peten.addEdge(new Arista(Peten, SantaL, 50));
        Izabal.addEdge(new Arista(Izabal, SantaL, 15));
        
        Grafo graph = new Grafo();
        graph.addNode(Mixco);
        graph.addNode(Antigua);
        graph.addNode(Escuintla);
        graph.addNode(Guatemala);
        graph.addNode(Peten);
        graph.addNode(Izabal);
        return graph;
    }

    public static void main(String[] args) {
        Grafo ciudades = getCiudades();
        System.out.println(ciudades);
    }

    /**
  * Método leerArchivo
  * Se lee el contenido del archivo y se guarda en un ArrayList
  * @param nombreArchivo: Recibe el nombre del archivo 
  * @return: Arraylist con las lineas del archivo
  */
  public static ArrayList<String> leerArchivo(String nombreArchivo){

    /**
    * Se crea un Arraylist que almacenara cada linea del archivo
    */
    ArrayList<String> Info = new ArrayList<String>();

    /**
    * Try-catch como medida de seguridad por si en dado caso el archivo no existe
    */ 
    try {

      /**
      * Se lee cada linea del archivo y se agrega al ArrayList
      */
      File Archivo = new File(nombreArchivo);
      Scanner Lector = new Scanner(Archivo);

      while(Lector.hasNextLine()){
        String Line = Lector.nextLine();
        Info.add(Line);
      }

      Lector.close();
    } catch (Exception e){
      System.out.println("Error! Archivo no encontrado");
      e.printStackTrace();
    }


    return Info;
  }

  /**
  * Método ArchivoToString
  * Se convierte en un String el ArrayList de un archivo
  * @param Lista: Arraylist que contiene las lineas de un archivo
  * @return Acumulador: String que contiene toda la información del archivo
  */
  public static String ArchivoToString(ArrayList<String> Lista){
    /**
    * String vacío para acumular las lineas del archivo
    */
    String Acumulador = "";
    
    /**
    * Por cada linea del Arraylist se agrega la misma al Acumulador con un salto de
    * linea 
    */
    for(String a: Lista){
      Acumulador += (a + "\n");
    }
    Acumulador = Acumulador.trim();
    return Acumulador;
  }
    
}