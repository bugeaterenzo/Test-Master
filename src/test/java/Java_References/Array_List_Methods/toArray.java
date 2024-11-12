package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class toArray
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Object[] carsArray = cars.toArray();

        for(Object item : carsArray)
        {
            System.out.println(item);
        }


//        The toArray() method returns an array containing all of-the items in the list.

//        If no argument is passed then the type of the returned array will be Object.
//        If an array is passed as an argument then this method will return an array with
//        the same data type.


        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");

        String[] carArray = new String[car.size()];
        carArray = car.toArray(carArray);

        for(String item : carArray)
        {
            System.out.println(item);
        }



    }
}
