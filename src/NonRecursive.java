class NonRecursive
{
    public static void main(String[] args)
    {
        int n = 4; // Set the desired size of the int array

        int[] intArray = new int[n];

        iterativeCall(intArray);
    }

    public static void iterativeCall(int[] intArray) {
        int n = intArray.length;
        int maxNum = 6;


        while (true) {
            // Process the current combination
            for (int num : intArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Generate the next combination
            int index = n - 1;
            while (index >= 0 && intArray[index] == maxNum - 1) {
                intArray[index] = 0;
                index--;
            }

            if (index < 0) {
                break; // All combinations generated
            }

            intArray[index]++;
        }
    }
}