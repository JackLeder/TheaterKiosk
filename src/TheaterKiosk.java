/*
As people pass through an entry kiosk at the theater, they are prompted to enter their age.
If they are 21 or older, they get a paper wrist band.
Code a logic program that asks the user to enter their age and
then if they are 21 or over displays a message that they get a wrist band.
Note that the program does nothing if they are not 21 or over…

 */

import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        int trash;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");


        if (input.hasNextInt()){
            int age = input.nextInt();
            if (age >= 21) {
                System.out.println("You get a wrist band because you are " + age + " years old.");
            }

        }
        else {
            trash = input.nextInt();
            System.out.println("invalid choice");
            System.exit(0);
        }


    }
}
