import java.util.Arrays;
import java.util.Scanner;

public class LearningMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("This is a built-in method");
//
//        int num = scanner.nextInt();
//
//        int[] myArray = {25,35,62,41,27};
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
//
//        System.out.println(Math.min(23,67));
//        System.out.println(Math.max(64,72));
//        System.out.println(Math.sqrt(16));

        System.out.println("Please enter 1st number:");
        int num1 = scanner.nextInt();

        System.out.println("Please enter 2nd number:");
        int num2 = scanner.nextInt();


        System.out.println("Please enter 1-4 options:\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
        int num = scanner.nextInt();

        switch(num){
            case 1:
                addition(num1,num2);
                break;
            case 2:
                System.out.println(subtraction(num1,num2) + 5);
                break;
            case 3:
                multiplication(num1 , num2);
                break;
            case 4:
                division(num1,num2);
                break;
            default:
                System.out.println("Please Enter a valid number");
                break;
        }


    }

    public static void addition(int num1 , int num2){
        System.out.println(num1 + num2);
    }

    public static int subtraction(int num1 , int num2){
        return num1 - num2;
    }

    public static float multiplication(int num1 , int num2){
        return num1 * num2;
    }

    public static double division(int num1 , int num2){
        return num1 / num2;
    }

}

