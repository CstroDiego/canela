package mx.itson.canela.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * Contiene los valores de Dificultad.
 */
public enum Dificultad {
    /**
     * Dificultad de receta facil.
     */
    @SerializedName("1")
    FACIL,
    /**
     * Dificultad de receta media.
     */
    @SerializedName("2")
    INTERMEDIO,
    /**
     * Dificultad de receta dificil.
     */
    @SerializedName("3")
    DESAFIANTE
}

