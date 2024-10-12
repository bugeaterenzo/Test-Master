package Practice_Java.Abstraction;

public class Husky extends General_Information {


    // Constructor has no return type not even void

   public Husky(String name , String type  , String color )
   {
       super( name , type , color);
   }

    // super.eat(); can not access abstract method...!

   // 2 methods with the same name but different definitions is called
   // Method Overriding in Javas Polymorphism...!

    @Override
   public void eat ()
   {
       System.out.println("Husky is Eating...!");

   }


}
