public class Circle{
    private double radius;

    // Constructor with arguments
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with no arguments (default constructor)
    public Circle() {
        this.radius = 0.0;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter and setter for the radius (optional)
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
//main
public class main {
    public static void main(String[] args) {
        // Create a Circle object using the constructor with arguments
        Circle circle1 = new Circle(5.0);
        double circumference1 = circle1.calculateCircumference();
        System.out.println("Circumference of circle1: " + circumference1);

        // Create a Circle object using the constructor with no arguments
        Circle circle2 = new Circle();
        circle2.setRadius(3.0); // Set the radius using the setter method
        double circumference2 = circle2.calculateCircumference();
        System.out.println("Circumference of circle2: " + circumference2);
    }
}