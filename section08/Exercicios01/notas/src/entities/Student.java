package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;
    public double grade;

    public double finalGrade() {
        this.grade = n1 + n2 + n3;
        return grade;
    }

    public String toString() {
        if (this.grade >= 60.00) {
            return "PASS";
        } else {
            double missing = 60.00 - this.grade;
            return "FAILED\nMISSING " + missing + " POINTS";
        }
    }

}
