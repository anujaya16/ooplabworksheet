import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter first name = ");
        String fname = obj1.nextLine();

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter middle name = ");
        String mname = obj2.nextLine();

        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter last name = ");
        String lname = obj3.nextLine();

        char letter = mname.charAt(0);

        System.out.println("output is " + lname + "," + fname + " " + letter);

    }
}