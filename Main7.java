
// Mini Project - Calculator

import java.util.Scanner;

public class Main7{
        public static void main(String[]args){
             float number_1 , number_2 ;
             System.out.println("Enter First number");
             Scanner scan =new Scanner(System.in);
             number_1 = scan.nextFloat();
             System.out.println("Enter Second number");
             number_2 = scan.nextFloat();
             System.out.print("You have entered ");
             System.out.print( number_1 );
             System.out.print(" and ");
             System.out.println( number_2 );

            String prompt = "Enter 0 for addition , 1 for Substraction , 2 for Multiplication and  3 for Division";
            System.out.println(prompt);
            int input = scan.nextInt();
            switch (input){
                case 0 :
                    System.out.println("Adding these numbers");
                    System.out.print("The result is: ");
                    System.out.println(number_1 + number_2);
                    break;
                case 1:
                    System.out.println("Substracting these numbers");
                    System.out.print("The result is: ");
                    System.out.println(number_1 - number_2);
                    break;
                case 2 :
                    System.out.println("Multiplying these numbers");
                    System.out.print("The result is: ");
                    System.out.println(number_1 * number_2);
                    break;
                case 3 :
                    System.out.println("Dividing these numbers");
                    System.out.print("The result is: ");
                    System.out.println(number_1 / number_2);
                    break;
                default :
                    System.out.println("Invalid Input");
            }

    }
}