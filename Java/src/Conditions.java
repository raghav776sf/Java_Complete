import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
//        int age = 18;
//        if (age >= 18){
////            System.out.println("You are eligible for driving.");
//        } else {
////            System.out.println("You are not eligible for driving due to age is less then 18.");
//        }

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
//        if (a && b){
////            System.out.println("meeting the condition..");
////        } else if (a && c) {
////            System.out.println("condition is valid under else if");
//        } else {
////            System.out.println("not valid");
//        }

//        if (d || b){
////            System.out.println("working with OR at if.");
//        } else {
////            System.out.println("not valid any one of the OR check");
//        }

        int userAge;
        System.out.println("Enter your age..");
        Scanner sc = new Scanner(System.in);
        userAge = sc.nextInt();

//        if (userAge > 56){
//            System.out.println("you have 30+ years of experience.");
//        } else if(userAge > 46){
//            System.out.println("you have 20+ years of experience.");
//        } else if (userAge > 36){
//            System.out.println("you have 20+ years of experience.");
//        } else {
//            System.out.println("you are fresher");
//        }

//        switch (userAge){
//            case 20:
//                System.out.println("you are 20 years old!");
//                break;
//            case 30:
//                System.out.println("you are 30 years old!");
//                break;
//            case 40:
//                System.out.println("you are 40 years old!");
//                break;
//            case 60:
//                System.out.println("you are 60 years old!");
//                break;
//            default:
//                System.out.println("Enjoy your life!");
//        }
        switch (userAge){            // enhanced switch case
            case 20 -> System.out.println("you are 20 years old!");
            case 30 -> System.out.println("you are 30 years old!");
            case 40 -> System.out.println("you are 40 years old!");
            case 60 -> System.out.println("you are 60 years old!");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for learning switch use-case");
    }
}
