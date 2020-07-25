public class Geometrics {

    public static void main(String[] args) {

        System.out.println(rectangle(10.0, 5.0));
        System.out.println(perimeterSquare(3));
        System.out.println(squareArea(5));
        System.out.println(perimeterRectangle(4, 9));
        System.out.println(zoneSphere(6, 16, 8));
        System.out.println(cylinderSphere(99));
        System.out.println(ungula(45, 77));


    }

    private static double rectangle (double x, double y){
        // area ... Fläche
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

}
