package Inheritance;

public class Pen {          //parent class
    String inkColour ;

//    Pen(String colour){
//        inkColour=colour;
//    }
    Pen(){
       inkColour="Black";
    }

    void write(String colour){
        inkColour=colour;
        System.out.println("I am writing with a "+inkColour+" colour using pen..");
    }
}


