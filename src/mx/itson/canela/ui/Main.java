/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.enumeradores.Dificultad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setTiempo(62);

        List<Ingrediente> ingredientes = new ArrayList<>();

        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        ingredientes.add(ingrediente1);

        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        ingredientes.add(ingrediente2);

        // ...
        //Agregar pasos
        List<Paso> pasos = new ArrayList<>();
        Paso paso1 = new Paso();
        paso1.setDescripcion("Precalienta el horno a 180°C. Engrasa un molde para brownies de 20 x 20 cm.");
        paso1.setOrden(1);

        Paso paso2 = new Paso();
        paso2.setDescripcion("En un tazón grande, mezcla la harina, la Leche Condensada LA LECHERA® y el chocolate en polvo.");
        paso2.setOrden(2);

        Paso paso3 = new Paso();
        paso3.setDescripcion("Agrega el aceite, el agua y los huevos; bate con batidora eléctrica hasta que la mezcla esté suave y homogénea.");
        paso3.setOrden(3);

        receta.setPasos(pasos);


        receta.setDificultad(Dificultad.INTERMEDIO);

    }

}
