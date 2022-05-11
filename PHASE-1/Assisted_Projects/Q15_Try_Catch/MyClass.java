package Ab_Ag_Int;

public class MyClass 
{
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
    }
}
