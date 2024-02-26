public class Rectangle implements Shape2D{
    protected double width;
    protected double height;

    public Rectangle(double width,double height ){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public Cuboid toCuboid(double length){
        return new Cuboid(width, height, length);
    }

}
