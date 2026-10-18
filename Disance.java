package JOURNAL;

class Distance {
    private int feet;
    private double inches;

    public Distance(int feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void getValue(int f, double in) {
        this.feet = f;
        this.inches = in;
    }

    public void showDistance() {
        System.out.println(feet + " feet, " + inches + " inches");
    }

    public double convertCenti() {
        // 1 foot = 30.48 cm, 1 inch = 2.54 cm
        return (feet * 30.48) + (inches * 2.54);
    }

    public void display() {
        showDistance();
        System.out.printf("Distance in Centimeters: %.2f cm\n", convertCenti());
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(5, 6);
        Distance d2 = new Distance(3, 2.5);

        System.out.print("Object 1 - ");
        d1.display();
        System.out.print("\nObject 2 - ");
        d2.display();
    }
}
