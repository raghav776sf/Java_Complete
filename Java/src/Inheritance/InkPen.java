package Inheritance;

class InkPen extends DotPen{

    int nip;

    void switchRefill(){
        System.out.println("switched to new refill!");
    }

    void write(String colour){      // over-ridding
        inkColour=colour;
        System.out.println("I am writing with a "+inkColour+" colour using InkPen..");
    }
}
