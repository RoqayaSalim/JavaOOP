package oop;

public class C04_Const {
   int x;
   String y;

   public C04_Const(){
   IO.println("iam a defult constructor");
   x = 1;
   y= "roqaya";
   }
    public C04_Const(int a , String s){
        IO.println("iam a parmeterized constructor");
        x = a;
        y= s;
    }
    public static void main (String[] args) {


        C04_Const objr = new C04_Const(21 , "roqaya");

        C03_C objc = new  C03_C();
        objc.add(4,7);
    }

}

