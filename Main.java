// Basic's

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // first progrm in java
        System.out.println("Hello world!");
        /* variables
          water - bucket ,  masala - box , lunch - lunch box
          same as these we need containers in java which stores data values
          String - int,float,char,boolean..
          How to declare variable
          syntax - <datatype> < variable name > = < value >
         */

        String name = "pragyan";
        System.out.println(name);

        int a = 45,x = 56 ;
        float b = 45.22f ;
        System.out.println(x);

        boolean isAdult = false;
        System.out.println(isAdult);

        /* rules for constructing names of variable in java
           can contain digits , underscore , dollar , signs , letters
           should begin with the letter $ or _ .
           java is case sensitive language so harry and heavy are diff variable
           should not contain white spaces
           you cannot use reserved keywords from java

         */

        /*
        Two types of data types :
        1. primitive data types  - byte(1 byte), short(2 bytes) , int(4 bytes), long(8 bytes),
         float (4 bytes) ,  double (8 bytes), boolean(1 bit), char(2 bytes).

        2. Non primitive or reference data types  -
         */

        byte u = 59 ;
        double d = 45.343242d;
        char grade = 'A';
        System.out.println(u);
        System.out.println(d);
        System.out.println(grade);
//        will not work as out of range
//        byte u = 159 ;
//        System.out.println(u);
//        memory management is automatic , no need to free up space , there is garbage collector.

/*
            operators in java :
           operand operator operand = result
              4       +       7     =   11

              Types of Operator in java ;
              1.Arithmetic operator -> +,-,%,/,*
              2.Assignment operator -> = , +=( increment the present value of variable ), *= , /= , %= .
              3.Logical Operator ->
                && (logical end operator) - returns true if both conditions are true .
                || (logical or operator)  - returns true if any one conditions is true .
                ! (Logical not) - from true to false and from false to true .
              4.Comparison Operator ->  == (check for equality), != , < , > , <= , >= .
 */
        int num1 = 45 , num2  = 78  ;
        // For output in diff line  we use println function .
        System.out.println("The value of num1 + num2 is ");
        System.out.println(num1+num2);
        // if we want output in one line then use print function .
        System.out.print("The value of num1 + num2 is ");
        System.out.println(num1+num2);

        System.out.print("The value of num1 - num2 is ");
        System.out.println(num1-num2);
        System.out.print("The value of num1 * num2 is ");
        System.out.println(num1*num2);
        System.out.print("The value of num1 / num2 is ");
        System.out.println(num1/num2);  // will give integer .
        System.out.print("The value of num1 % num2 is ");
        System.out.println(num1%num2);
        System.out.println(num1++);
        System.out.println(++num1);// it prints
        System.out.println(num1--);
        System.out.println(--num1);// it prints
      // method overloading - diff methods for diff data types example println(int)  & println (char) .

        // taking user input in java
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scan.nextLine();  // will print a line but will print a word if we write scan.next() only
        // next - wait for white spaces and stop .
        System.out.println(input);

        // strings
        String namee = "pragyan ";
        String channel = " future coder" ;
        System.out.println(namee.length());
        System.out.println(namee.toLowerCase());
        System.out.println(namee.toUpperCase());
        System.out.println(namee +"from"+ channel);   // concatenation
        System.out.println(namee +"from \n"+ channel);
        System.out.println(namee.contains("pra"));  // checking if the str exist in namee .
        System.out.println(namee.charAt(2)); // tell the character at index .
        System.out.println(namee.endsWith("an"));
        System.out.println(namee.indexOf("han ")); // not present so will be -1
        System.out.println(namee.indexOf("an "));
        System.out.println(namee.indexOf("an"));
        System.out.println(namee.hashCode());
        //A hash code is an integer value that is associated with each object in Java. Its main purpose is to
        //facilitate hashing in hash tables, which are used by data structures like HashMap
        System.out.println(namee.getBytes());//Encodes this String into a sequence of bytes using the named charset
        System.out.println(namee.intern());
        System.out.println(namee.isEmpty());
        System.out.println(namee.replace('p','v'));
        System.out.println(namee.startsWith("p"));
        System.out.println(namee.trim());//remove white spaces from both sides
        System.out.println(namee.valueOf("pra")); //Returns the string representation of the specified value


        //  all the string methods to study - https://www.w3schools.com/java/java_ref_string.asp
        // if we want to put double code as string in output then use backslash i.e  \" . more - \\ , \t , \' , \n etc..

        // all math class methods - https://www.w3schools.com/java/java_ref_math.asp
        int numm1 = 4 , numm2 = 7 ;
        System.out.println(Math.max(4,7));
        System.out.println(Math.min(4,7));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(36));// write + ve value or absolute value
        System.out.println(Math.abs(-36)); // write +ve value or absolute value
        System.out.println(Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());   // random no. b\w 4 and 8 .
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(35-4)*Math.random());   // random no. b\w 4 and 35 .
        System.out.println(Math.acos(12));
        System.out.println(Math.acos(-12));   // arccosine value in radians
        System.out.println(Math.acos(2341132));
        System.out.println(Math.floor(2.4));
        System.out.println(Math.floor(2.8));
        System.out.println(Math.exp(128));
        System.out.println(Math.exp(5));
        System.out.println(Math.ceil(23.5));
        System.out.println(Math.ceil(23.3));
        System.out.println(Math.ceil(23.8));
        System.out.println(Math.ceil(84));
        System.out.println(Math.log(84));
        System.out.println(Math.log(32));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.log10(84));
        System.out.println(Math.nextUp(84.2));
        System.out.println(Math.nextUp(84.6));
        System.out.println(Math.nextUp(84.5));
        System.out.println(Math.nextUp(84));
        System.out.println(Math.nextAfter(76,98));
        System.out.println(Math.nextAfter(98,76));
        System.out.println(Math.round(98));
        System.out.println(Math.round(98.56));
        System.out.println(Math.round(98.23));
        System.out.println(Math.round(98.50));
        System.out.println(Math.signum(0.5));
        System.out.println(Math.sin(0.5));
        System.out.println(Math.tan(0.5));
        System.out.println(Math.tanh(0.5));
        System.out.println(Math.toDegrees(227));
        System.out.println(Math.toRadians(34));









    }
}