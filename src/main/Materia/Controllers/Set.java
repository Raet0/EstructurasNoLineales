package main.Materia.Controllers;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import main.Materia.Controllers.TreeSetConComparador;
public class Set {
    public class Sets {

        public  void Set() {
            // No hay nada que hacer en este método
            HashSet();
        }
    
        public  void HashSet() {
            // Aquí va el código para construir un conjunto HashSet
            HashSet<String> conjunto = new HashSet<>();
            conjunto.add("Manzana");
            System.out.println(conjunto);
            conjunto.add("Banana");
            System.out.println(conjunto);
            conjunto.add("Manzana");
            System.out.println(conjunto);
            conjunto.add("Uva");
            System.out.println(conjunto);
            conjunto.add("Piña");
            System.out.println(conjunto);
            System.out.println("HashSet: " + conjunto);
        }
        public  void LinkedHashSet() {
            // Aquí va el código para construir un conjunto LinkedHashSet
            LinkedHashSet<String> conjunto = new LinkedHashSet<>();
            conjunto.add("Manzana");
            System.out.println(conjunto);
            conjunto.add("Banana");
            System.out.println(conjunto);
            conjunto.add("Manzana");
            System.out.println(conjunto);
            conjunto.add("Uva");
            System.out.println(conjunto);
            conjunto.add("Piña");
            System.out.println(conjunto);
            System.out.println("LinkedHashSet: " + conjunto);
        }
        public  void TreeSet() {
            // Aquí va el código para construir un conjunto TreeSet
            TreeSet<String> conjunto = new TreeSet<>();
            conjunto.add("Manzana");
            System.out.println(conjunto);
            conjunto.add("Banana");
            System.out.println(conjunto);
            conjunto.add("Manzana");
            System.out.println(conjunto);
            conjunto.add("Uva");
            System.out.println(conjunto);
            conjunto.add("Piña");
            System.out.println(conjunto);
            System.out.println("TreeSet: " + conjunto);
        }
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
}
}