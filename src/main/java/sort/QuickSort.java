package sort;

public class QuickSort implements Sort {

    public void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private void quickSort(int[] numbers, int left, int right) {
        //리스트 크기가 2 이상이면
        if (left < right) {

            // pivot 기준으로 나눔
            int pivot = partition(numbers, left, right);

            // pivot 제외하고 왼쪽, 오른쪽 리스트 재귀 호출
            quickSort(numbers, left, pivot - 1);
            quickSort(numbers, pivot + 1, right);
        }
    }

    private int partition(int[] numbers, int left, int right) {
        int low = left;
        int high = right + 1;
        int pivot = numbers[left];

        do {
            // low 는 왼쪽에서 오른쪽으로 탐색해가다가 피벗보다 큰 데이터를 찾으면 멈춘다.
            do {
                low++;
            } while (low <= right && numbers[low] < pivot);

            // right 는 오른쪽에서 왼쪽으로 탐색해가다가 피벗보다 작은 데이터를 찾으면 멈춘다.
            do {
                high--;
            } while (high >= left && numbers[high] > pivot);

            // low 와 high 가 교차하지 않았으면, swap
            if (low < high) {
                swap(numbers, low, high);
            }
        } while (low < high); // low 와 high 가 교차될 때까지

        // low 와 high 가 교차했으면
        swap(numbers, left, high);

        return high;
    }

    private void swap(int[] numbers, int left, int right) {
        int temp = numbers[left];
        numbers[left] = numbers[right];
        numbers[right] = temp;
    }
}
