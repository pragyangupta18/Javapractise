/*
class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world with java !");
        System.out.print("Hello world");
        System.out.print(" with java !\n");
        System.out.print("Hello world with java !");
    }
}
 print - print in  same line
 println - print in next line
 \n - print in next line
*/




 /*
 class FirstPattern {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}
*/

/*
class Firstdatatype {

    // primitive -> byte(8 bits),short,char(2 bits),boolean(1 bits),int(4 bits),
    //              float(4 bits),long(8 bits),double(8 bits)

    // non - primitive -> String , Array , class , object , interface .
    public static void main(String[] args) {
        // Variables
        int a = 10 ;
        int b  = 5 ;
        int diff = a - b ;
        int Sum = a + b ;
        int Multiply = a * b ;
        double price = 25.5 ;
        String name = "Pragyan";

        System.out.println(a+b);
        System.out.println(diff);
        System.out.println(Sum);
        System.out.println(Multiply);

        // calc left to right
        //  +,-  <  *,%,/

        //Quiz
        int ans = a*b / a-b ;
        int ans1 = (a*b) / (a-b) ;

        System.out.println(ans);
        System.out.println(ans1);
    }
}
*/




/*
import java.util.*;
class FirstInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();// next funcion prints only 1 word .
    System.out.println(name);
    }
}
*/


/*
// Addition of two number
import java.util.*;
class FirstInputquest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int a = sc.nextInt();
        System.out.print("Enter Second num : ");
        int b = sc.nextInt();
        System.out.print("Sum is : ");
        int sum = a+b;
        System.out.println(sum);
    }
}
*/

/*
  //Make a program that takes the radius of a circle as input, calculates its radius
  //  and area and prints it as output to the user.
import java.util.*;
class program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = sc.nextInt();
        double area = 3.14*(r*r);
        System.out.print("Area of circle is : ");
        System.out.println(area);
    }
}
*/


/*
import java.util.*;
class conditionstat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        }else{
            System.out.println("child");
        }
    }
}
*/


/*
import java.util.*;
class condstat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if (number % 2 == 0 ) {
            System.out.println("No. is even");
        }else{
            System.out.println("No. is odd");
        }
    }
}
*/


/*
import java.util.*;
class condstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        if(a == b){
            System.out.print("Equal");
        }else{
            if (a > b) {
                System.out.print("a is greater");
            }else{
                System.out.print("b is greater");
            }
        }
    }
}
 */


/*
import java.util.*;
class consta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        if(a == b){
            System.out.print("Equal");
        }
        else if (a > b){
                System.out.print("a is greater");
        }
        else{
                System.out.print("b is greater");
        }
    }
}
*/

/*
import java.util.*;
class condstate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the button  : ");
        int button = sc.nextInt();
        if(button == 1){
            System.out.print("hi");
        }
        else if (button == 2){
            System.out.print("Hello");
        }
        else if (button == 3){
            System.out.print("Namaste");
        }
        else{
            System.out.println("Invalid Button");
        }
    }
}
*/

/*
import java.util.*;
class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the button  : ");
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}
*/

/*
class loop {
    public static void main(String[] args) {
      for(int counter=0;counter<100;counter=counter+1) {
          System.out.println("Hello world");
      }
    }
}
*/




/*
// 1 to 10 printing with for loop
class loop {
    public static void main(String[] args) {
        for (int counter = 0; counter < 11; counter++) {   // counter++ = Counter + 1
            System.out.println(counter);
        }
    }
}
 */



/*
// 1 to 10 printing with while loop
class loop {
    public static void main(String[] args) {
        int counter = 0 ;
        while(counter < 11) {   // counter++ = Counter + 1
            System.out.println(counter);
            counter++ ;
        }
    }
}
*/



/*
// 1 to 10 printing with do while loop
class loop {
    public static void main(String[] args) {
        int counter = 0 ;
        do{
            System.out.println(counter);
            counter++ ;
        } while(counter<11);
    }
}
*/


/*
// first n natural number
import java.util.*;
class loop {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number of the no.'s which should be taken : " );
         int n = sc.nextInt() ;
         int sum = 0 ;
         for(int i=0; i <= n ; i++)
         {
             sum = sum + i ;
         }
        System.out.print("Sum of the natural no.'s given is : ");
        System.out.println(sum);
    }
}
*/


/*
//print table of no. input by the user ..
import java.util.*;
class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt() ;
        for(int i = 1 ; i < 11 ; i++) {
            System.out.println(n*i);
        }
    }
}
*/




/*
// string and array declaration -
String name = new String("Aman");
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
*/







/*

// Make a calculator
import java.util.*;
class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("1 -> Addition \n2 -> Substraction \n3 -> Multiplication
        \n4 -> Division \n5 -> Modulus \nEnter the function you want to perform : ");
        int operator = sc.nextInt();
        switch (operator){
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3 :
                System.out.println(a*b);
                break;
            case 4 :
                System.out.println(a/b);
                break;
            case 5 :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Operation Doesn't exist ");
        }
    }
}

*/




/*
import java.util.*;
class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to know the month : ");
        int month = sc.nextInt();
        switch (month){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Doesn't denote any of the month ");
        }
    }
}
*/


/*
 Loops syntax ->
for (initialization; condition; update) {
        // body of-loop
        }

        while(condition) {
        // body of the loop
        }


        do {
        // body of loop;
        }
        while (condition);
*/

/*
import java.util.*;
class program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. till where u wanted to print even number : ");
        int n = sc.nextInt();
        for(int i = 1 ;i <= n ; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
*/

/*
import java.util.*;
class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input ;
        do{
            System.out.print("Enter the marks of the stud : ");
            int marks = sc.nextInt();
            if(marks<100 && marks>=90){
                System.out.println("Excellent");
            } else if (marks>50 && marks<=90)
            {
                System.out.println("Good");
            }
            else if (marks>0 && marks<=50)
            {
                System.out.println("Bad");
            }
            else {
                System.out.println("Invalid");
            }

            System.out.println("Want to continue? - yes(1) : No(0)  ");
            input = sc.nextInt();

        }while(input == 1);
    }
}
*/


/*
import java.util.*;
class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }


        if(isPrime) {
            if(n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
*/


//*********************************** Pattern's ****************************************************

/*
import java.util.*;
class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertical no. of stars : ");
        int n = sc.nextInt();
        System.out.print("Enter the horizontal no. of stars : ");
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j = 0; j<m ;j++) {
                System.out.print("*");
            }
            System.out.println(".");
        }
    }
}
*/


/*
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertical no. of stars : ");
        int n = sc.nextInt();
        System.out.print("Enter the horizontal no. of stars : ");
        int m = sc.nextInt();
        for(int i=1 ; i<=n ; i++ ){
            for(int j = 1 ; j<=m ;j++){
                if(i==1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println(".");
        }
    }
}
*/


/*
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            for(int j=1 ; j<=i  ; j++){
                System.out.print("*");
            }
            System.out.println(".");
        }
    }
}
*/


/*
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println(".");
        }
    }
}


              // or //

import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();
        for(int i = n ; i>=1 ; i--){
            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(".");
        }
    }
}

*/



/*
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j<=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
 */


/*
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();

        for (int i= n ; i >= 1 ; i-- ){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
*/

/*
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();
        int number = 1 ;
        for (int i= 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= i; j++){
                System.out.print( number + " "  );
                number++;
            }
            System.out.println(" ");
        }
    }
}
*/


/*
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();
        for (int i= 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= i; j++){
                if((i+j)%2==0){
                System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
 */

// Adanced Patterns   ..........................


import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  no. of stars : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <=n ; i++ ){
            for(int j = 1 ; j<=i ;j++){
                System.out.print("*");
            }
            for (int j = 2*(n-i) ; j >= 1 ; j--){
                System.out.print(".");
            }
            System.out.println(" ");
        }
    }
}



