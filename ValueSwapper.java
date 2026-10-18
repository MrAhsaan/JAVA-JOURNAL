
package JOURNAL;
public class ValueSwapper {
    public void swap(int a, int b) {
        System.out.println("Before Swap (Int): a=" + a + ", b=" + b);
        int temp = a; a = b; b = temp;
        System.out.println("After Swap (Int): a=" + a + ", b=" + b);
    }

    public void swap(float a, float b) {
        System.out.println("Before Swap (Float): a=" + a + ", b=" + b);
        float temp = a; a = b; b = temp;
        System.out.println("After Swap (Float): a=" + a + ", b=" + b);
    }

    public void swap(char a, char b) {
        System.out.println("Before Swap (Char): a=" + a + ", b=" + b);
        char temp = a; a = b; b = temp;
        System.out.println("After Swap (Char): a=" + a + ", b=" + b);
    }

    public static void main(String[] args) {
        ValueSwapper vs = new ValueSwapper();
        vs.swap(10, 20);
        System.out.println();
        vs.swap(5.5f, 9.9f);
        System.out.println();
        vs.swap('X', 'Y');
    }
}
