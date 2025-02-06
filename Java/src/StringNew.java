import java.util.Scanner;

public class StringNew {
    public static void main(String[] args) {

//        String name = new String("Raghav");
        String name = "anurag";
//        System.out.print("My name is : ");
//        System.out.println(name);

        int ab = 6;
        float cd = 20.8753f;
        String test22 = "working";
//        System.out.printf("the value of a is %d & value of d is %.3f", ab, cd);
//        System.out.format("the value of a is %d & value of d is %f and value of test22 is %s", ab, cd, test22);

//        int -> %d
//        float -> %f
//        char -> %c
//        String -> %s

//        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        System.out.println(st);

        // Index starts from 0 and length starts from 1

        String myName = "AnuJ";
        String space = "   Raghav  ";
        System.out.println(myName.length());
        System.out.println(myName.toLowerCase());
        System.out.println(space.trim());
        System.out.println(myName.substring(2));
        System.out.println(myName.substring(1,3));
        System.out.println(name.replace('a','k'));
        System.out.println(name.replace("a","AA"));
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("ag"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("ag"));
        String updatedName = "AnuragAnurag";
        System.out.println(updatedName.indexOf("ra",4));
        System.out.println(updatedName.lastIndexOf("ag",5));
        System.out.println(name.equals("Anurag"));
        System.out.println(name.equalsIgnoreCase("Anurag"));

        // Escape sequence characters
        // \n : new line;
        // \' : ';
        // \\ : \; etc;

        System.out.println("working with \t escape seq.");
    }
}
