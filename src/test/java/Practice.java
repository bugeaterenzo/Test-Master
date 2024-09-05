import java.util.Arrays;
import java.util.Scanner;

public class Practice {



    public static void main (String[] args){

//        var in = new Scanner(System.in);
//
//        System.out.print("enter your name :");
//        String name = in.next();
//
//        System.out.print("enter your lastName :");
//        String lastName = in.next();
//
//        System.out.print("enter your age :");
//        String age = in.next();
//
//        System.out.print("enter your height :");
//        String height = in.next();
//
//        String[] employee = new String[4];
//
//        employee[0] = name;
//        employee[1] = lastName;
//        employee[2] = age;
//        employee[3] = height;
//
//
//        for ( int i = 0; i< employee.length; i++){
//            System.out.println(employee[i]);
//        }


        int[][] number =
                    {
                              {1,2}
                            , {3,4}
                            , {5,6}
                    };

//        System.out.println(number[0][0]);
//        System.out.println(number[0][1]);
//
//        System.out.println(number[1][0]);
//        System.out.println(number[1][1]);
//
//        System.out.println(number[2][0]);
//        System.out.println(number[2][1]);

        int[][] numbers = new int[3][2];

        numbers[0][0] = 1;
        numbers[0][1] = 1;
        numbers[1][0] = 1;
        numbers[1][1] = 1;
        numbers[2][0] = 1;
        numbers[2][1] = 1;

//        System.out.println(number[0][0]);
//        System.out.println(number[0][1]);
//
//        System.out.println(number[1][0]);
//        System.out.println(number[1][1]);
//
//        System.out.println(number[2][0]);
//        System.out.println(number[2][1]);

//        System.out.println(number[0]);
//        System.out.println(numbers[0]);

        String name = "ali";


        String[][][] employee = { { {"john" , "bane"} , {"michle" , "stephen"} }, { {"gabriel" , "gomez"} , {"frank" , "stein"} }, { {"alex" , "watson"} , {"jack" , "sparrow"} }, { {"peter" , "normandy"} , {"johny" , "cash"} }, { {"uncle" , "sam"} , {"flex", "jofery"} }, { {"stanis" , "brathion"} , {"john" , "snow"} }, { {"rob" , "stark"} , {"jesus" , "nazerath"} },};

//        System.out.println(employee[1][0][0] + " " + employee[1][0][1]);
//
//        employee[1][0][1] = employee[1][0][1].replace("gomez" , "donuts") ;
//        System.out.println(employee[1][0][0] + " " + employee[1][0][1]);
//
//        employee[1][0][1] = employee[1][0][1].replace("s" , "_") ;
//        System.out.println(employee[1][0][0] + " " + employee[1][0][1]);
//
//        employee[1][0][1] = employee[1][0][1].replace("_" , "ello") ;
//        System.out.println(employee[1][0][0] + " " + employee[1][0][1]);


        System.out.println(employee[1][0][0].substring(2 ,4) + employee[1][0][1].substring(1 ,4));
        System.out.println(employee[1][0][0].charAt(0) + "" + employee[1][0][1].charAt(0));

        int multiplyer = 0;

        for(int i = 1; i <=10; i++){
            System.out.println(i + "  * " + " 2  =  " +  i * 2);
        }





//        System.out.println(Arrays.toString( employee[0][0] ));
//        System.out.println(Arrays.toString( employee[3][1] ));
//        System.out.println(Arrays.deepToString(employee) );
//        System.out.println("==============================================================================");
//        System.out.println(Arrays.asList(employee));
//        System.out.println(Arrays.toString(employee));
//        System.out.println("==============================================================================");




//                                     0             1
//                                  0     1       0     1
        char[][][] alphabet = { { {'a' , 'b'} , {'c' , 'd'} },          // 0
                                { {'e' , 'f'} , {'g' , 'h'} },          // 1
                                { {'i' , 'g'} , {'k' , 'l'} },          // 2
                                { {'m' , 'n'} , {'o' , 'p'} },          // 3
                                { {'q' , 'r'} , {'s' , 't'} },          // 4
                                { {'u' , 'v'} , {'w' , 'x'} },          // 5
                                { {'y' , 'z'} , {'_' , '_'} },          // 6
                              };

//                System.out.print( alphabet[0][0][0]  + " " );
//                System.out.print( alphabet[0][0][1]  + " " );
//                System.out.print( alphabet[0][1][0]  + " " );
//                System.out.print( alphabet[0][1][1]  + " " );
//
//                System.out.print( alphabet[1][0][0]  + " " );
//                System.out.print( alphabet[1][0][1]  + " " );
//                System.out.print( alphabet[1][1][0]  + " " );
//                System.out.print( alphabet[1][1][1]  + " " );
//
//                System.out.print( alphabet[2][0][0]  + " " );
//                System.out.print( alphabet[2][0][1]  + " " );
//                System.out.print( alphabet[2][1][0]  + " " );
//                System.out.print( alphabet[2][1][1]  + " " );
//
//                System.out.print( alphabet[3][0][0]  + " " );
//                System.out.print( alphabet[3][0][1]  + " " );
//                System.out.print( alphabet[3][1][0]  + " " );
//                System.out.print( alphabet[3][1][1]  + " " );
//
//                System.out.print( alphabet[4][0][0]  + " " );
//                System.out.print( alphabet[4][0][1]  + " " );
//                System.out.print( alphabet[4][1][0]  + " " );
//                System.out.print( alphabet[4][1][1]  + " " );
//
//                System.out.print( alphabet[5][0][0]  + " " );
//                System.out.print( alphabet[5][0][1]  + " " );
//                System.out.print( alphabet[5][1][0]  + " " );
//                System.out.print( alphabet[5][1][1]  + " " );
//
//                System.out.print( alphabet[6][0][0]  + " " );
//                System.out.print( alphabet[6][0][1]  + " " );
//                System.out.print( alphabet[6][1][0]  + " " );
//                System.out.print( alphabet[6][1][1]  + " " );


                int time = 582;

                double hour = time / 60;
                int minutes = time % 60;

//                System.out.println(time + " minutes is " + hour + " hours and " + minutes + " minutes. ");







    }




}
