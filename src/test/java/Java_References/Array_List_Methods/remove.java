package Java_References.Array_List_Methods;
import java.util.ArrayList;

public class remove
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0 ); // returns boolean
        System.out.println(cars);
    }
}
