public class Recursive
{
    public static void main(String[] args)
    {
        int n = 9; // Set the desired size of the int array

        int[] intArray = new int[n];

        recursiveCall( intArray, 0);
    }

    private static void recursiveCall(int[] intArray, int index)
    {
        if (index == intArray.length)
        {
            for(int i = 0; i < intArray.length; i++)
            {
                System.out.print(intArray[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < 6; i++)
        {
            intArray[index] = i;
            recursiveCall(intArray, index + 1);
        }
    }
}