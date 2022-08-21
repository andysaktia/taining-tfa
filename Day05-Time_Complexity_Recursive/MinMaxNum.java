import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MinMaxNum {

    public static void main(String[] args) {
       // Scanner read = new Scanner(System.in);
        //int a = read.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(-2);
        list.add(-1);
        list.add(8);

        // print min and max value of ArrayList
        System.out.println("Min: " + fMin(list));
        System.out.println("Max: " + fMax(list));

    }

    public static Integer fMin(List<Integer> list)
    {
        Integer min = Integer.MAX_VALUE;

        for (Integer i : list) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }
    public static Integer fMax(List<Integer> list)
    {
        Integer max = Integer.MIN_VALUE;

        for (Integer i : list) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }
}
