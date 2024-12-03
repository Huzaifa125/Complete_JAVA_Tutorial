import java.util.Scanner;

public class TakeUserInput {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("____This is multiplication program made by Codetron____");

        System.out.println("Please Enter 1st number:");
        double num1 = userInput.nextDouble();

        System.out.println("Please Enter 2nd number:");
        double num2 = userInput.nextDouble();

        System.out.println("Multiplication of two numbers are : " + num1 * num2);


    }

}
