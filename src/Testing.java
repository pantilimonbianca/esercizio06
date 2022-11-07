public class Testing {
    public static void main(String[] args) {

        Shape shape=new Shape();

        Shape circle=new Shape(40.0);
        Shape square=new Shape(4);
        Shape rectangle=new Shape(4,2.3,2.3);
        Shape triangle= new Shape(3,8.0,8.0,8.0);

        shape.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();

    }
}
