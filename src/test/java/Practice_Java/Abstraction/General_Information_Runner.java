package Practice_Java.Abstraction;

public class General_Information_Runner {


    public static void main(String[] args) {


        var obj = new Husky("Ghafor" , "Hunter" , "Gray");

//      var obj_2 = new General_Information(); can not create the object of abstract class...!

        System.out.println( obj.name );
        obj.eat();


    }

}
