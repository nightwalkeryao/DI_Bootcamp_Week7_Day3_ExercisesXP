package exercice2;

import static exercice2.Tri.selectionSort;

public class Exercice2 {

    public static void main(String[] args) {
        
          Integer[] intArray = {2, 9, 5, 4, 8, 1, 6};

    System.out.println("Tableau non trié :");
    for (int i : intArray) {
        System.out.print(i + " ");
    }

    selectionSort(intArray);

    System.out.println("\n\nTableau trié :");
    for (int i : intArray) {
        System.out.print(i + " ");
    }
    }
}
