public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("Object created");
        this.shapeName="undefined shape.";
    }
    public Shape(double radius){
        System.out.println("Object circle created.");
        this.shapeName="Circle";
    }
    public Shape(int edge){
        System.out.println("Object square created.");
        this.numberOfEdges=edge;
        this.shapeName="square";

    }

    public Shape(int edge, double e1, double e2){
        System.out.println("Object rectangle created.");
        this.numberOfEdges=edge;
        this.shapeName= "rectangle";
    }

    public Shape(int edge, double e1, double e2, double e3){
        System.out.println("Object triangle created.");
        this.numberOfEdges=edge;
        this.shapeName= "triangles";
    }

    public void getShapeDetails(){
        System.out.println("Name of shape: " + shapeName + "\nNumber of edge: " + numberOfEdges);
    }
}
