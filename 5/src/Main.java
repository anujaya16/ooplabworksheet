class Circle{
    public Circle(double r) {
    }

    public double computeArea(double r){
        return 3.14*r*r;
    }

    public double computeCircumference(double r){
        return 2*3.14*r;
    }
}


public class Main {

    public static void main(String[] args){

        double ri = 5;
        double ro = 7;
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerArea = innerCircle.computeArea(ri);
        double outerArea = outerCircle.computeArea(ro);

        double shadeArea = outerArea - innerArea;

        System.out.println("shaded area is : " + shadeArea);


    }
}