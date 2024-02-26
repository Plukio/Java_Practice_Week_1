public class Square extends Rectangle{


    public Square(double width) {
        super(width, width);
    }

    public Cuboid toCube(){
        return new Cuboid(width, width, width);
    }
}
