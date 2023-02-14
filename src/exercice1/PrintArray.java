package exercice1;

public class PrintArray {
	
	public static void printArray(Object[] array) {
	    for (Object element : array) {
	        System.out.println(element);
	    }
	}

	public static void main(String[] args) {
	    Integer[] intArray = {1, 2, 3, 4, 5};
	    String[] stringArray = {"Hello", "World", "!"};

	    System.out.println("Integer Array:");
	    printArray(intArray);

	    System.out.println("\nString Array:");
	    printArray(stringArray);

	}

}
