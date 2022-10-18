package mx.itson.canela.entidades;

/**
 * Contiene los métodos y atributos de la clase Ingrediente.
 *
 * @author Diego Castro Arce
 */
public class Usuario {
    private String nombre;
    private String correoElectronico;
    private String contrasena;

    /**
     * Obtiene el valor del atributo nombre.
     *
     * @return El atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el valor del atributo nombre.
     *
     * @param nombre El valor a asignar a nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor del atributo correoElectronico.
     *
     * @return El atributo correoElectronico.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Asigna el valor del atributo correoElectronico.
     *
     * @param correoElectronico El valor a asignar a correoElectronico.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene el valor del atributo contrasena.
     *
     * @return El atributo contrasena.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Asigna el valor del atributo contrasena.
     *
     * @param contrasena El valor a asignar a contrasena.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
