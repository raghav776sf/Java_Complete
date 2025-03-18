package Inheritance;



public class MainClass {
    public static void main(String[] args) {
//        Pen myPen = new Pen();
//        myPen.write("red");

//        System.out.println("Single Level Inheritance");
//        DotPen aPen = new DotPen();
//        System.out.println(aPen.inkColour);
//        aPen.write("Blue");
//        aPen.changeRefill();

//        System.out.println("Multi Level Inheritance");
        InkPen mPen = new InkPen();
        mPen.write("Green");
        mPen.changeRefill();
        mPen.switchRefill();
    }
}
