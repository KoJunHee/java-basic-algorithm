import org.junit.Test;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.QuickSort;
import sort.Sort;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    private int[] numbers = {7, 3, 1, 9, 4, 10};
    private int[] expected = {1, 3, 4, 7, 9, 10};

    @Test
    public void bubbleSortTest() {
        // given
        Sort bubbleSort = new BubbleSort();

        // when
        bubbleSort.sort(numbers);

        // then
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void insertionSortTest() {
        // given
        Sort insertionSort = new InsertionSort();

        // when
        insertionSort.sort(numbers);

        // then
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void quickSortTest() {
        // given
        Sort quickSort = new QuickSort();

        // when
        quickSort.sort(numbers);

        // then
        assertArrayEquals(expected, numbers);
    }
}
