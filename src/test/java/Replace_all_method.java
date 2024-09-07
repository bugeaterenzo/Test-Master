public class Replace_all_method {


    public static void main (String[] args) {



        String x = "    ABCEDFGHabcdefghljf;laj;k 123456 !@!#@$%%^% v UHPOSO OJPOAS W JAVA.JAV     ";

        System.out.println(x.replaceAll( " " , "" ));

//      This line of code replaces all spaces (" ") with an empty string ("").
//      This is straightforward because it matches every space character (i.e., " ")
//      in the string and removes it. The result will be the string without any spaces.




        System.out.println(x.replaceAll( "[a-zA-Z0-9]" , "" ));

//      In this case, you're replacing all alphabetic characters (both lowercase and uppercase)
//      and numeric characters (0-9) with an empty string. However, this does not match special
//      characters like !@!#@$%%^%, ;, or spaces. These characters are left unchanged because
//      they are not included in the character set [a-zA-Z0-9].


        System.out.println(x.replaceAll( "[^a-z]" , "" )); // replace all except a-z
        System.out.println("Lowercase count : " + x.replaceAll( "[^a-z]" , "" ).length());

        System.out.println(x.replaceAll( "[^A-Z]" , "" ));// replace all except A-Z
        System.out.println("Uppercase count : " + x.replaceAll( "[^A-Z]" , "" ).length());

        System.out.println(x.replaceAll( "[^0-9]" , "" ));// replace all except 0-9
        System.out.println("Numerics count : " + x.replaceAll( "[^0-9]" , "" ).length());






    }



}
