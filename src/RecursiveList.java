import java.util.ArrayList;
import java.util.List;

class RecursiveList
{
    public static void main(String[] args)
    {
        int n = 3;
        List<Integer> list = new ArrayList<>();
        recursiveCall(list, n, 0);
    }

    public static void recursiveCall(List<Integer> list, int n, int index)
    {
        if (index == n)
        {
            list.forEach(a-> System.out.print(a+" "));
            System.out.println();
            return;
        }

        for(int i = 0; i < 7; i++)
        {
            list.add(index,i);
            recursiveCall(list, n,index+1);
            list.remove(list.size()-1);
        }
    }
}