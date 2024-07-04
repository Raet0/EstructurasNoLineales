package main.Materia.Controllers;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetConComparador {
    public void construirTreeSetConComparador(){

        //Comparador personalizado
        Comparator<String> comparadorOrdenInverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        };


        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        
        //AGREGAR ELEMENTOS
        conjunto.add("Manzana");
        conjunto.add("Pera");
        conjunto.add("Manzana");
        conjunto.add("Bolon");
        conjunto.add("Gran Malo");
        conjunto.add("Zhumir");

        System.out.println("TreeSet" + conjunto);

    }

}
