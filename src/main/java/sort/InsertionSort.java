package sort;

public class InsertionSort implements Sort {

    public void sort(int[] numbers) {
        int length = numbers.length;

        for (int i = 1; i < length; i++) { // index 0 번째 key 는 이미 정렬되어 있음
            int key = numbers[i]; // 삽입할 숫자

            int j;
            for (j = i - 1; j >= 0 && numbers[j] > key; j--) {
                numbers[j + 1] = numbers[j]; // 오른쪽으로 이동
            }

            numbers[j + 1] = key;
        }
    }
}
