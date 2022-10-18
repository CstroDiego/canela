package mx.itson.canela.entidades;

/**
 * Contiene los métodos y atributos de la clase Ingrediente.
 *
 * @author Diego Castro Arce
 */
public class Paso {
    private String descripcion;
    private int orden;

    /**
     * Obtiene el valor del atributo descripcion.
     *
     * @return El atributo descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna el valor del atributo descripcion.
     *
     * @param descripcion El valor a asignar a descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el valor del atributo orden.
     *
     * @return El atributo orden.
     */
    public int getOrden() {
        return orden;
    }

    /**
     * Asigna el valor del atributo orden.
     *
     * @param orden El valor a asignar a orden.
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }
}
