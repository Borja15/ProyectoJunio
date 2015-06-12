
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Borja Andrades
 */
public class Categoria {
    /**
     * Propiedad privada,array unidimensional que guarda distintos tipos de categorías de libros
     */
    private String[] categoriLibro = {"Fantasia","Misterio","Humor","Novela","Biografia"};
    /**
     * Arraylist para almacenar objetos
     */
    public static ArrayList<Libros> listaLibros = new ArrayList();
    /**
     * index para la posicion obtenida del jtextField
     */
    int indexposicion;
    /**
     * String que almacenara los cambios de array
     */
    String libroNuevo = "";
    /**
     * String que almacena una categoria que eligamos
     */
    String categoriaElegida= "";
    /**
     * Matriz para el escaparate
     */
    public static Libros[][] escaparate = new Libros[2][3];   
    
    /**
     * Metodo constructor (vacío)
     */
    public Categoria() {
        
    }
    
    /**
     * Metodo que mostrara todas las categorias de libros
     * @return Retorna valores String enumerados correspondientes a la categoria de los libros
     */
    public String mostrarArray(){
        String libro = "";
        for(int i=0;i<categoriLibro.length;i++){
            libro += (i+1);
            libro += " -- ";
            libro += categoriLibro[i] + "\n";
        }
        return libro;
    }
    
    /**
     * Metodo que mueve la posicion de la categoria del array,ademas,avisa en caso de no introducir correctamente un parametro
     * @param indexposicioninicial posicion inicial en el array
     * @param indexposicionfinal posicion final en el array
     */
    public void mover(int indexposicioninicial,int indexposicionfinal){
       this.indexposicion = indexposicioninicial;
       if(indexposicioninicial>categoriLibro.length || indexposicionfinal>categoriLibro.length){
            JOptionPane.showMessageDialog(null, "No se ha encontrado categoría con esa posición", "Atención", JOptionPane.WARNING_MESSAGE);
            libroNuevo = "";
        }else{
               if(indexposicionfinal<0){
                   JOptionPane.showMessageDialog(null, "No existe posicion a la que moverse", "Atención", JOptionPane.WARNING_MESSAGE); 
                   libroNuevo = "";
               }else{
                   libroNuevo = categoriLibro[indexposicionfinal]; 
                   categoriLibro[indexposicionfinal]=categoriLibro[indexposicioninicial];
                   categoriLibro[indexposicioninicial]=libroNuevo;
                   libroNuevo = "";
               }
           }
       
    }
    /**
     * Metodo string que devuelve el string de libronuevo
     * @return 
     */
    public String ToArray(){
        int posicionnueva = 0;
        for(int i=0;i<categoriLibro.length;i++){
            libroNuevo +=posicionnueva++;
            libroNuevo += " -- ";
            libroNuevo += categoriLibro[i] + "\n";
        }
        return libroNuevo;
    }

    /**
     * Metodo para devolver la categoria del libro
     * @param elemento int que indicara la posicion dentro del array de la categoria
     * @return categoria elegida dentro del array
     */
    public String devolverElementoArray(int elemento){
        categoriaElegida = categoriLibro[elemento];
        return categoriaElegida;
    }
    
    
    
    
}
