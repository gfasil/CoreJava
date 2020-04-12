
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayEx {

    public static <T> T[] findDuplicate(T[] input) {
        assert input.length < 0 : "array is empty";
        if (input != null) {
            Set<T> inputlist = new HashSet<>();
            boolean flag = false;
            for (T temp : input) {

                if (inputlist.contains(temp)) {

                    flag = true;
                    System.out.println("duplicate found " + temp);
                } else {
                    inputlist.add(temp);
                }
            }
            if (!flag) {
                System.out.println("no duplicates found ");
            }
            return (T[]) inputlist.toArray();
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findDuplicate(null)));
        System.out.println("\ud837\udd6c");
    }
}
