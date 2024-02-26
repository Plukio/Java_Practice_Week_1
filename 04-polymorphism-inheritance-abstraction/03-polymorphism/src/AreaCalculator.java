public class AreaCalculator {


    public static double calculateRectangleArea(int a, int b) {
        return a * b;
    }

    public static double calculateRectangleArea(double a, double b) {
        return a * b;
    }

    public static double calculateCircleArea(int r) {
        return Math.PI * r * r;
    }

    public static double calculateCircleArea(double r) {
        return Math.PI * r * r;
    }

    public static double calculateTriangleArea(int a, int b) {
        return 0.5 * a * b;
    }

    public static double calculateTriangleArea(double a, double b) {
        return 0.5 * a * b;
    }

}
