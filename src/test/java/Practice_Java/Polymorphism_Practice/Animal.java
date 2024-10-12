package Practice_Java.Polymorphism_Practice;

public class Animal {

    public String color;
    public String name ;

    public Animal ( String color, String name)
    {
        this.color = color;
        this.name = name;
    }

    // can not be final , private or static
    // if it is static then it belongs to the class and
    // not the object there for it can not be overridden...!

    public void eat()
    {
        System.out.println("Animal is eating...!");
    }


    // Method overloading :

    public void make_sound (String sound_1)
    {
        System.out.println(this.name + " makes the sound " + sound_1 + " by birth...!");
    }

    public void make_sound (String sound_1 , String sound_2)
    {
        System.out.println(this.name + " makes the sound " + sound_1 + " and " + sound_2 + " by birth...!");
    }


}
