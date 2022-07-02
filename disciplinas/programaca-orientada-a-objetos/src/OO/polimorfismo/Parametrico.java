package OO.polimorfismo;

public class Parametrico {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array inteiros");
        printArray(intArray);

        System.out.println("Array double");
        printArray(doubleArray);

        System.out.println("Array character");
        printArray(charArray);

    }

    // GERENERICS ...
    public static <E> void printArray(E[] array) {

        for(E element: array) {
            System.out.printf("%s ", element);
        }

        System.out.println("");
    }

}
