import java.util.Scanner;


public class Helloworld {
    public static void main(String[] args) {
    	Scanner input = new Scanner( System.in );
    	System.out.println("Enter your name: ");
    	String user = input.nextLine();
        System.out.println("Hello World I am "+ user);
    }
}