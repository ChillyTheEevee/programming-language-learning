import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(0);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            list.clear();
            for (int j = 0; j < Integer.parseInt(args[i]); j++) {
                list.add(j);
            }
            System.out.println("Initial list: " + list);
            reverseList(list);
            System.out.println("Final list:   " + list);
        }
    }

    public static <T> void reverseList(List<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
    }

}
