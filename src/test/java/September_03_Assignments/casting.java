package September_03_Assignments;

public class casting {



    public static void main (String[] args) {

          int a=3,b=3,c=3;


//        Question 1: Implicit Casting

          int num_i_1 = 10;

          double num_d_1 = num_i_1;




//          Question 2: Explicit Casting

            double  num_d_2 = 9.8;

            int num_i_2 = (int) num_d_2;
            System.out.println(" (int) num_d_2 : " + num_i_2);



//            Question 3: Char to Int

              char  ch_1 = 'A';
              int num_i_3 = (int) ch_1;



//            Question 4: Long to Int Casting

              long  longNum_1 = 1000000L;
              int num_i_4 = (int) longNum_1;

              // result : 1.000.000
              // Nothing happens because 1.000.000
              // is still in the range of int datatype (-2.147.483.648 to +2.147.483.647).





//              Question 5: Float to Int

                float  pi = 3.14f;
                int num_i_5 = (int) pi;




//              Question 6: Narrowing Cast with Overflow


                long  bigNum = 2147483648L;

                int num_i_6 = (int) bigNum;

                // The value 2.147.483.648L is exactly 1 more than the maximum positive
                // int value (+2.147.483.647). When casting it to int, it overflows and wraps around
                // to the negative side of the int range due to 2's complement arithmetic.
                // The result is -2.147.483.648, which is the smallest possible int value.




//              Question 7: Casting Between Primitive and Wrapper Types

                Integer  num = 50;
                int num_i_7 =  num;  // no difference
                int num_i_8 = (int) num;  // no difference

//                System.out.println(num +  " " ); // 50
//                System.out.println(num + 10 +  " " ); // 60
//                System.out.println(num_i_7 + 10 +  " " ); // 60





//              Question 8: String to Int Conversion (Manual Casting)


                String  strNum = "123";
//              int num_i_9 = (int) strNum; // impossible





//              Question 9: Casting Larger Data Types to Smaller


                double  decimalValue = 123.456;
                byte byte_1 = (byte) decimalValue;

//              123.456 is still inside the range of -128 to +127
//              which is the size of Byte datatype.




//              Question 10: Object to Specific Type Casting


                Object  obj = "Hello";


//              Up_casting a String to Object:
//              Object is the superclass of all classes:
//              In Java, every class (including String) is a subclass of Object.
//              So, you can assign a String to a variable of type Object without any issues.
//              This is known as up_casting, where a subclass (like String) is assigned to a
//              variable of its superclass (Object).
//              In this case, Object obj = "Hello"; works because "Hello" is a String,
//              and String is a subclass of Object.


                String String_1 = (String) obj;


//              Down_casting back to String:
//              Later, when you declare String String_1 = (String) obj;, you're down_casting
//              the Object back to a String.
//              This works without an error because the actual object that obj holds is
//              still a String (it was initially assigned "Hello", which is a String),
//              and down_casting it to String is valid.






//              Experiment with Object and String :

                Object  obj_1 = 123;
                String String_2 = (String) obj_1; // does not work

//              result : Exception in thread "main" java.lang.ClassCastException:


                System.out.println(String_2  + " "  ); // 60


    }



}
