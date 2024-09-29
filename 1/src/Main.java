import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = obj.nextLine();
        System.out.println("word is " + word);

        int lettercount = word.length();
        System.out.println("length is  " + lettercount);

        int c = lettercount%2;

        if(c==0){
            System.out.println("There is no middle letter!");
        }else{
            int index = lettercount/2;
            System.out.println("index is " + index);
            char letter = word.charAt(index);
            System.out.println("Middle letter is " + letter);

        }
    }

}