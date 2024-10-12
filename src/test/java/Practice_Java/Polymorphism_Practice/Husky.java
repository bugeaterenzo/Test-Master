package Practice_Java.Polymorphism_Practice;

public class Husky extends Animal{


    // Constructor has no return type not even void

   public Husky ( String color , String name)
   {
       super(color , name);
   }

   // 2 methods with the same name but different definitions is called
   // Method Overriding in Javas Polymorphism...!

    @Override
   public void eat ()
   {
       System.out.println("Husky is Eating...!");
       super.eat();
   }





}
