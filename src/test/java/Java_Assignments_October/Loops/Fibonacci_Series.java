package Java_Assignments_October.Loops;

public class Fibonacci_Series {


    public static void main(String[] args) {




            int[] fibonaci = new int[10];

            int first = 0;
            int second = 1;

            fibonaci[0] = first;
            fibonaci[1] = second;

//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34

//        fibonaci[0] = 0
//        fibonaci[1] = 1
//        fibonaci[2] = 1
//        fibonaci[3] = 2
//        fibonaci[4] = 3
//        fibonaci[5] = 5
//        fibonaci[6] = 8
//        fibonaci[7] = 13
//        fibonaci[8] = 21
//        fibonaci[9] = 34

        for ( int i = 2; i < fibonaci.length; i++)
        {
            fibonaci[i] = fibonaci[first] + fibonaci[second]; // 7 + 8
            first++;
            second++;
        }

        for ( int number : fibonaci)
        {
            System.out.print(number + " ");
        }
















    }

}
