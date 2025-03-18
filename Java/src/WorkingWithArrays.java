public class WorkingWithArrays {
    public static void main(String[] args) {

        // P1:
//        float [] marks = {23.4f,78.6f,97.0f,49.6f};
//        float sum = 0;
//        for(float el: marks){
//            sum = sum + el;
//        }
//        System.out.println(sum);
//        System.out.println("The avg value of marks is "+ sum/ marks.length);

        // P2:
//        float [] marks = {23.4f,78.6f,97.0f,49.6f};
//        boolean isExist = false;
//        float num = 49.61f;
//        for(float el: marks){
//            if(el == num){
//                isExist = true;
//            }
//        }
//        if (isExist){
//            System.out.println("Value is Present in the marks..");
//        } else {
//            System.out.println("Value is not available in the marks..");
//        }

        //P3:
//        int [][] mat1 = {{2,4,3},
//                          {8,5,9}};
//        int [][] mat2 = {{6,7,1},
//                          {3,1,4}};
//        int [][] result = {{0,0,0},
//                          {0,0,0}};
//
//        for(int i = 0; i < mat1.length; i++){             //row number of times
//            for (int j=0; j < mat1[i].length; j++){       //column number of times
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }

        // P4: printing array in reverse order
        // required: array.length, half value of array.length in int and new variable where we have to hold the value
//        int [] Arrays = {22,33,44,55,66};
//        int l = Arrays.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i = 0; i <n; i++){
//            temp = Arrays[i];
//            Arrays[i] = Arrays[l-1-i];
//            Arrays[l-1-i] = temp;
//        }
//        for(int el: Arrays){
//            System.out.println(el);
//        }



//        String [] users = {"Raghav", "Ram", "Raju", "Rajat", "mohit"};
//        int l = users.length;
//        int rlength = Math.floorDiv(l,2);
//        String usersRevers;
//        for(int i = 0; i < rlength; i++){
//            usersRevers = users[i];
//            users[i] = users[l-i-1];
//            users[l-i-1] = usersRevers;
//        }
//        for(String el: users){
//            System.out.println(el);
//        }




//        int [] arr = {1,2,3,45,6};
//        int arrLength = arr.length;
//        int reverseLength = Math.floorDiv(arrLength,2);
//        int newArr;
//        for(int i=0; i < reverseLength; i++){
//            newArr = arr[i];
//            arr[i] = arr[arrLength-i-1];
//            arr[arrLength-i-1] = newArr;
//        }
//        for(int el: arr){
//            System.out.println(el);
//        }


        //P5:
        int [] arr = {1,2,3,45,6,98767,-445487};
        int max = Integer.MIN_VALUE;
        for(int el: arr){
            if(el>max){
                max = el;
            }
        }
        System.out.println(max);
        int min = Integer.MAX_VALUE;
        for(int elmin: arr){
            if(elmin < min){
                min = elmin;
            }
        }
        System.out.println(min);

        //P6:
        boolean isShorted = true;
        int []test = {3,54,87,2,39,1,0};
//        int [] test = {0,1,2,3,4,5};
        for(int i=0; i < test.length-1; i++){
            if(test[i] > test[i+1]){
                isShorted = false;
            }
        }
        if (isShorted){
            System.out.println("Array is shorted");
        } else {
            System.out.println("Array is not shorted");
        }
    }
}
