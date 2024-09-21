package Practice_Java;

public class Getters_and_Setters_Runner {


    public static void mian (String[] args)
    {



        Getters_and_Setters obj = new Getters_and_Setters();

        obj.setAge(12);
        obj.setDateOfBirth("18/07/2000");

        System.out.println( obj.getAge());
        System.out.println( obj.getDateOfBirth());



    }
}


