package Hello_World;

/**
 * Created by coura on 30.03.2016.
 */
public class SortingAnArray {

    //Сортировка бульбашкой (по возрастанию)
    public static void bubbleSort(int[] array) {
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Сортировка бульбашкой (по убыванию)
    public static void bubbleSortReverse(int[] array) {
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //По возрастанию
    public class InsertionSortUtil {
        public static void insertionSort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j > 0 && array[j-1] > array[j]; j--) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
