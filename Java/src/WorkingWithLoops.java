public class WorkingWithLoops {
    public static void main(String[] args) {

        // P1:

//        int v = 4;
//        for (int i = v; i > 0; i--){
//            for (int k = 1; k <= i; k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        int c = 5;
//        for (int i = 1; i <= c; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        int w = 5;
//        for (int i = w; i > 0; i--) {
////            System.out.println(i);
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //P2:
//        int sum = 0;
//        int n = 2;
//        int i = 0;
////        for (int i = 0; i < n; i++){
////            sum = sum + (2*i);
////        }
////        System.out.print(sum);
//        while (i < n){
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println(sum);

        //P3:
//        int n = 8;
//        for(int i = 1; i <= 10; i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        //P4:
//        int n = 10;
//        for (int i = n; i > 0; i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        //P5:
        // what is factorial? : n = n * n-1 * n-2....1
        // 5! = 5*4*3*2*1 = 120
//        int n = 5;
//        int i = 1;
//        int factorial = 1;
//        while(i <= n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);
//        for (i = 1; i <=n; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);

        //P6:
//        int v =8;
//        int i =v;
//
//        while (i > 0){
//            for (int k = 1; k <= i; k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//            i--;
//        }

        //P7
        int n = 8;
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
            sum = sum + (n*i);
        }
        System.out.println("The total sum of "+n+" table is : "+sum);

    }
}

