package Practice_Java;

public class Float_Double {





    public static void main (String[] args) {



//      Precision:

        float weight = 1234567.8F;
        System.out.println(weight);

//      float:  32-bit IEEE 754 single-precision.
//              Can store approximately 7 decimal digits of precision.

//        ex:   When you declare a float as float weight = 1234567.845432F;, Java rounds
//              the value because float only supports about 7 significant digits. So any
//              additional digits after 7 digits (both before and after the decimal) may
//              be truncated or rounded.


        double salary = 1234567.1234567891;
        System.out.println(salary);

//      double: 64-bit IEEE 754 double-precision.
//              Can store approximately 15–16 decimal digits of precision.
//              So, the important thing to understand here is that both float
//              and double have limitations on the number of significant digits
//              they can store, not just digits before or after the decimal point.
//
//     Example: When you declare a double as double salary =
////            1234567.1234567891;, Java can handle more precision (about 15–16 digits),
////            but it still may round or truncate the number slightly due to the finite
////            precision of the double type.
//
//
//
//
//














    }





}
