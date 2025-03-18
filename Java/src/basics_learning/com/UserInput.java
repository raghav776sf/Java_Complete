package basics_learning.com;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking user Input..");
        Scanner ui = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = ui.nextInt();
//        System.out.println("Enter number 2");
//        int b = ui.nextInt();
//        int sum = a+b;
//        System.out.println("The sum of these number is: "+ (sum));

//        boolean test = ui.hasNextInt();
//        System.out.println(test);
//        String str = ui.next();
        String str = ui.nextLine();
        System.out.println(str);
    }
}
