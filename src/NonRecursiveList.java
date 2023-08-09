import java.util.ArrayList;
import java.util.List;

class NonRecursiveList
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(0);
        }
        iterativeCall(list);
    }

    public static void iterativeCall(List<Integer> list) {
        int n = list.size();
        int maxNum = 4;

        while (true) {
            // Process the current combination
            list.forEach(a -> System.out.print(a+" "));
            System.out.println();

            // Generate the next combination
            int index = n - 1;
            while (index >= 0 && list.get(index) == maxNum - 1) {
                list.set(index, 0);
                index--;
            }

            if (index < 0) {
                break; // All combinations generated
            }

            list.set(index, list.get(index) + 1);
        }
    }
}