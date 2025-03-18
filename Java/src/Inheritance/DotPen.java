package Inheritance;

class DotPen extends Pen{      //child class

    int ball;


//     DotPen(String colour) {
//        super(colour);
//         ball = 12;
//    }
    //if parent class don't have a default constructor then in child class we have to use super with variable what we are using in parent

    DotPen(){
        ball=1;
    }

    void changeRefill(){
        System.out.println("Refile changed! "+ball);
    }

    void write(String colour){    // over-ridding
        inkColour=colour;
        System.out.println("I am writing with a "+inkColour+" colour using Dotpen..");
    }
}