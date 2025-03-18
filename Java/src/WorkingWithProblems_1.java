import java.util.Scanner;

public class WorkingWithProblems_1 {


    public static void main(String[] args) {
        // P1
//        int a = 10;
//        if (a=12){
//
//        }

        //P2
//        System.out.println("Checking you are pass or fail based on given scenarios..");
//        System.out.println("Enter Sub1 Marks which you obtain..");
//        Scanner sc = new Scanner(System.in);
//        int sub1 = sc.nextInt();
//        System.out.println("Enter Sub2 Marks which you obtain..");
//        int sub2 = sc.nextInt();
//        System.out.println("Enter Sub3 Marks which you obtain..");
//        int sub3 = sc.nextInt();
//        float avg = (sub1+sub2+sub3)/3f;
//        System.out.println("Your total percentage: "+avg);
//        if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33){
//            System.out.println("You are passed and promoted to next class.");
//        } else {
//            System.out.println("You are not able to clear the exam so not promoted.");
//        }

        //P3
//        System.out.println("Please Enter your income in lacs..");
//        Scanner sc = new Scanner(System.in);
//        float income = sc.nextFloat();
//        float tax = 0;
//        if(income <= 2.5f){
//            tax = tax + 0;
//        } else if (income > 2.5f && income <= 5.0f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        } else if (income > 5.0f && income <= 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.20f * (income - 5.0f);
//        } else if (income > 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.20f * (10.0f - 5.0f);
//            tax = tax + 0.30f * (income - 10.0f);
//        }
//        System.out.println("total tax paid by you is : " + tax);

        // P4
        short userIn;
        System.out.println("Please enter a number from 1-7 to check that's related to which day..");
        Scanner sc = new Scanner(System.in);
        userIn = sc.nextShort();
        switch (userIn){
            case 1 -> System.out.println("This number is related to Sunday");
            case 2 -> System.out.println("This number is related to Monday");
            case 3 -> System.out.println("This number is related to Tuesday");
            case 4 -> System.out.println("This number is related to Wednesday");
            case 5 -> System.out.println("This number is related to Thursday");
            case 6 -> System.out.println("This number is related to Friday");
            case 7 -> System.out.println("This number is related to Saturday");
            default -> System.out.println("Please enter a number from range 1-7 only");
        }
    }
}
