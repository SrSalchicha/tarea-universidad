package SegundoCuatrimestre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Comida> plato = new ArrayList<>();

        plato.add(new Comida("Enchiladas", 10, 35));
        plato.add(new Comida("Chile en relleno", 15, 65));
        plato.add(new Comida("Spaghetti", 9, 65));
        plato.add(new Comida("Pan de ajo", 10, 15));
        plato.add(new Comida("Sandwich perfecto", 1000, 365));
        plato.add(new Comida("kushiage", 11, 60));
        plato.add(new Comida("Enchiladas", 10, 35));
        plato.add(new Comida("tacos", 80, 75));
        plato.add(new Comida("Ramen", 11, 35));
        plato.add(new Comida("cochito", 11, 35));

        imprimir(plato);
    }

    public static void imprimir(ArrayList<Comida> a){
        System.out.println("Lista no ordenada");
        for (int i = 0; i < 10 ;i++){
            System.out.println(a.get(i));
        }
        System.out.println();
        SearchGenerica generica = new SearchGenerica();
        Collections.sort(a);
        System.out.println("Busqueda: " + generica.binaria(a,new Comida("Sandwich perfecto", 1000, 365), true ));

    }
}
