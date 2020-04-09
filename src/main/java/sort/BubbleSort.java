package sort;

public class BubbleSort implements Sort {

    public void sort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < numbers.length - 1; i++) { // 숫자 5개가 있음면, 총 4 라운드 수행
            for (int j = 0; j < n - i - 1; j++) { // 항상 시작은 0번째 부터. 몇번째 까지 비교할 것인가 : i + j = n --> j = n - i
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
