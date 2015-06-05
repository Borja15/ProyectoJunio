
package Clases;

import static Clases.Categoria.listalibros;

/**
 *
 * @author Borja Andrades
 */
public class GestionLibros {
    /**
     * Nombre del libro
     */
    private String nombre;
    /**
     * Numero ISBN del libro
     */
    private int numero;
    /**
     * Boolean indicando si se encuentra disponible,por defecto,lo estara
     */
    private boolean disponible = true;
    /**
     * String con la categoria correspondiente del libro
     */
    private String categoria;
    /**
     * Metodo constructor vacío
     */
    public GestionLibros() {
    }

    /**
     * Metodo constructor con propiedades
     * @param nombre nombre del libro
     * @param numero numero ISBN
     * @param disponible disponibilidad del libro
     * @param categoria categoria del libro
     */
    public GestionLibros(String nombre, int numero, boolean disponible,String categoria) {
        this.nombre = nombre;
        this.numero = numero;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    /**
     * Metodo que retorna el nombre del libro
     * @return nombre del libro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que introduce el nombre a un libro
     * @param nombre nombre del libro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que retorna el numero ISBN del libro
     * @return numero ISBN del libro
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metodo que introduce el numero ISBN de  un libro
     * @param numero numero ISBN del libro
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Metodo que retorna la disponibilidad del libro
     * @return true(si) o false(no) para indicar su disponibilidad
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Metodo que introduce la disponibilidad de un libro
     * @param disponible disponibilidad (true/false) del libro
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Metodo que retorna la categoriad el libro
     * @return categoria del libro 
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo que introduce una categoria al libro
     * @param categoria categoria del libro
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
