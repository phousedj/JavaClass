/*
Chris Leake
Java-UCLA Extension Summer 2015
Home Assignment #2
2015-07-13
*/


/*
Modified existing code to support methods. For example,

In task #1 have the following method
public static void String reverseString(String string);


In task #2,
public static int countYs(String string);


In task #3,
public static void printStar();


In task #4,
public static void printTip();
 */



import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;



//modified Homework1 to support specified functions calls
public class Homework2
{
    public static void main(String[] args) throws Exception
    {

        //problem1
        //declare variables
        String reverseThis = "Today";

        //reverse string and print
        System.out.println("Problem1");
        String reversedString = reverseString(reverseThis);
        System.out.println(reversedString);



        //problem2
        //declare variables
        String findInThisString = "Today is Tuesday-It is 4 days away from the 4th of July";

        //call method to count y's
        int countedYs = countYs(findInThisString);
        System.out.println("\nProblem2");
        System.out.println(findInThisString);
        System.out.println("Number of occurences of character \'y\': " +countedYs);



        //problem3
        //call method
        System.out.println("\nProblem3");
        printStar();



        //problem4
        System.out.println("\nProblem4");
        printTip();
    }



    /*------------------------------------------------------------
    Problem #1
    Given a string "Today", reverse the string so that the result will be "yadoT".
    */
    public static String reverseString(String string)
    {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }



    /*------------------------------------------------------------
    Problem #2
    Given a string "Today is Tuesday-It is 4 days away from the 4th of July", output the number of occurances for character 'y'. For example,
    input: "Tody is Tuesday-It is 4 days away from the 4th of July".
    output number of occurances for character 'y': 5
    */
    public static int countYs(String ysToCount)
    {
        char findChar = 'y';
        int count = 0;

        char[] findInThisArray = ysToCount.toCharArray();

        //need to iterate through each element in the array
        //evaluate if each character matches
        for (char x : findInThisArray)
        {
            if (x == findChar)
            {
                count++;
            }
        }

        return count;
    }



    /*------------------------------------------------------------
    Problem #3
    Using loops, print the following
    ********
    ******
    ****
    **
    *
    */
    public static void printStar()
    {
        //loops through 5x starting at 1, once for each output line
        //uses a function of the loop index to determine number of * to print
        //last character on each line includes a * and the newline
        for (int x=1; x<6; x++)
        {
            int y = (5-x)*2;
            while(y>1)
            {
                System.out.print("*");
                y--;
            }

            System.out.println("*");
        }
    }



    /*------------------------------------------------------------
    Problem #4
    Tip calculator. As a programmer, you are asked to write a program to calculate the amount you should tip. In your program, you need to
    ask for the following information from the user:

    Please enter the bill amount:
    Please enter the tip percentage (15% by default, if empty):

    Your output should be as follows:
    Tip amount: $15.23
    Total amount (Bill + tip): $58.26
    */
    public static void printTip() throws Exception
    {
        //setting up variables
        double billAmount = 1;
        double tipPercentage = 15;
        double tipAmount = 0;
        double billTotalAmount = 0;

        //input
        Scanner in = new Scanner(System.in);


        //prompt user and capture input
        //how do i sanitize and standardize the input?
        //professor indicates we dont need to sanitize input
        System.out.println("Please enter the bill amount: ");
        billAmount = in.nextDouble();
        System.out.println("Please enter the tip percentage (15% by default, if empty): ");


        //grab percentage as string
        //using BufferedReader lets us accept blank input
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String tipPercentageString = br.readLine();


        //if not blank, then use default value
        if(!tipPercentageString.isEmpty())
        {
            tipPercentage = Double.parseDouble(tipPercentageString);
        }


        //convert to decimal
        tipPercentage /= 100;

        //calculate amounts
        tipAmount = billAmount * tipPercentage;
        billTotalAmount = tipAmount + billAmount;


        //setup format
        DecimalFormat myFormatter = new DecimalFormat("$###.00");


        //output results
        System.out.println("Tip amount: " + myFormatter.format(tipAmount));
        System.out.println("Total amount (Bill + tip): " + myFormatter.format(billTotalAmount));
    }

}