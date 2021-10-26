package Assignmen101;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        int Input1, Input2;

        Scanner Input = new Scanner(System.in);
        System.out.printf("Input first integer: ");
        Input1 = Input.nextInt();
        System.out.printf("Input second integer: ");
        Input2 = Input.nextInt();
        /*
        Let's try!
        Input Data:
        Input first integer: 25
        Input second integer: 39
        */
        if (Input1!=Input2)
        {
            System.out.println(Input1 + " != " + Input2);
        }

        if (Input1<Input2)
        {
            System.out.println(Input1 + " < " + Input2);
        }

        if (Input1<=Input2)
        {
            System.out.println(Input1 + " <= " + Input2);
        }
    }
}
