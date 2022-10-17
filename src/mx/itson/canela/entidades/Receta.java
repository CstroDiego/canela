package mx.itson.canela.entidades;

import com.google.gson.Gson;
import mx.itson.canela.enumeradores.Dificultad;

import java.util.List;

public class Receta {
    private String nombre; //
    private String descripcion; //
    private int numeroPorciones; //
    private int tiempo; //
    private List<Ingrediente> ingredientes; //
    private List<Paso> pasos;
    private Dificultad dificultad;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroPorciones() {
        return numeroPorciones;
    }

    public void setNumeroPorciones(int numeroPorciones) {
        this.numeroPorciones = numeroPorciones;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Paso> getPasos() {
        return pasos;
    }

    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

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
