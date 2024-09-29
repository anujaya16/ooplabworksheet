import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length in cm");

        float length = obj.nextFloat();

        int fl = (int) (length/30.48);


        double il = (double) (length - fl*30.48)/2.54;

        System.out.println("length is " + fl + " feet " + il + " inches" );




    }
}
