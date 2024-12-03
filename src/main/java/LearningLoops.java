import java.util.Scanner;

public class LearningLoops {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

//      for(int i = 0 ; i < 10 ; i++){
//          System.out.println(i);
//      }
        //index    0  1  2  3  4
    int[] array = {65,36,42,75,95};

        System.out.println("Array Elements:");
        for(int i = 0 ; i < array.length ; i++){
            System.out.print( array[i] + ",");
        }
        System.out.println("\nPlease enter eny element to get its index:");
        int num = userinput.nextInt();

        System.out.println("This is for loop.");
        for(int i = 0 ; i < array.length ; i++){
            if(num == array[i]){
                System.out.println(array[i] + " element is stored on " + i + " index.");
            }
        }

        System.out.println("This is while loop.");
        int i = 0;
        while(i < array.length){
            if(num == array[i]){
                System.out.println(array[i] + " element is stored on " + i + " index.");
            }
            i++;
        }

        System.out.println("This is do while loop.");

        int j = 0;
        do{
            if(num == array[j]){
                System.out.println(array[j] + " element is stored on " + j + " index.");
            }
            j++;
        }while (j < array.length);


    }

}
