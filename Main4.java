// Arrays

import java.util.Scanner;



public class Main4 {
    public static void main (String[] args){
        // java arrays
        int [] marks={1,2,3,5};
        marks[3]=35; // updating the index
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        // classical way to iterate an array
        System.out.println("Iteration by classical method");
        for(int i=0 ; i <marks.length; i++) {
            System.out.println(marks[i]);
        }

        // for each loop
        System.out.println("Value for each loop");
        for(int value:marks){
            System.out.println(value);
        }

        // - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - -- - - - - - - - - - - - - - -
        // concept of matrix -
        int [][] matrix = {{1,2,3},
                           {4,5,6}};
        System.out.println(matrix[0][1]);

        String []cars = {"maruti", "suzuki" , "ford" , "alto" , "innova"};
        for(String value : cars){
            System.out.println(value);
        }

        System.out.println("My fav people - ");
        String [] crushes = {"mehul","dad","uma","mom","harsh"};
        for( String value : crushes){
            System.out.println(value);
        }


    }
}



