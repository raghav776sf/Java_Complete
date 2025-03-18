package ConstructorAndStatic;

 class SampleClass {

    public static void main(String[] args) {
        // public : specifier/access-specifier
        // static : is used without object or is independent of object {reason: to call a method we need object}
        // void : return type (because every fun/method have a return type)
        // main : method name
        // String : I can pass any type of data & with the help of string we can convert it into any type of data
        // [] : any amount of data we can pass it
        // args :

        Box dobj = new Box();             //Default Constructor
        System.out.println(dobj.a);
        System.out.println(dobj.b);
        dobj.area();
//        dobj.b=70;


        Box obj1 = new Box(5,7);   // Parametrized Constructor
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        obj1.area();

        Box cobj = new Box(dobj);       // Copy Constructor
        System.out.println(cobj.a);
        System.out.println(cobj.b);
        cobj.area();
        // at object creation of copy-cons we have to give ref of that object what we want to copy/re-use.

//        obj1.test();   // without object we cannot call method or variables of class
        Box.test();     // but using static in method with condition we can access that method by using class
        Box.test("method Over-Loading concept.");

    }

    public void show (){
        System.out.println("Working on Sample Class");
    }


}

// if we don't mention any specifier then it's default specifier and default we-use it inside the same package only