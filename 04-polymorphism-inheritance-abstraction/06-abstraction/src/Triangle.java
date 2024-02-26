public class Triangle implements Shape2D {
    protected double width;
    protected double height;
    protected double length;

    public Triangle(double width, double height, double length ){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public double area(){
        double s = this.perimeter() / 2 ;
        return Math.sqrt(s * (s-width) * (s-height) * (s-length));
    }

    @Override
    public double perimeter() {
        return  height + width + length;
    }
}
