package search;

public class BinarySearch {

    public int search(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = numbers[mid];

            if (key < midValue) {
                high = mid - 1;
            } else if (key > midValue) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
