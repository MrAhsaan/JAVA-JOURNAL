package JOURNAL;

interface CalculateResult {
    double calculateTotal();
    double calculatePercentage();
    String calculateGrade();
}

class Student implements CalculateResult {
    private String name;
    private double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateTotal() {
        double total = 0;
        for (double m : marks) total += m;
        return total;
    }

    public double calculatePercentage() {
        return calculateTotal() / marks.length;
    }

    public String calculateGrade() {
        double p = calculatePercentage();
        if (p >= 85) return "A+";
        else if (p >= 70) return "A";
        else if (p >= 55) return "B";
        else if (p >= 40) return "C";
        else return "Fail";
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        double[] scoreList = {82, 76, 91, 64, 88};
        Student s = new Student("Rahul", scoreList);
        s.display();
    }
}
