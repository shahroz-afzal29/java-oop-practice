public class AreaOverloading {

    // Calculate area of a square
    int calculateArea(int side) {
        return side * side;
    }

    // Calculate area of a rectangle (Overloaded method)
    int calculateArea(int length, int width) {
        return length * width;
    }

    // Calculate area of a circle (Bonus overloaded method)
    double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        AreaOverloading obj = new AreaOverloading();

        System.out.println("Area of square: " + obj.calculateArea(4));
        System.out.println("Area of rectangle: " + obj.calculateArea(3, 4));
        System.out.println("Area of circle: " + obj.calculateArea(2.5));
    }
}