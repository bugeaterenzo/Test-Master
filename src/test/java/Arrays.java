public class Arrays {



    public static void main (String[] args) {



            int[] num = new int[1];


            num[0] = 1;


            System.out.println(num);

//          result  : [I@1cd072a9

//                  [I indicates that the object is a one-dimensional array of type int.

//                  [ signifies an array.

//                  I stands for the int type (if it were double[], you'd see [D, for example).

//                  @1cd072a9 is the hash code in hexadecimal form of the array object,
//                  represented in hexadecimal form.This hash code is specific to this
//                  instance of the array.
//


//          When you write System.out.println(num);, you are asking Java to print the
//          object reference of the num array, not its contents. Since arrays in Java
//          are objects, they inherit the .toString() method from the Object class, and
//          by default, the .toString() method for an object returns a string in this
//          format:   [I@1cd072a9

//          When you print the array directly or indirectly with the .toString() method
//          the result displays the hash code in hexadecimal format.
//




            System.out.println(num.hashCode());

//          result : 483422889

//          num.hashCode() :
//
//          The .hashCode() method returns an integer hash code, which is not in hexadecimal format.
//          The value 483422889 you see when calling num.hashCode() is the hash code in decimal format.



            System.out.println(num[0]);

//          result : 1







    }


}
