package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class ensureCapacity
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.ensureCapacity(15);
        System.out.println("Length of the list is : "+list.size());

        for (int i = 1; i <= 16; i++)
        {
            list.add(i);
        }
        System.out.println(list);
    }
}
