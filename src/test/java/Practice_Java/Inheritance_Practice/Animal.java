package Practice_Java.Inheritance_Practice;

public class Animal {

    public String name;
    public int age;

    public Animal (String name , int age)
    {
        this.name =  name;
        this.age =  age;

    }

    public void eat()
    {
        System.out.println("Eating");
    }

    public void sleep()
    {
        System.out.println("Sleeping");
    }


}
