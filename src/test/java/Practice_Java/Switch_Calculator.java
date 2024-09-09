package Practice_Java;

import java.util.Scanner;

public class Switch_Calculator {


    public static void main (String[] args) {



        var in = new Scanner(System.in);

        System.out.print("Number 1 : ");
        int num1 = in.nextInt();

        System.out.print("Number 2 : ");
        int num2 = in.nextInt();

        System.out.print("Operation : ");
        String op = in.next();

        switch (op)
        {
            case "sum" :
                System.out.printf("%d + %d = %d " , num1 , num2 , num1 + num2);
                break;

            case "sub" :
                System.out.printf("%d - %d = %d " , num1 , num2 , num1 - num2);
                break;

            case "div" :
                System.out.printf("%d / %d = %d " , num1 , num2 , num1 / num2);
                break;

            case "mul" :
                System.out.printf("%d * %d = %d " , num1 , num2 , num1 * num2);
                break;

            default:
                System.out.printf("%s is not supported...!" , op);


        }







    }


}
