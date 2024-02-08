import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        int j = 0;
        int p = 0;
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Integer> intsv2 = new ArrayList<>();
        intsv2.add(1);
        intsv2.add(2);
        intsv2.add(2);
        intsv2.add(2);
        intsv2.add(3);
        intsv2.add(4);
        intsv2.add(4);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        for (int i = 0; i<ints.size(); i++)
        {
            System.out.println(ints.get(i));
        }
        System.out.println(ints);
        while (j<ints.size())
        {
            System.out.println(ints.get(j));
            j++;
        }
        System.out.println(ints);
        for (int a : ints)
        {
            System.out.println(a);
        }
        System.out.println(ints);
        System.out.println(removeNum(intsv2, 2));
        try
        {
            for (int i = 0; i!=ints.size(); i++) {
                System.out.println(ints.remove(i));
            }
        }
        catch(Exception IndexOutOfBoundsException)
        {
            System.out.println("owch");
        }
        try
        {
            for (int x : ints) {
                ints.remove(x);
            }
        }
        catch (Exception ConcurrentModificationException)
        {
            System.out.println("ow");

        }
    }
    public static ArrayList<Integer> removeNum(ArrayList<Integer> arraylist, int val)
    {
        ArrayList<Integer> result = arraylist;
        for (int i = 0; i<arraylist.size(); i++)
        {
            if (result.get(i)==val)
            {
                result.remove(i);
                i--;
            }
        }
        return result;
    }
}
