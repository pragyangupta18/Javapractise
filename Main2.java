// Conditional Statements

import java.util.Scanner;

public class Main2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scan.nextInt();
        if (age>20){
            System.out.println("You are an adult");
        }
        else if (age>5 && age<20){
            System.out.println("You are a teenager");
        }
         else{
            System.out.println("You are a kid ");
        }
         // else if and else is option , if can work individually .




        // Switch statement
        switch (age){
            case 12:
                System.out.println("you are 12 years old");
                break;
            case 56:
                System.out.println("You are 56 years old");
                break;
            case 16:
                System.out.println("you are 16 years old");
                break;
            default:
                System.out.println("you did not match any of the case");
        }

         //print mond to sat based on number typed by the user .
         Scanner scan1 = new Scanner(System.in);
         System.out.println("Enter the number to know the weekday");
         int week = scan1.nextInt();

        switch(week){
            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("today is Tuesday");
                break;
            case 3:
                System.out.println("today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            case 5:
                System.out.println("today is Friday");
                break;
            case 6:
                System.out.println("today is Saturday");
                break;
            case 7:
                System.out.println("today is Sunday");
                break;
            default:
                System.out.println("Invalid number to know the day");
        }


    }
}
