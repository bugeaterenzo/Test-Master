public class Extra_Questions {


    public static void main (String[] args){



//        1 :

        String text = "Java is more than just Java, it's a platform!";
        String new_text = text.replace("Java" , "JAVA");

//        System.out.println(text);
//        System.out.println(new_text);





//        2 :

        String message = "                  Hello, World!        ";
        String new_message = message.trim();
        String new_message_2 = message.replace(" " , "");

//        System.out.println(message);
//        System.out.println(new_message);
//        System.out.println(message);
//        System.out.println(new_message_2);





//        3 :

        String word_1 = "Java";
        String word_2 = "Java";

        String Compare_result =  (word_1.equals(word_2)) ? "Equal" : "Not_Equal";
//        System.out.println(" The Strings " + word_1 + " and " + word_2 +  " are : " + Compare_result);

        int id_1 = System.identityHashCode(word_1);
        int id_2 = System.identityHashCode(word_2);

//        System.out.println("Id of word_1 is : " + id_1);
//        System.out.println("Id of word_2 is : " + id_2);





//        4 :

        String word_3 = "   ERROR   ";

        String word_4 = word_3.trim().toLowerCase().replace("error" , "warning");

//        System.out.println(word_3);
//        System.out.println(word_4);





//        5 :

        String word_5 = "enviroment";


        int index = word_5.indexOf('e');
//        System.out.println(index);


        for( int i = 0 ; i < word_5.length(); i++){
            char C = word_5.charAt(i);
//            if (C == 'e')  System.out.println( "At index " + i + " there is an e ! ");
        }





//        6 :

        String word_6 = "concatenation";

        int index_2 = word_6.indexOf("cat");
//        System.out.println("Index of subString cat is : " + index_2);



        int c_counter = 0;

        for( int i = 0 ; i < word_6.length(); i++){

            char C = word_6.charAt(i);

            if (C == 'c' ) {
                ++c_counter;
            }

             if ( C == 'c' && c_counter > 1) {
//                System.out.println("Index of subString cat is : " + i);
            }
        }






//        7 :

        String word_7 = "Hello, world!";

        int index_3 = word_7.indexOf("java");
        System.out.println(index_3);



//      8 :

        int a = 2;
        int b = 3;

        int result = add(a,b);



//        System.out.println(result);


    }



    public static int add( int a , int b){
        return a + b ;
    }






}
