package ConstructorAndStatic;

public class Box {
        int a;      // instance variables
        int b;
        static int t1 = 77;

        static {
            System.out.println("Working with Static Block");
            // Static block run at the time of class loader before initializing the object
        }


        Box(){       //Default-cons
            a=10;
            b=20;
        }

       Box(int z, int y){       //Parameterized-cons
        a=z;
        b=y;
       }

       Box(Box e){          // Copy-cons
            a= e.a;
            b= e.b;
       }
       // Box: is the data type of the parameter expected by the copy constructor. It's a reference to an object of `Box` class
       // e is just a variable name


    void area (){
            int areaT = a+b;
            System.out.println("Area is "+areaT);
        }

        // if we don't create any constructor then JVM will create a default constructor

    static void test(){
        System.out.println("Use case of static..");
        System.out.println(t1);
    }
    static void test(String a12){           // method-overloading
        System.out.println("Use case of static with "+a12);
        System.out.println(t1);
    }
    // overloading : same name of method/constructor/etc but signature was different is called method/constructor/etc overloading.
    /*
     :- if method is not using variables of class then we can use static and by static we can call this method by using the class
     :- instance variables are depends on object & if method is using variables means it's also depends on object & if object not
        depends on object we can use static
     * object taking memory, so if method not using variables then we define as static it saves a memory
    */
    /*
     static-variable : is sharing same memory with all object but with update value from last where we used; its
     only depends on class
    */
}

