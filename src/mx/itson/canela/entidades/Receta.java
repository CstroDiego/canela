package mx.itson.canela.entidades;

import com.google.gson.Gson;
import mx.itson.canela.enumeradores.Dificultad;

import java.util.List;

/**
 * Contiene los métodos y atributos de la clase Receta.
 *
 * @author Diego Castro Arce
 */
public class Receta {
    private String nombre; //
    private String descripcion; //
    private int numeroPorciones; //
    private int tiempo; //
    private List<Ingrediente> ingredientes; //
    private List<Paso> pasos;
    private Dificultad dificultad;
    private Usuario usuario;

    /**
     * Obtiene el valor del atributo nombre.
     *
     * @return El atributo nombre.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Asigna el valor del atributo nombre.
     *
     * @param usuario El valor a asignar a nombre.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

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
     * Obtiene el valor del atributo numeroPorciones.
     *
     * @return El atributo numeroPorciones.
     */
    public int getNumeroPorciones() {
        return numeroPorciones;
    }

    /**
     * Asigna el valor del atributo numeroPorciones.
     *
     * @param numeroPorciones El valor a asignar a numeroPorciones.
     */
    public void setNumeroPorciones(int numeroPorciones) {
        this.numeroPorciones = numeroPorciones;
    }

    /**
     * Obtiene el valor del atributo tiempo.
     *
     * @return El atributo tiempo.
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Asigna el valor del atributo tiempo.
     *
     * @param tiempo El valor a asignar a tiempo.
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Obtiene el valor del atributo ingredientes.
     *
     * @return El atributo ingredientes.
     */
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * Asigna el valor del atributo ingredientes.
     *
     * @param ingredientes El valor a asignar a ingredientes.
     */
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * Obtiene el valor del atributo pasos.
     *
     * @return El atributo pasos.
     */
    public List<Paso> getPasos() {
        return pasos;
    }

    /**
     * Asigna el valor del atributo pasos.
     *
     * @param pasos El valor a asignar a pasos.
     */
    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * Obtiene el valor del atributo dificultad.
     *
     * @return El atributo dificultad.
     */
    public Dificultad getDificultad() {
        return dificultad;
    }

    /**
     * Asigna el valor del atributo dificultad.
     *
     * @param dificultad El valor a asignar a dificultad.
     */
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * Utilizando la librería GSON, convierte un archivo JSON a un objeto de la clase Receta.
     *
     * @param contenido El contenido del archivo JSON.
     *
     * @return El objeto de la clase Receta.
     */
    public Receta deserealizar(String contenido) {
        Receta receta = new Receta();
        try {

            receta = new Gson().fromJson(contenido, Receta.class);
        } catch (Exception e) {
            System.out.println("Error al deserealizar la receta \n" + e.getMessage());
        }
        return receta;
    }
}
