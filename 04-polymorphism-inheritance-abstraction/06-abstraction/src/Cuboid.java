public class Cuboid implements Shape3D{
    protected double width;
    protected double height;
    protected double length;

    public Cuboid(double width, double height, double length ){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public double volume(){
        return height * width * length;
    }

    @Override
    public double surfaceArea() {
        return 2 * height * width + 2 * height * length + 2 * width * length;
    }

}

