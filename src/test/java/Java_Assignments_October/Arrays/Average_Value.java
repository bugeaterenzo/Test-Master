package Java_Assignments_October.Arrays;

public class Average_Value {


    public static void main(String[] args) {



        int[] numbers = { 85, 90, 78, 88, 76, 93 };


        int total = 0;
        int average = 0;

        for (int number : numbers)
        {
            total += number;
            average = total / numbers.length;

        }

        System.out.println( " The Average Grade is ----> " + average );















    }


}
