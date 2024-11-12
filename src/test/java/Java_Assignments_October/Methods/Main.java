package Java_Assignments_October.Methods;

import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {

        Print_Entry PE = new Print_Entry();
        Separate_Line SL = new Separate_Line();



        Basic_Method_Creation BMC = new Basic_Method_Creation();
        BMC.greet("Hello John!");
        SL.seperate();


        Compute_Average CA = new Compute_Average();
        double result_1 = CA.calculateAverage(15.2 , 33.8,22.71);
        PE.print(result_1);
        SL.seperate();



        Recursive_Method RM = new Recursive_Method(7);
        int result_2 = RM.factorial();
        PE.print(result_2);
        SL.seperate();



        Variable_Arguments VA = new Variable_Arguments();
        int result_3 = VA.sum(1 , 3 , 5);
        PE.print(result_3);
        SL.seperate();



        Return_Multiple_Values RMV = new Return_Multiple_Values();
        int[] numbers = {1,12,8,2,3,46,644,9,5,22};
        Map result_4 = RMV.minMax(numbers);
        PE.print(result_4);
        SL.seperate();



        Passing_Arrays PA = new Passing_Arrays();
        int[] nums = {1,12,8,2,3,46,644,9,5,22};
        int[] copy = PA.reverseArray(nums);
        PE.print(copy);
        SL.seperate();


        Void_Methods VM = new Void_Methods();
        VM.printPattern(10);
        SL.seperate();



        Temperature_Conversion TC = new Temperature_Conversion();
        double result_5 = TC.celsiusToFahrenheit(47);
        PE.print(result_5);
        SL.seperate();


    }


}
