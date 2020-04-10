import org.junit.Test;
import search.BinarySearch;

import static org.junit.Assert.*;

public class SearchTest {
    private int[] numbers = {1, 2, 3, 4, 5, 6, 7};

    @Test
    public void binarySearch() {
        // given
        BinarySearch binarySearch = new BinarySearch();

        // when
        int keyIndex = binarySearch.search(numbers, 1);

        // then
        assertEquals(0, keyIndex);
    }
}
