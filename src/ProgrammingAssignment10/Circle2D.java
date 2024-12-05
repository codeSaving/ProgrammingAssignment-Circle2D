package ProgrammingAssignment10;
public class Circle2D {
        private double x, y;  // Coordinates of the circle's center
        private double radius; // Radius of the circle
        // No-arg constructor, creates a default circle (0, 0, 1)
        public Circle2D() {
            this.x = 0;
            this.y = 0;
            this.radius = 1;
        }
        // Constructor with parameters (x, y, radius)
        public Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        // Getters for x
        public double getX() {
            return x;
        }
        // Getter for y

        public double getY() {
            return y;
        }
        // Getter for radius

        public double getRadius() {
            return radius;
        }

        // Setters for x
        public void setX(double x) {
            this.x = x;
        }
        // Setters for y

        public void setY(double y) {
            this.y = y;
        }
        // setters for radius
        public void setRadius(double radius) {
            this.radius = radius;
        }
        // Method to calculate the area of the circle
        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        // Method to calculate the perimeter of the circle
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        // Method to check if a point (x, y) is inside this circle
        public boolean contains(double x, double y) {
            return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) < radius;
        }
        // Method to check if another circle is  inside this circle
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt((circle.getX() - this.x) * (circle.getX() - this.x)
                + (circle.getY() - this.y) * (circle.getY() - this.y));
        return distance + circle.getRadius() <= this.radius;
    }
    // Method to check if another circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt((circle.getX() - this.x) * (circle.getX() - this.x)
                + (circle.getY() - this.y) * (circle.getY() - this.y));
        return distance < this.radius + circle.getRadius() && distance >
                Math.abs(this.radius - circle.getRadius());
    }
}



