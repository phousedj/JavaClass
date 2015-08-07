/*
Chris Leake
Java-UCLA Extension Summer 2015
Home Assignment #1
2015-07-06
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework1a {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem1");
        Problem1();

        System.out.println("\nProblem2");

        Problem2();


    }


    /*------------------------------------------------------------
    Problem #1
    Given a string "Today", reverse the string so that the result will be "yadoT".
    */
    public static void Problem1()
    {
        //declare variables
        String reverseThis = "Today";
        int length = reverseThis.length();

        for (int i = 1; i <= length; i++)
        {
            System.out.print(reverseThis.charAt(length-i));

        }
        System.out.println();
    }



    public static void Problem2()
    {
        int[][] arrays =
        {
                {1,0,1},
                {1,1,0},
                {0,0,1},
                {1,0,0},
                {0,1,1},
                {1,1,0}
        };

        for(int i=0; i<6 ;i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arrays[i][j]);
            }

            System.out.println();
        }


    }

}



