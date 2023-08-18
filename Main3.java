// Loops

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main3 {
    public static void main(String[]args) {
        //Loops
             /* 1.while loop -
                while(condition){
                    code () - //this code will keep executing till true condition
                    }
            */

        float i = 0;
        while (i < 100) {
            System.out.println(i);
            i += 1;
        }
            /* 2.Do while loop -
                Do {
                    code()
                }while(condition)
             */
        int j = 0;
        do {
            System.out.println(j);
            j += 1;
        } while (j > 100);


         /* 3.For loop
            for(statement1 ; statement2 ; statement 3){
               code to be executed
               }
          */

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
        // break keyword used in for loop to stop the loop at that situation .
        // continue keyword

        for (int a = 0; a <= 10; a++) {
            if (a > 2) {
                break;
            } else {
                System.out.println(a);
            }
        }

        for (int a = 0; a <= 10; a++) {
            if (a == 2) {
                continue;
            }
            System.out.println(a);
        }

    }
}
