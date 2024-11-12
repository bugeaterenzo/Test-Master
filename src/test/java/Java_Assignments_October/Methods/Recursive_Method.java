package Java_Assignments_October.Methods;

public class Recursive_Method
{
    int result;
    int n;
    int index;

    public Recursive_Method ( int n)
    {
        this.n = n;
        this.index = n - 1;
    }
    public int factorial()
    {

        if ( index > 0) result = n * (index);

        n = result;
        --index;

        while(index > 0) { factorial(); }

        return result;
    }
}
