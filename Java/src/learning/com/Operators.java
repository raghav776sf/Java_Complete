package learning.com;

public class Operators {
    public static void main(String[] args) {
        int a = 10;  // = assignment operator
//        int b = a % 4;  //Modulo operator
//        System.out.println(5.6%2.1);  //
          a += 3;           // add in the existing value
//        System.out.println(a);

        // Precedence & Associativity
        int test = 60+32-58/2;
//        60+32-29
//        92-29
//        63
//        System.out.println(test);
        int test1 = 60/5+3*15;
//        12+3*15
//        12+45
//        57
//        System.out.println(test1);

//        Precedence & Associativity rule we can check from internet
//        first we check higher Precedence after we check Associativity

        // Increment and Decrement operator
        int ak = 80;
        int sk = 90;

        System.out.println(++ak);
        System.out.println(ak);
        System.out.println(sk++);
        System.out.println(sk);

        char name = 'd';

        System.out.println(++name);



    }
}
