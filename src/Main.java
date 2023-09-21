import java.util.Scanner;

/*
    This is Quiz 2.1 about Methods.
    Author: Alexis C
    Date: 09-21-2023
 */

public class Main {

    public static void main(String[] args) {
        //declaring variables
        int numOne;
        int numTwo;
        int numThree;
        int numFour;
        int resultOne;
        int resultThree;
        String name;
        String resultTwo;
        String toBePrinted;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        numOne = scanner.nextInt();
        System.out.println("Please Enter another Number: ");
        numTwo = scanner.nextInt();
        scanner.nextLine();
        resultOne = add(numOne,numTwo);
        System.out.println(numOne + " + " + numTwo + " = " + resultOne);
        System.out.println("Next, Enter your name: ");
        name = scanner.nextLine();
        resultTwo = greeting(name);
        System.out.println(resultTwo);
        System.out.println("Please enter another number: ");
        numThree = scanner.nextInt();
        System.out.println("One more number please: ");
        numFour = scanner.nextInt();
        scanner.nextLine();
        resultThree = add(numOne,numTwo,numThree,numFour);
        System.out.println(numOne + " + " + numTwo + " + " + numThree + " + " + numFour +" = " + resultThree);
        System.out.println("One last thing, give me a word to print out for you: ");
        toBePrinted = scanner.nextLine();
        printMe(toBePrinted);


    }
    //Method "add" which adds two integers
    public static int add(int numOne, int numTwo)
    {
        return numOne + numTwo;
    }
    // Method "greeting" which prints out a greeting in French
    public static String greeting(String name)
    {
        return "Bonjour " + name + "!";
    }
    //Method "add" which adds four integers
    public static int add(int numOne, int numTwo, int numThree, int numFour)
    {
        return add(add(numOne,numTwo), add(numThree,numFour));
    }
    //Method "Print Me" which prints the user input
    public static void printMe(String toBePrinted)
    {
        System.out.println(toBePrinted);
    }

}
