/*
Chris Leake
Java-UCLA Extension Summer 2015
Home Assignment #3
2015-07-27
*/


/*
1. Given an int array, find out what's the max value in the array

Given: int[] intArray = { 1, 8, 100, 29, 87};
Output: The max value of the array is : 100

Points: 25

2. Given a 3 X 3 array of type int, find total for rows and columns

1 3 5
8 5 2
1 9 4

output:
row[0] Total: 9
row[1] Total: 15
row[2] Total: 14

column[0] Total: 10
column[1] Total: 17
column[2] Total: 11

Points: 50

3. Get user input and store into ArrayList and print

java Demo "one" "two" "three" "monday" "wednesday" "thursday" "friday"

Note: You must read from the String[] args and add it to an ArrayList. The above is just an example. I will test the program by adding random parameters. Your program should be able to handle all the parameters given.
Output from ArrayList: Whatever I entered as parameters when running the program.

Points: 25
 */



import java.util.*;


public class Homework3 {
    public static void main(String[] args){

        //problem1
        System.out.println("\n\nProblem 1");
        int[] intArray = {1, 8, 100, 29, 87};
        int maxValue = maxArrayValue(intArray);
        System.out.println("The max value of the array is : " + maxValue);

        //problem2
        System.out.println("\n\nProblem 2");
        int[][] intIntArray = {{1, 3, 5}, {8, 5, 2}, {1, 9, 4}};
        printArrayDimensionTotal(intIntArray, 'r', 3);
        System.out.println();
        printArrayDimensionTotal(intIntArray, 'c', 3);

        //problem3
        System.out.println("\n\nProblem 3");
        System.out.print("Program arguments: ");
        printArraylist(args);
        System.out.println();

    }



    /*------------------------------------------------------------
    Problem #1
    Given an int array, find out what's the max value in the array
    */
    public static int maxArrayValue(int intArray[]) {
        Arrays.sort(intArray);
        return (intArray[intArray.length - 1]);
    }



    /*------------------------------------------------------------
    Problem #2
    Given a 3 X 3 array of type int, find total for rows and columns
    */
    public static void printArrayDimensionTotal(int intArray[][], char d, int dimension){

        int[] totalsArray;
        totalsArray = new int[dimension];


        //if row then loop through each row and add to totals array
        if (d == 'r'){
            for (int i = 0; i< dimension; i++) {
                totalsArray[i] = intArray[i][0] + intArray[i][1] + intArray[i][2];
                System.out.println("row[" + i + "] Total: " + totalsArray[i]);
            }
        }

        //if column then loop through each column and add to totals array
        else if (d == 'c'){
            for (int i = 0; i< dimension; i++) {
                totalsArray[i] = intArray[0][i] + intArray[1][i] + intArray[2][i];
                System.out.println("column[" + i + "] Total: " + totalsArray[i]);
            }
        }
    }



    /*------------------------------------------------------------
    Problem #3
    Get user input and store into ArrayList and print
    */
    public static void printArraylist(String[] args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(args));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }


}



