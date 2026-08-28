package oop;

public class C03_C {
int y = 30;
    public  C03_C(){

     IO.println("Class B Constructor");


    }

    public static void main (String[] args) {

        C03_C objc = new  C03_C();
        objc.add(4,7);
        C02_B objB = new C02_B();
        IO.println(objB.x);
        objB.x=8;

        IO.println(objc.y);



    }

   int add (int a , int b)  {

      return (a+b) ;


   }


}
