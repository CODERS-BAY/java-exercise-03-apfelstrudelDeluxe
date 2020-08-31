public class Geometrics {

    public static void main(String[] args) {

        System.out.println("Results");
        System.out.println("=======================");
        System.out.println("This is the rectangle: " + rectangle(4, 5));
        System.out.println("This is the perimeter square: " + perimeterSquare(10));
        System.out.println("This is the square area: " + squareArea(10));
        System.out.println("This is the perimeter rectangle: " + perimeterRectangle(2, 6));
        System.out.println("This is the zone square: " + zoneSphere(10, 20,30 ));
        System.out.println("This is the cylinder square: " + cylinderSphere(15));
        System.out.println("This is the ungula: " + ungula(8, 9));
        System.out.println("This is the circumference: " + circumference(4, 5));

    }

    private static double rectangle (double x, double y){
        return x*y;
    }
    private static double perimeterSquare (double x){
        return 4*x;
    }
    private static double squareArea (double x){
        return x*x;
    }
    private static double perimeterRectangle (double x, double y){
        return (x+y)*2;
    }
    private static double zoneSphere (double z, double y, double x){
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }
    private static double cylinderSphere (double z){
        return Math.PI * Math.pow(z, 3) / 6;
    }
    private static double ungula (double x3, double z3){
        return (2 * x3 * z3)/3;
    }
    private static double circumference(double l, double w) {
        return (l+w)*2;
    }

}
