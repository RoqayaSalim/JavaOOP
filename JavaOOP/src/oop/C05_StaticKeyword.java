package oop;

public class C05_StaticKeyword {
  static   int  x = 6;
    public static void main (String[] args) {

        C05_StaticKeyword obj1 = new  C05_StaticKeyword();
        obj1.x=10;
        IO.println(obj1.x);

        C05_StaticKeyword obj2 = new  C05_StaticKeyword();
        obj1.x=11;
        IO.println(obj2.x);


        IO.println(x);





    }

}
