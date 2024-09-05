package September_03_Assignments;

public class increment_decrement {



    public static void main (String[] args) {

//        Question 1: Basic Increment

        int x = 5;
        x++;
//        System.out.print(x + " ");


//        Question 2: Basic Decrement

        int y = 5;
        y--;
//        System.out.print(y + " ");


//        Question 3: Post-Increment

        int a = 7;
        a++;
//        System.out.print(a + " ");



//        Question 4: Post-Decrement

        int b = 15;
        b--;
//        System.out.print(b + " ");



//        Question 5: Pre-Increment

        int c = 3;
        ++c;
//        System.out.print(c + " ");



//        Question 6: Pre-Decrement

        int d = 20;
        --d;
//        System.out.print(d + " ");




//        Question 7: Using Increment in an Expression

        int p = 5;
        int result_1 = p++ + 2; // Here the original value of p = 5 is used with an Expression (operator!).
        System.out.print("result = " + result_1 + " ");
        System.out.print("p = " + p + " ");




//        Question 8: Using Decrement in an Expression

        int q = 5;
        int result_2 = q-- + 2; // Here the original value of p = 5 is used with an Expression (operator!).
        System.out.print("result = " + result_2 + " ");
        System.out.print("p = " + p + " ");




//        Question 9: Pre-Increment in an Expression

        int r = 4;
        int result_3 = r-- * 2;
        System.out.print("result = " + result_3 + " ");
        System.out.print("r = " + r + " ");




//        Question 10: Pre-Decrement in an Expression

        int s = 12;
        int result_4 = --s / 3;         // first s is decremented to 11 and then divided by 3.
        int modulo_1 = s % 3;           // that is why we get the remainder of 2.
        System.out.print("result = " + result_4 + " ");
        System.out.print("modulo = " + modulo_1 + " ");
        System.out.print("s = " + s + " ");





//        Question 11: Multiple Increments


        int e = 1; int f = 2;
        int result_5 = e++ + ++f;

        System.out.print("result = " + result_5 + " ");
        System.out.print("e = " + e + " ");
        System.out.print("f = " + f + " ");




//        Question 12: Mixed Increments and Decrements

        int g = 10; int h = 5;
        int result_6 = g-- - ++h;

        System.out.print("result = " + result_6 + " ");
        System.out.print("g = " + g + " ");
        System.out.print("h = " + h + " ");





//        Question 13: Increment with Arithmetic Operation

        int i = 7;
        int result_7 = i++ * 2 + --i;           // first 7 * 2 = 14 then i++ ---> i = 8 then 14 + --i ---> 14 + 7 = 21

        System.out.print("result = " + result_7 + " ");
        System.out.print("i = " + i + " ");





//        Question 14: Decrement with Arithmetic Operation

        int l = 14;
        int result_8 = --l + l-- * 3;           // --l = 13 is done first then l * 3 = 39 then 39 + 13 = 52 then l-- = 12

        System.out.print("result = " + result_8 + " ");
        System.out.print("l = " + l + " ");




//        Question 15: Pre and Post-Increment in Same Expression

        int m = 3;
        int result_9 = ++m + m++;

        System.out.print("result = " + result_9 + " ");
        System.out.print("m = " + m + " ");




//        Question 16: Pre and Post-Decrement in Same Expression

        int n = 9;
        int result_10 = --n - n--;


        System.out.print("result = " + result_10 + " ");
        System.out.print("n = " + n + " ");


//        Question 17: Using Increment in an If Statement


        // first increment then compare
        int o = 4; if (++o == 5) { System.out.println("Equal"); } else { System.out.println("Not Equal"); }





//        Question 18: Using Decrement in a While Loop Condition

        int t = 5; while (t-- > 0) { System.out.println(t); }           // first decrement then compare





//        Question 19: Combining Increment and Decrement in a Condition

        int u = 10; int v = 5; if (u-- > 9 && ++v > 5)          // first compare u > 9 then u-- = 9 then ++v = 6 then compare v > 5
        { System.out.println("True"); } else { System.out.println("False"); }





//        Question 20: Nested Increment and Decrement


        int w = 2; int z = 3;
        int result_11 = ++w + z++ - --z;


        System.out.print("result = " + result_11 + " ");
        System.out.print("w = " + w + " ");
        System.out.print("z = " + z + " ");






    }




}
