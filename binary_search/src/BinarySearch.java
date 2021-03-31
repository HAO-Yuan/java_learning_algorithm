import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearch {
    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 15, 20, 54};
        List<Integer> integerList = Stream.of(intArray).collect(Collectors.toList());
        integerList.sort(Integer::compareTo);

        binarySearch(integerList, 9);
    }

    public static void binarySearch(List<Integer> integerList, int target) {
        int low = 0;
        int high = integerList.size() - 1;
        int mid = high / 2;

        while (low <= high) {
            if (target > integerList.get(mid)) {
                low = mid + 1;
            }
            else if (target < integerList.get(mid)) {
                high = mid -1;
            }
            else {
                System.out.println("exist");
                return;
            }
            mid = (low + high) / 2;
        }
        System.out.println("doesn't exist");
    }
}
