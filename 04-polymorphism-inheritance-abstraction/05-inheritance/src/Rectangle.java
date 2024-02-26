public class Rectangle  {

    protected double width;
    protected double height;

    public Rectangle(double width,double height ){
        this.height = height;
        this.width = width;
    }

    public double area(){
        return height * width;
    }

    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public Cuboid toCuboid(double length){
        return new Cuboid(width, height, length);
    }


}
