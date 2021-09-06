import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a >= b && a >= c) {
            if (b >= c) {
                return b;
            } else {
                return c;
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else {
            return b;
        }
    }

        // Returns the input with the larger absolute value
    public static int magnitude(int x, int y) {

            int p = Math.abs(x);
            int q = Math.abs(y);
            if(p>q) {
                return x;
            }else{
                return y;
            }
            }


    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double squared = a*a + b*b;
        return(Math.sqrt(squared));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        //System.out.println(median(1, 2, 3)); // should be 2
        //System.out.println(magnitude(-7, -1)); // should be -7
        //System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("choose 'pythagoras,' 'magnitude,' or 'median' ");
        String function = scan.next();
        String pythag = "pythagoras";
        String magn = "magnitude";
        String med = "median";
        boolean z = pythag.equals(function);
        boolean u = magn.equals(function);
        boolean t = med.equals(function);
            if(t) {
                System.out.println("what is the first number?");
                int a = scan.nextInt();
                System.out.println("what is the second number");
                int b = scan.nextInt();
                System.out.println("what is the third number");
                int c = scan.nextInt();
                int s = median((int) a, (int) b, (int) c);
                System.out.println(s);
            } else if(u) {
                System.out.println("what is the first number?");
                int x = scan.nextInt();
                System.out.println("what is the second number?");
                int y = scan.nextInt();
                int medres = magnitude((int) x, (int) y);
                System.out.println(medres);
            } else{
                int a = scan.nextInt();
                System.out.println("what is the second number?");
                int b = scan.nextInt();a = scan.nextInt();
                System.out.println("what is the second number?");
                double pythagres = pythagoras((int) a, (int) b);
                System.out.println(pythagres);



            }
        }}



