import java.math.BigInteger;

public class AllCombinationsBigInteger {
    public static void main(String[] args) {
        int signumPositive = 1;
        int n = 2; // Set the desired size of the byte array

        byte[] byteArray = new byte[n];
        generateCombinations(signumPositive, byteArray, 0);
    }

    private static void generateCombinations(int signum, byte[] byteArray, int index) {
        if (index == byteArray.length) {
            BigInteger positiveBigInteger = new BigInteger(signum, byteArray);
            System.out.print("Positive BigInteger: " + positiveBigInteger + " <==> byte[]: [");
            for(int i = 0; i < byteArray.length; i++)
            {
                if(i == byteArray.length-1)
                    System.out.print(byteArray[i]);
                else
                    System.out.print(byteArray[i] + ",");
            }
            System.out.print("]");
            System.out.println();
            return;
        }

        for (int i = 0; i < 256; i++) {
            byteArray[index] = (byte) i;
            generateCombinations(signum, byteArray, index + 1);
        }
    }
}