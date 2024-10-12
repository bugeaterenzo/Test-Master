package Practice_Java.Polymorphism_Practice;

public class Animal_Runner {

    public static void main(String[] args) {


        var obj = new Husky("gray" , "Ghafor");

        System.out.println(obj.name);
        obj.eat();
        obj.make_sound("woof woof" , "ruff ruff");


    }

}
