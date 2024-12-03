import java.util.Scanner;

public class LearningConditionalStatements {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please Enter your age: ");
        int age = userInput.nextInt();

        System.out.println("___This is If else statements___");

        //If Else statements
        if(age > 0 && age <= 21){
            System.out.println("Person is Old");
        } else if (age > 21 && age <= 40) {
            System.out.println("Person is Older");
        } else if (age > 40 && age <=100) {
            System.out.println("Person is Oldest");
        }else{
            System.out.println("Invalid Entry");
        }

        System.out.println("___This Switch Case statements___");

        //switch-case statements
        switch (age){

            case 1:
                System.out.println("Person is Old");
                break;
            case 2:
                System.out.println("Person is old");
                break;
            case 25:
                System.out.println("Person is older");
                break;
            default:
                System.out.println("Invalid Entry");
                break;

        }

        System.out.println("This is the end of program");
        
    }

}
