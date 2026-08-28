public class Javabasics {

    public static void main (String[] args) {
String s1 = "Roqaya";
String s2 = "Roqaya";
String s3 =  new String("Roqaya");
String s4 =  new String("Roqaya");
IO.println(s1.equals(s2));
IO.println(s3.equals(s4));
IO.println(s1.equals(s3));
IO.println(s1==s2);
IO.println(s1==s3);


char  a1 ='A';
char  a2 ='a';
char  a3 ='O';
char  a4 ='\n';
char  a5 ='\t';

IO.println(Character.isUpperCase(a1));       ;
IO.println(Character.isUpperCase(a2));
IO.println(Character.isUpperCase(a3));
IO.println(Character.isWhitespace(a4));
IO.println(Character.isWhitespace(a5));

String r1 = "hello world";
boolean c1 = r1.startsWith("hel");
IO.println(c1);
boolean c2 = r1.endsWith("orld");
IO.println(c2);




        int x= 4;
IO.println(x);

String ss = "roqa momo dOdo koko" ;
java.lang.String [] words  = ss.split(" ");
for(String word : words)
{
  IO.println(word);


}

String d = "    broqa    ";
        String S1 = "helo roqa roq";
        IO.println(s1.substring(0,5));
        IO.println(s1.indexOf("o"));

        IO.println(d.trim());










    }
}
