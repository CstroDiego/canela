/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.entidades.Usuario;
import mx.itson.canela.enumeradores.Dificultad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Receta receta = new Receta();

        // Lo asignamos a un usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setCorreoElectronico("diego.castro@potros.itson.edu.mx");
        usuario.setContrasena("123456");

        receta.setUsuario(usuario);


        //Asignar valores a la receta
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setTiempo(62);

        //Creamos una lista de ingredientes y la agregamos a la receta
        List<Ingrediente> ingredientes = new ArrayList<>();

        //Creamos los ingredientes
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        ingredientes.add(ingrediente1);

        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        ingredientes.add(ingrediente2);

        Ingrediente ingrediente3 = new Ingrediente();
        ingrediente3.setNombre("1/2 Taza de Aceite de maíz");
        ingredientes.add(ingrediente3);

        Ingrediente ingrediente4 = new Ingrediente();
        ingrediente4.setNombre("2 Huevos");
        ingredientes.add(ingrediente4);

        Ingrediente ingrediente5 = new Ingrediente();
        ingrediente5.setNombre("1 Paquete de Queso crema a temperatura ambiente (190 g)");
        ingredientes.add(ingrediente5);

        Ingrediente ingrediente6 = new Ingrediente();
        ingrediente6.setNombre("1 Bolsa de Leche Condensada LA LECHERA® (209 g)");
        ingredientes.add(ingrediente6);

        Ingrediente ingrediente7 = new Ingrediente();
        ingrediente7.setNombre("2 Cucharadas de Ralladura de limón");
        ingredientes.add(ingrediente7);

        Ingrediente ingrediente8 = new Ingrediente();
        ingrediente8.setNombre("2 Cucharadas de Mantequilla a temperatura ambiente");
        ingredientes.add(ingrediente8);

        Ingrediente ingrediente9 = new Ingrediente();
        ingrediente9.setNombre("Colorante vegetal para alimentos color verde");
        ingredientes.add(ingrediente9);

        Ingrediente ingrediente10 = new Ingrediente();
        ingrediente10.setNombre("12 Ojos de Azúcar");
        ingredientes.add(ingrediente10);

        Ingrediente ingrediente11 = new Ingrediente();
        ingrediente11.setNombre("1/2 Barra de Chocolate amargo fundido (75 g)");
        ingredientes.add(ingrediente11);

        Ingrediente ingrediente12 = new Ingrediente();
        ingrediente12.setNombre("6 Lunetas de chocolate");
        ingredientes.add(ingrediente12);

        //agregamos los ingredientes a la receta
        receta.setIngredientes(ingredientes);

        //Creamos una lista de pasos
        List<Paso> pasos = new ArrayList<>();

        Paso paso1 = new Paso();
        paso1.setDescripcion("Horno precalentado a 180 °C.");
        paso1.setOrden(1);
        pasos.add(paso1);

        Paso paso2 = new Paso();
        paso2.setDescripcion("Mezcla la harina para brownies chocolate Fudge de Betty Crocker® con el agua, el aceite y los huevos. Vierte la mezcla en un molde cuadrado de 30 x 20 cm previamente en harinado y hornea a 180 °C durante 25 minutos. Retira del horno y enfría.");
        paso2.setOrden(2);
        pasos.add(paso2);

        Paso paso3 = new Paso();
        paso3.setDescripcion("Bate el queso crema con la Leche Condensada LA LECHERA®, la ralladura de limón, la mantequilla y un poco de colorante hasta integrar por completo y refrigera por 20 minutos.");
        paso3.setOrden(3);
        pasos.add(paso3);

        Paso paso4 = new Paso();
        paso4.setDescripcion("Desmolda y corta en cuadros. Unta los brownies con un poco de betún; dibuja el cabello y la boca con el chocolate fundido, coloca los ojos de azúcar y la nariz con las lunetas. Ofrece.");
        paso4.setOrden(4);
        pasos.add(paso4);

        //Agregamos la lista de pasos a la receta
        receta.setPasos(pasos);

        //Agregamos la dificultad a la receta
        receta.setDificultad(Dificultad.INTERMEDIO);

        //Imprimimos la receta
        System.out.println("*** RECETAS NESTLÉ ***");
        System.out.println("Subido por: " + receta.getUsuario().getNombre());
        System.out.println(receta.getNombre());
        System.out.println(receta.getDescripcion());
        System.out.println("Porciones: " + receta.getNumeroPorciones());
        System.out.println("Tiempo: " + receta.getTiempo() + " minutos");
        System.out.println("Dificultad: " + receta.getDificultad());
        System.out.println("Ingredientes:");
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            System.out.println("- " + ingrediente.getNombre());
        }
        System.out.println("Pasos:");
        for (Paso paso : receta.getPasos()) {
            System.out.println(paso.getOrden() + ". " + paso.getDescripcion());
        }
        System.out.println("¡Buen Provecho!");


    }

}
