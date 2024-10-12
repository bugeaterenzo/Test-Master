package Practice_Java.Abstraction;

public abstract class General_Information {


    public String name ;
    public String type;
    public String color;

    public General_Information( String name , String type , String color )
    {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    // can not be final , private or static
    // if it is static then it belongs to the class and
    // not the object there for it can not be overridden...!

    public abstract void eat();



}
