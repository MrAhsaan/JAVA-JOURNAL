package JOURNAL;

public class GenericMaximum {
    public static <T extends Comparable<T>> T findMaximum(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {25, 42, 17, 89, 34};
        Double[] doubleArray = {5.6, 9.1, 2.3, 8.8};
        String[] stringArray = {"Apple", "Orange", "Banana", "Pear"};

        System.out.println("Max Integer: " + findMaximum(intArray));
        System.out.println("Max Double: " + findMaximum(doubleArray));
        System.out.println("Max String: " + findMaximum(stringArray));
    }
}

